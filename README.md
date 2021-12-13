<!--![Tracea](https://github.com/ebatot/git-test/blob/6324f41a99bcf4c6d536e457b8f0cf97a6b6040a/Logo-Tracea.png "UOC-SOM Tracea Project")-->

<img src="https://github.com/modelia/tracea/blob/6d37ddb6c7f56da40fae254ed6c62eed407c5b4f/Logo-Tracea.png" width=130 alt="UOC-SOM Tracea Project"/>

# Tracea

* [General info](#general-info)
* [Deliverables](#deliverables)
  * [D1 - Traceability survey and feature Model](#1-survey-of-traceability-techniques-with-a-focus-on-their-applications-in-ai-based-software-techniques)
  * [D2 - Traceability metamodel for quality tracing](#2-traceability-language----definition-and-editor)
  * [D3 - Evaluation and extension of traceability solutions](#3-traceability-solutions----evaluation-and-extension)
  * [D4 - Evaluation and extension of SysMLv2 for quality traceability](#4-traceability-integration----sysmlv2)
  * [D5 - Visualizable and propagable SysMLv2 traces for metadata analysis](#5-traceability-visualization-and-propagation----SysMLv2)
* [Software artefact](#software-artefact)
  * [Tracea DSL](#1-dsl-tracea)
  * [Integration to Capra](#2-capra-integration)
  * [Integration to SysML](#3-sysml-integration)
  * [Propagation and metdata analysis](#4-sysml-json-transformer)
* [Deliverables and publications](#deliverables-and-publications)
  * [Deliverables](#8-deliverables)
  * [Publications](#9-publications)

## General info

This project is aimed at addressing traceability current solutions' limitations.
Tracea considers traceability as a prominent software quality attribute.
Indeed, tracing has been applied extensively in the history of software but the inherent
knowledge derived from those experiences remains scattered among various software engineering fields.
Tracea offers to consider the quality of the traces themselves to foster the role of tracers in the
software developement process.

## Deliverables

### 1. Survey of traceability techniques with a focus on their applications in AI-based software techniques

The content of this document is a scientific report on the conjunct use of traceability, modelling, and
AI, with a scrutiny on the potential such techniques could bring to AI-enabled system architecture.

It contains the description of the state-of-the-art, a linguistic metamodel, and a feature model of
traceability research and industrial applications.

### 2. Traceability language -- Definition and editor

This document corresponds to Deliverable 2. The core
contribution of this document is a domain-specific language (DSL) for traceability, expressive enough
to cover all the potential traceability applications we have discussed during this project.

More specifically, we include a short reminder of the terminology we use in the DSL, the definition
of both the abstract (i.e., metamodel) and concrete syntax (a JSON-based representation),
and an Ecore implementation of the DSL in an Eclipse plugin. We illustrate the usability of the DSL
with a running example: the transclusion of model elements in certification documents.

### 3. Traceability solutions -- Evaluation and extension

The core contribution of this third contribution is an evaluation protocol for solutions to traceability
(or tracers) and its specific application to an existing solution: [Capra](https://www.eclipse.org/capra).
The protocol features the evaluation of tracers together with the integration of quality concerns for
traceability artefacts.
In this third deliverable, we integrate parts of Tracea to extend and complete Capra.

More specifically, this deliverable is made of

* a protocol to evaluate the relevance and the robustness of solutions to traceability.
* steps to extend tracers with quality aspects for trace links.
* the application of the protocol to Capra through our manual investigation.
* the integration of Tracea into Capra and the impact of the consecutive changes.
* we show the main conceptual and technical limitations of Capra.

### 4. Traceability integration -- SysMLv2

This report presents the integration of the concepts related to traceability developed
during these first three deliverables within SysMLv2. And more precisely, modification target the [Eclipse pilot implementation of SysMLv2](https://github.com/Systems-Modeling/SysML-v2-Pilot-Implementation).

In particular, this deliverable contains

* an introduction to the KerML / SysML ecosystem with a presentation of high level concepts.
* the presentation of the different strategies we explored to integrate Tracea into this ecosystem.
  * root level adaptations
  * a type of annotation dedicated to tracing
  * a new type of annotating feature
  * a feature library for trustable traceability
* the definition of a metadata feature library for trustable traceability.

### 5. Traceability visualization and propagation -- SysMLv2

The fifth deliverable contains a tool suite to analysis tracing metadata in SysMLv2 models. In particular, three main components have been added to Tracea:

* [`TraceaingJSon`]('https://github.com/ebatot/TraceaingJson') is a Java plugin that takes as input an annotated SysMLv2 model written in JSon. This format is obtained through the _export_ magic function of JupyterLab and Eclipse Pilot Implementation environment. As ouput, TraceaingJSon yields:
  * a `Tracea-JSon representation` of the SysML model's connections and associated metadata.
  * a `D3-JSon representation` to allow a graphical visualization of the tracelinks.
  * an HTML version of the matrix-based representation.
* A [`_D3 script_`](http://www-ens.iro.umontreal.ca/~batotedo/tracea/v1/) for graphical (and interactive) representation.
* The [`deliverable`](https://github.com/modelia/tracea/blob/master/8-deliverables/Tracea_Deliverable_5_CEA.pdf) contains general guide lines to build your own scenario.
* A new version of `TraceaLibrary`, a metadata feature library for SysMLv2
* An example of usage: `_eDrone scenario_`.

Implementation decisions and details can be found in the report.
_(Note that the period has seen the publication of two papers. They can be found in the eponym folder.)_

## Software artefacts

### [`1-dsl-tracea`](https://github.com/modelia/tracea/tree/master/1-dsl-tracea)

contains the software artefacts for the second deliverable:

* Tracea metamodel (ECore, OCL, Xtext grammar)
* Tracea Xtext plugin for Eclipse (IDE plugin projects)
* The running examples explained in the report (Transclusion)

### [`2-capra-integration`](https://github.com/modelia/tracea/tree/master/2-capra-integration)

contains the software artefacts designed and implemented in the third deliverable:

* Commit [`d6c681af722767d8c447d8389e3f8d302e23d747`](https://github.com/modelia/tracea/commit/d6c681af722767d8c447d8389e3f8d302e23d747) reports the initial addition of Capra's source code
* Commit [`62d395559f0bab3950b6d8b7382427fe8022f22e`](https://github.com/modelia/tracea/commit/62d395559f0bab3950b6d8b7382427fe8022f22e) reports the minimal modification of Capra to integrate a confidence value for trace links
* Commit [`830418d29e5acab9c547323b3d8addeddfd28e99`](https://github.com/modelia/tracea/commit/830418d29e5acab9c547323b3d8addeddfd28e99) reports the modification necessary to use the confidence value in the matrix viewer
* Commit [`ee82ba268c741e3913266d3c21601806d6c9f0c5`](https://github.com/modelia/tracea/commit/ee82ba268c741e3913266d3c21601806d6c9f0c5) reports the modification necessary to use the confidence value in the PlantUML viewer
* Commit [`3ec97548bc766459ebaa351fc672cf64ab6f1ccc`](https://github.com/modelia/tracea/commit/3ec97548bc766459ebaa351fc672cf64ab6f1ccc) reports the modification to augment the definition of confidence with values, Evidences and Agents

### [`3-sysml-integration`](https://github.com/modelia/tracea/tree/master/3-sysml-integration)

contains the software artefacts for the forth deliverable:

* SysML Ecosystem cheat sheet  
* SysML Tracea metadata feature library (SysML model and JupiterLab bloc note)
* Example case with both Enums and String trace types

### [`4-sysml-json-transformer`](https://github.com/modelia/tracea/tree/master/4-sysml-json-transformer)

contains the software artefacts for the fifth deliverable:

* JSonTransformer (Jar and [`Git repository`](https://github.com/ebatot/TraceaingJson/tree/2109c562598807b8b7797af3b9dd5f54fc5c5202))
* SysML Tracea metadata feature library for Enum and String type representations (SysML models and JupiterLab bloc notes)
* D3 script for graphical visualization
* eDrone example (sysml, iynb)

## Deliverables and publications

### [`8-deliverables`](https://github.com/modelia/tracea/tree/master/8-deliverables)

contains the reports for deliverables together with their respective Latex source code:

1. [`Survey of traceability techniques`](https://github.com/modelia/tracea/blob/master/8-deliverables/Tracea_Deliverable_1_CEA.pdf) with a focus on their applications in AI-based software techniques
2. [`Traceability language -- Definition and editors`](https://github.com/modelia/tracea/blob/master/8-deliverables/Tracea_Deliverable_2_CEA.pdf) An Xtext project generated from ECore language artefacts.
3. [`Traceability solutions -- Evaluation and extensions`](https://github.com/modelia/tracea/blob/master/8-deliverables/Tracea_Deliverable_3_CEA.pdf) Guidelines to evaluate a traceability solutions, extension to Explainable traces.
4. [`Trustable traceability for SysMLv2s`](https://github.com/modelia/tracea/blob/master/8-deliverables/Tracea_Deliverable_4_CEA.pdf) A metadata feature library dedicated to tracing SysMLv2 connections.
5. [`Visualizable and propagable SysMLv2 traces for metadata analysiss`](https://github.com/modelia/tracea/blob/master/8-deliverables/Tracea_Deliverable_5_CEA.pdf) A tool suite to extract, visualize (and some day, hopefully, edit) trace artefacts from a SysMLv2 model.

### [`9-publications`](https://github.com/modelia/tracea/tree/master/9-publications)

* [`(Not) Yet Another Metamodel for Traceability`](https://github.com/modelia/tracea/blob/master/9-publications/traceability-feature-model.pdf), published at [`SAM'21`](https://sdl-forum.org/Events/SAM2021/index.htm)
