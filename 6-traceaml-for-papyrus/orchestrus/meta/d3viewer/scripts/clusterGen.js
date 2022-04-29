

var selected;
var showFocus = function () {
    selected.firstElementChild.style.color = "SlateBlue";
}
var hideFocus = function () {
    selected.firstElementChild.style.color = "";
}
var clickSelected = function () {
    selected.firstElementChild.click();
}
var gotoPrevSibling = function () {
    hideFocus();
    if (selected.previousElementSibling) { selected = selected.previousElementSibling; }
    else if (selected.parentElement.previousElementSibling) {
        liElems = selected.parentElement.previousElementSibling.getElementsByTagName("li");
        if (liElems.length) { selected = liElems[0]; }
    }
    showFocus();
};
var gotoNextSibling = function () {
    hideFocus();
    if (selected.nextElementSibling) { selected = selected.nextElementSibling; }
    else if (selected.parentElement.nextElementSibling) {
        liElems = selected.parentElement.nextElementSibling.getElementsByTagName("li");
        if (liElems.length) { selected = liElems[0]; }
    }
    showFocus();
}
var gotoFirstChild = function () {
    hideFocus();
    firstSub = selected.getElementsByTagName("ul")[0];
    if (firstSub) {
        selected = firstSub.getElementsByTagName("li")[0];
    }
    showFocus();
}
var gotoParent = function () {
    hideFocus();
    if (selected.parentElement && selected.parentElement.parentElement && selected.parentElement.parentElement.id != "tree") {
        selected = selected.parentElement.parentElement;
    }
    showFocus();
}
var onLoad = function() {
    // 1. HTML document title
    
    
    var dataPath = "data/GlossaryML/clusters/clustering.tracea.json"
    if ( getUrlVars()['imf'] != null )
        dataPath = getUrlVars()['imf']; 
    
    
    
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


    var projectName = jsonContent.setup.projectName;

    document.getElementById('title').innerHTML = "Tracing (" + projectName + ")";
    
    // 2. render tree structure -- you may make number of sections dynamic insteaf of fixed
    section1 = document.getElementById('section1');
    section1.innerHTML = renderJSON(JSON.parse(JSON.stringify(jsonContent)));
    
    //Organize sections and content display.

   
    // 3. selection box, default on the first item on the tree
    selected = document.getElementById('tree').firstElementChild.getElementsByTagName("li")[0];
    showFocus();

    // 4. click handlers
    var treeListItems = document.querySelectorAll('ul.tree a');
    for (var i = 0; i < treeListItems.length; i++) {
        // click handler
        treeListItems[i].addEventListener('click', function(e) {
            var parent = e.target.parentElement;
            hideFocus();
            selected = parent;
            showFocus();
            var classList = parent.classList;
            if (classList.contains("open")) { // close the element and its children
                classList.remove('open');
                var openChildrenList = parent.querySelectorAll(':scope .open');
                for (var j = 0; j < openChildrenList.length; j++) {
                    openChildrenList[j].classList.remove('open');
                }
            } else { // open the element
                classList.add('open');
            }
        });
    }

    // 5. keyboard handler
    document.addEventListener('keydown', function(e) {
            switch (e.key) {
                case "Enter": case " ":
                    actExpandCollapse();
                    break;
                case "ArrowDown":
                    gotoNextSibling();
                    break;
                case "ArrowUp":
                    gotoPrevSibling();
                    break;
                case "ArrowRight":
                    if (selected.classList.contains("open") === false) { clickSelected(); }
                    gotoFirstChild();
                    break;
                case "ArrowLeft":
                    if (selected.classList.contains("open") === true) { clickSelected(); }
                    gotoParent();
                    break;
            }
        });
};

var expandAll = function() {
    var allListItems = document.querySelectorAll('ul.tree li');
    for (var k = 0; k < allListItems.length; k++) {
        allListItems[k].classList.add("open");
    }
};
var collapseAll = function() {
    window.location.reload();
};
var EXPAND_ALL = "Expand All";
var COLLAPSE_ALL = "Collapse All";
var actExpandCollapse = function() {
    var botton = document.getElementById("expand");
    if (botton.innerHTML === EXPAND_ALL) {
        expandAll();
        botton.innerHTML = COLLAPSE_ALL;
    } else {
        collapseAll();
        botton.innerHTML = EXPAND_ALL;
    }
};

function renderJSON(obj) {
    var keys = [];
    var objIsArray = Array.isArray(obj); // check if [..] array. Otherwise, it is an ordinary {..} object
    jsonText = "";
    for (var key in obj) {
        if (typeof obj[key] === 'object') {
            if (objIsArray === false) { jsonText += "<li><a href='#'>" + key + "</a><ul>"; }
            jsonText += renderJSON(obj[key]);
            if (objIsArray === false) { jsonText += "</ul></li>"; }
        } else { // obj[key] not object, e.g. just a number or string, or empty
            if (objIsArray === false) {
                jsonText += "<li><a href='#'>" + key;
                if (obj[key]) { jsonText += ": " + obj[key]; }
                jsonText += "</a></li>";
            } else {
                jsonText += "<li><a href='#'>";
                if (obj[key]) { jsonText += obj[key]; } else { jsonText += "(empty)"; }
                jsonText += "</a></li>";
            }
        }
        keys.push(key);
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
