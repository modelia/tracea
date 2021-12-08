
# SysML-JSon TraceaLibrary

## Library

The `TraceaLibrary` alone is available in [`/library`](https://github.com/modelia/tracea/tree/master/4-sysml-json-transformer/library) with two versions of the library: with tracetypes as _strings_ and as _enum literals_.

## Library example

A usage example of `TraceaLibrary` is given in [`/eDrone_example`](https://github.com/modelia/tracea/tree/master/4-sysml-json-transformer/eDrone_example).

* [`Graph visualization`](http://www-ens.iro.umontreal.ca/~batotedo/tracea/v1/d3json.html)
![Graphical visualization](http://www-ens.iro.umontreal.ca/~batotedo/tracea/imgs/visualization1.jpg)
* [`Matrix-based representation`](http://www-ens.iro.umontreal.ca/~batotedo/tracea/v1/eDrone_example_out.html)
![`Matrix-based visualization`](http://www-ens.iro.umontreal.ca/~batotedo/tracea/imgs/tracematrix1.jpg")

## Executable - JSonTransformer

`JSonTransformer.jar` is a runnable JAR file of [`JSonTransformer`](https://github.com/ebatot/TraceaingJson). The version of the JAR corresponds to the module [`/TraceaingJSon @ 2109c56`](https://github.com/ebatot/TraceaingJson/tree/2109c562598807b8b7797af3b9dd5f54fc5c5202).

## Transformation example

`JSonTransformer` transforms a SysML model annotated with `TraceaLibrary` into three distinct representations of the model: a graphical representation using D3-JSon, a matrix-based representation and a SysML textual representation. See [`/eDrone_out`](https://github.com/modelia/tracea/tree/master/4-sysml-json-transformer/eDrone_out) for an example.
