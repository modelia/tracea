# Tracea - SysML metadata feature library

This folder contains SysML models and JupyterLab Notebooks for the definition of `TraceaLibrary`.
They exist in two tracetyping alternative (file names with `enum` or `string`).

## SysmML model

The file `TraceaLibrary-enum.sysml` contains a SysML definition for a tracing library (as metadata features).
In this version **tracetypes are explicitly typed into an enum's literals** (see lines 70 and 71, with _Engineering domain_ and _Application domain_ types).

The file `TraceaLibrary-string.sysml` contains _the same_ SysML definition for a tracing library (as metadata features).
In this version **tracetypes are raw string**. Beware of misspelling !

## SysML example

Files  `TraceaLibrary-enum-example.sysml` and `TraceaLibrary-string-example.sysml` contain usage examples of `TraceaLibrary`. They are as their name mentions the same example, written in both tracetyping alternatives (see [`above`]('##sysml-model')).
The example shows **named** connections between parts, features, and requirement of an eDrone simulator (or the like).

## JupyterLab Notebook

The files  `TraceaLibrary-enum.ipynb` adn `TraceaLibrary-string.ipynb` contain [`JupiterLab`](https://www.sysmlv2lab.com/lab) notebooks of `TraceaLibrary`. They contain a library definition, a system definition (eDrone) and a metadata usage example. As their name mentions the two tracetyping alternatives are used separately (see [`above`]('##sysml-model')).
