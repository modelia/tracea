
ANIMATIONS_TIMEOUT_DURATION = 2500;
var setuptPath = "data/setup.tracea.json"
var setup = (function () {
    var json = null;
    $.ajax({
        'async': false,
        'global': false,
        'url': setuptPath,
        'dataType': "json",
        'success': function (data) {
            json = data;
        }
    });
    return json;
})(); 

var projectName = setup.setup.config['project.name'];


var dataPath = "data/clustering.tracea.json"
//if ( getUrlVars()['clust'] != null )
//    dataPath = getUrlVars()['clust']; 

var jsonContent = (function () {
    var json = null;
    $.ajax({
        'async': false,
        'global': false,
        'url': dataPath,
        'dataType': "json",
        'success': function (data) {
            json = data;
        }
    });
    return json;
})(); 



// 2. render tree structure -- you may make number of sections dynamic insteaf of fixed
clustertree = document.getElementById('clustertree');
var json = JSON.parse(JSON.stringify(jsonContent));
clustertree.innerHTML = renderClusterList(json);

function renderClusterList(json) {
    jsonText =  '<ul> '+projectName;
    jsonText +=  "<li><a id='traceLinksName' href='index.html'>Trace links</a> <li>"
    jsonText +=  "<li><a id='traceFragName' href='index.html?imf=data/input_data.json'>Fragmentation</a>"
    + "&nbsp;<span id='fatOn' onClick='toggleAncestryTrace()'>(Paths)</a></span>"
                +"</li>"
    jsonText += "</ul>"
    for (var algorithm in json) {
        // KSpan, Label, Newman... Or setup ! Avoid setup.
        if(algorithm === 'setup')
            continue;
        jsonText += '<ul>' + algorithm//.setup.algorithm;
        for(var cluster in json[algorithm].clusters) {
            clusterName = json[algorithm].clusters[cluster].name;

            nArtefacts = json[algorithm].clusters[cluster].artefacts.length;

            var target = "index.html?imf=data/"+projectName+"/clusters/"+clusterName+".tracea.d3.json"
            jsonText += "<li id=\"cluster"+clusterName+"\" class=\"clusterName\">"
                + "<a href='#' onClick='loadCluster(\""+clusterName+"\", \""+projectName+"\", \""+algorithm+"\")'>"+clusterName+'&nbsp;('+nArtefacts+')</a>' 
                + "<a href='"+target+"' target='_blank' rel='noopener noreferrer'>&nbsp;⇗</a>"
                + "</li>"
        }
        jsonText += '</ul>'
    }
    return jsonText;
}

function getUrlVars() {
    var vars = {};
    var parts = window.location.href.replace(/[?&]+([^=&]+)=([^&]*)/gi, function(m,key,value) {
        vars[key] = value;
    });
    return vars;
}
