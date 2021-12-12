//var graph = d3.json("sample.json", function( d ){
//	console.log(d);
//});

var CIRCLE_SIZE = [10, 15];

var svg = d3.select("svg"),
    width = +svg.attr("width"),
    height = +svg.attr("height");

// Call zoom for svg container.
svg.call(d3.zoom().on('zoom', zoomed));

var color = d3.scaleOrdinal(d3.schemeCategory20);


//d3.forceLink().distance(function(d) {return d.distance;}).strength(0.1)

var simulation = d3.forceSimulation()
    .force("link", d3.forceLink())
    .force("charge", d3.forceManyBody().strength([-200]).distanceMax([200])) //120 500
    .force("center", d3.forceCenter(width / 2, height / 2))
	 .force('collision', d3.forceCollide().radius(function(d) {
    return d.radius*5
  }));

var container = svg.append('g');

// Create form for search (see function below).
/*var search = d3.select("body").append('center').append('form').attr('onsubmit', 'return false;');

var box = search.append('input')
	.attr('type', 'text')
	.attr('id', 'searchTerm')
	.attr('placeholder', 'Type to search...');

var button = search.append('input')
	.attr('type', 'button')
    .attr('value', 'Search')
    .on('click', function () { searchNodes(); });*/

// Toggle for ego networks on click (below).
var toggle = 0;

var dataPath = "https://keithmcnulty.github.io/game-of-thrones-network/json/got_network.json"
var dataPath = "data_eDrone.json"


d3.json(dataPath, function(error, graph) {
  if (error) throw error;


/** Counting groups, for color rendering **/

    // load legend names from type column
    var legendNames = [];
    var map = new Map();
	var i = 0; // Fill up th i to continue counting when legending the links.
    for (var item of graph.nodes) {
        if(!map.has(item.group)){
            map.set(item.group, true);    // set any value to Map
            legendNames.push({
                id: item.group,
                type: item.type //item.type vs label_data //TODO
            });
			i = i+1;
        }
    }
	var nGroups = legendNames.length; //Number of groups of nodes

    var map = new Map();
    for (var item of graph.links) {
        if(!map.has(item.group + i)){
            map.set(item.group + i, true);    // set any value to Map
            legendNames.push({
                id: item.group + i,
                type: item.type 
            });
        }
    }
	var lGroups = nGroups - legendNames.length; // Number of groups of links
/** END ocunting groups **/


	var edges = [];
	graph.links.forEach(function(e) { 
		// Get the source and target nodes
		var sourceNode = graph.nodes.filter(function(n) { return n.id === e.source_id; })[0],
			targetNode = graph.nodes.filter(function(n) { return n.id === e.target_id; })[0];

		e.source = sourceNode;
		e.target = targetNode;
		// Add the edge to the array
		edges.push({source: sourceNode, target: targetNode});
	});
	
/** Neighboor matrix in str **/
  // Make object of all neighboring nodes.
  var linkedByIndex = {};
  graph.links.forEach(function(d) {
	  linkedByIndex[d.source + ',' + d.target] = 1;
	  linkedByIndex[d.target + ',' + d.source] = 1;
  });

/** Access to matrix **/
  // A function to test if two nodes are neighboring.
  function neighboring(a, b) {
	  return linkedByIndex[a.index + ',' + b.index];
  }


  // Linear scale for degree centrality.
  var degreeSize = d3.scaleLinear()
  	.domain([d3.min(graph.nodes, function(d) {return d.size; }),d3.max(graph.nodes, function(d) {return d.size; })])
  	.range([CIRCLE_SIZE[0],CIRCLE_SIZE[1]]);


/** DEGREE vs size ! */
  // Collision detection based on degree centrality.
  simulation.force("collide", d3.forceCollide().radius( function (d) { return degreeSize(d.size); }));

  var link = container.append("g")
      .attr("class", "links")
    .selectAll("line")
    .data(graph.links, function(d) { return d.source + ", " + d.target;})
    .enter().append("line")
      .attr('class', 'link')
      .style('stroke', d => color(d.group+nGroups))
	  .style('stroke-width', function(d) { return d.confidence / 10 });

/*link.append("text")
    .text(function (d) { return d.name + ", " + d.confidence; })
    .style("text-anchor", "top middle")
	.style("y", '20px')
    .style("fill", "#555")
    .style("font-family", "Arial")
    .style("font-size", 12);*/


  var node = container.selectAll(".node")
    .data(graph.nodes)
    .enter()
    .append("g")
    .attr("class", "node");
   
  node.append("circle")
    // Calculate degree centrality within JavaScript.
    // .attr("r", function(d, i) { count = 0; graph.links.forEach(function(l) { if (l.source == i || l.target == i) { count += 1;}; }); return count;})
    // Use degree centrality from R igraph in json.
    .attr('r', function(d, i) { return degreeSize(d.size); })
    .attr('cx', d => d.x)
    .attr('cy', d => d.y)
    // Color by group, a result of modularity calculation in R igraph.
      .attr("fill", function(d) { return color(d.group); })
      .attr('class', 'node')
      // On click, toggle ego networks for the selected node.
      .on('click', function(d, i) {
	      if (toggle == 0) {
		      // Ternary operator restyles links and nodes if they are adjacent.
		      d3.selectAll('.link').style('stroke-opacity', function (l) {
			      return l.target == d || l.source == d ? 1 : 0.1;
		      });
		      d3.selectAll('.node').style('opacity', function (n) {
			      return neighboring(d, n) ? 1 : 0.1;
		      });
		      d3.select(this).style('opacity', 1);
		      toggle = 1;
	      }
	      else {
		      // Restore nodes and links to normal opacity.
		      d3.selectAll('.link').style('stroke-opacity', '0.6');
		      d3.selectAll('.node').style('opacity', '1');
		      toggle = 0;
	      }
      })
      .call(d3.drag()
          .on("start", dragstarted)
          .on("drag", dragged)
          .on("end", dragended));
		  
		  
  node.append("text")
    .text(function (d) { return d.name; })
    .style("text-anchor", "top middle")
	.style("y", '20px')
    .style("fill", "#555")
    .style("font-family", "Arial")
    .style("font-size", 12);
	

  node.append("title")
    .text(d => d.name);
	

  simulation
      .nodes(graph.nodes)
      .on("tick", ticked);


	console.log("simulation start...");


  simulation.force("link")
      .links(graph.links);
	  
	console.log("...simulation done");

  function ticked() {
    link
        .attr("x1", function(d) { return d.source.x; })
        .attr("y1", function(d) { return d.source.y; })
        .attr("x2", function(d) { return d.target.x; })
        .attr("y2", function(d) { return d.target.y; });

        node.attr("transform", function(d) { return "translate(" + d.x + "," + d.y + ")"; });
    node
        .attr("transform", d => "translate(" + d.x + "," + d.y + ")");

  }
	


/****************************************
                    SLIDER
****************************************/

  	// A slider that removes nodes below the input threshold.
	var slider = d3.select('body').append('p').append('center').text('Minimum confidence for connection: ').style('font-size', '60%');

	slider.append('label')
		.attr('for', 'threshold')
        .text('1').style('font-weight', 'bold')
        .style('font-size', '120%');
	slider.append('input')
		.attr('type', 'range')
		.attr('min', 1)
		.attr('max', 100) //d3.max(graph.links, function(d) {return d.confidence; }) / 2
		.attr('value', 1)
		.attr('id', 'threshold')
		.style('width', '50%')
		.style('display', 'block')
		.on('input', function () { 
			var threshold = this.value;

			d3.select('label').text(threshold);

			// Find the links that are at or above the threshold.
			var newData = [];
			graph.links.forEach( function (d) {
				if (d.confidence >= threshold) {newData.push(d); };
			});

			// Data join with only those new links.
			link = link.data(newData, function(d) {return d.source + ', ' + d.target;});
			link.exit().remove();
			var linkEnter = link.enter().append('line').attr('class', 'link')
								.style('stroke', d => color(d.group));
			link = linkEnter.merge(link);

			node = node.data(graph.nodes);

			// Restart simulation with new link data.
			simulation
				.nodes(graph.nodes).on('tick', ticked)
				.force("link").links(newData);

			simulation.alphaTarget(0.1).restart();

		});

    
	
/***************
     Legend
***************/

    // add a legend
    var legend = d3.select("#legend")
        .append("svg")
        .attr("class", "legend")
        .attr("width", 180)
        .attr("height", 200)
        .selectAll("g")
        .data(color.domain())
        .enter()
        .append("g")
        .attr("transform", function(d, i) {
        return "translate(0," + i * 20 + ")";
        });
    
    legend.append("rect")
        .attr("width", 18)
        .attr("height", 18)
        .style("fill", color);

    // append text to legends
    legend.append("text")
        .data(color.domain())
        .attr("x", 24)
        .attr("y", 9)
        .attr("dy", ".35em")
        .text(function(d) {
        return legendNames.find(x => x.id === d).type; 
        })
        .style('font-size', 10);
		
	
   

    // add photos to all legend names except two
    var photos = legendNames.filter(x => x.type !== 'THE FIVE DWARFS' && x.type !== 'BLACK JACK, KEGS & MULLY');

   // var imgPath = 'https://keithmcnulty.github.io/game-of-thrones-network/img/'
    
   photos.forEach(d => {

        node.filter(x => x.name === d.type)
            .append("defs")
            .append("pattern")
            .attr('id', d => 'image-' + d.name)
            .attr('patternUnits', 'userSpaceOnUse')
            .attr('x', d => -degreeSize(d.size))
            .attr('y', d => -degreeSize(d.size))
            .attr('height', d => degreeSize(d.size) * 2)
            .attr('width', d => degreeSize(d.size) * 2);
            //.append("image")
            //.attr('height', d => degreeSize(d.size) * 2)
           // .attr('width', d => degreeSize(d.size) * 2);
           // .attr('xlink:href', d => imgPath + d.name.toLowerCase() + '.png')
        
        /*node.filter(x => x.name === d.groupName)
            .append("circle")
            .attr('r', d => 0.9 * degreeSize(d.degree))
            //.attr('fill', d => 'url(#image-' + d.name + ')')
			;*/
        
            
        })
    });

function dragstarted(d) {
  if (!d3.event.active) simulation.alphaTarget(0.3).restart();
  d.fx = d.x;
  d.fy = d.y;
}

function dragged(d) {
  d.fx = d3.event.x;
  d.fy = d3.event.y;
}

function dragended(d) {
  if (!d3.event.active) simulation.alphaTarget(0);
  d.fx = null;
  d.fy = null;
}

// Zooming function translates the size of the svg container.
function zoomed() {
	  container.attr("transform", "translate(" + d3.event.transform.x + ", " + d3.event.transform.y + ") scale(" + d3.event.transform.k + ")");
}

// Search for nodes by making all unmatched nodes temporarily transparent.
function searchNodes() {
	var term = document.getElementById('searchTerm').value;
	var selected = container.selectAll('.node').filter(function (d, i) {
		return d.name.toLowerCase().search(term.toLowerCase()) == -1;
	});
	selected.style('opacity', '0');
	var link = container.selectAll('.link');
	link.style('stroke-opacity', '0');
	d3.selectAll('.node').transition()
		.duration(5000)
		.style('opacity', '1');
	d3.selectAll('.link').transition().duration(5000).style('stroke-opacity', '0.6');
}