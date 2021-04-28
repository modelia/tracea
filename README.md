<!--![Tracea](https://github.com/ebatot/git-test/blob/6324f41a99bcf4c6d536e457b8f0cf97a6b6040a/Logo-Tracea.png "UOC-SOM Tracea Project")-->
<img src="https://github.com/modelia/tracea/blob/6d37ddb6c7f56da40fae254ed6c62eed407c5b4f/Logo-Tracea.png" width=130 alt="UOC-SOM Tracea Project"/>

# Tracea
* [General info](#general-info)
* [Deliverables](#deliverables)
  * [D1 - Traceability survey and feature Model](#1-survey-of-traceability-techniques-with-a-focus-on-their-applications-in-ai-based-software-techniques)
  * [D2 - Traceability metamodel for quality tracing](#2-traceability-language----definition-and-editor)
  * [D3 - Evaluatioin and extension of traceability solutions](#3-traceability-solutions----evaluation-and-extension)
* [Content organisation](#content-organisation)

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
 * a protocol to evaluate the relevance and the robustness of solutions to traceability 
 * steps to extend tracers with quality aspects for trace links. 
 * the application of the protocol to Capra through our manual investigation. 
 * the integration of Tracea into Capra and the impact of the consecutive changes. 
 * we show the main conceptual and technical limitations of Capra. 




## Content organisation
 * Folder [`deliverables`](https://github.com/modelia/tracea/tree/master/deliverables) contains the three report for deliverables together with their respective Latex source code
    1. Survey of traceability techniques with a focus on their applications in AI-based software techniques
    2. Traceability language -- Definition and editor
    3. Traceability solutions -- Evaluation and extension

* Folder [`dsl-tracea`](https://github.com/modelia/tracea/tree/master/dsl-tracea) contains the software artefacts for the second deliverable : 
    * Tracea metamodel (ECore, OCL, Xtext grammar)
    * Tracea Xtext plugin for Eclipse (IDE plugin projects)
    * The running examples explained in the report (Transclusion)
    
 * Folder [`capra-integration`](https://github.com/modelia/tracea/tree/master/capra-integration) contains the software artefacts designed and implemented in the third deliverable
    * Commit [`d6c681af722767d8c447d8389e3f8d302e23d747`](https://github.com/modelia/tracea/commit/d6c681af722767d8c447d8389e3f8d302e23d747) reports the initial addition of Capra's source code 
    * Commit [`62d395559f0bab3950b6d8b7382427fe8022f22e`](https://github.com/modelia/tracea/commit/62d395559f0bab3950b6d8b7382427fe8022f22e) reports the minimal modification of Capra to integrate a confidence value for trace links
    * Commit [`830418d29e5acab9c547323b3d8addeddfd28e99`](https://github.com/modelia/tracea/commit/830418d29e5acab9c547323b3d8addeddfd28e99) reports the modification necessary to use the confidence value in the matrix viewer
    * Commit [`ee82ba268c741e3913266d3c21601806d6c9f0c5`](https://github.com/modelia/tracea/commit/ee82ba268c741e3913266d3c21601806d6c9f0c5) reports the modification necessary to use the confidence value in the PlantUML viewer
    * Commit [`3ec97548bc766459ebaa351fc672cf64ab6f1ccc`](https://github.com/modelia/tracea/commit/3ec97548bc766459ebaa351fc672cf64ab6f1ccc) reports the modification to augment the definition of confidence with values, Evidences and Agents
 
 * Folder [`publications`](https://github.com/modelia/tracea/tree/master/publications) contains publications (ongoing and published)
    * A Survey-Driven Feature Model for Traceability
    * (Not) Yet Another Metamodel
