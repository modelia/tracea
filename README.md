![alt text](https://github.com/ebatot/git-test/blob/6324f41a99bcf4c6d536e457b8f0cf97a6b6040a/Logo-Tracea.png "UOC-SOM Tracea Project")
# Tracea

* [General info](#general-info)
* [Deliverables](#deliverables)
* [Content organisation](#contentorganisation)

## General info
This project is aimed at addressing traceability current solutions' limitations.
	
## Deliverables
1. Survey of traceability techniques with a focus on their applications in AI-based software techniques
2. Traceability language -- Definition and editor
3. Traceability solutions -- Evaluation and extension

## Content organisation
 * Folder `dsl-tracea` contains the software artefacts for the second deliverable : 
    * Tracea metamodel (ECore, OCL, Xtext grammar)
    * Tracea Xtext plugin for Eclipse (IDE plugin projects)
    * The running examples explained in the report (Transclusion)
    
 * Folder `capra-integration` contains the software artefacts designed and implemented in the third deliverable
    * Commit `d6c681af722767d8c447d8389e3f8d302e23d747` reports the initial addition of Capra's source code 
    * Commit `62d395559f0bab3950b6d8b7382427fe8022f22e` reports the minimal modification of Capra to integrate a confidence value for trace links
    * Commit `830418d29e5acab9c547323b3d8addeddfd28e99` reports the modification necessary to use the confidence value in the matrix viewer
    * Commit `ee82ba268c741e3913266d3c21601806d6c9f0c5` reports the modification necessary to use the confidence value in the PlantUML viewer
    * Commit `3ec97548bc766459ebaa351fc672cf64ab6f1ccc` reports the modification to augment the definition of confidence with values, Evidences and Agents
 * Folder `deliverables` contains the three report for deliverables
 * Folder `publications` contains publications (ongoing and published)
    * A Survey-Driven Feature Model for Traceability
    * (Not) Yet Another Metamodel
