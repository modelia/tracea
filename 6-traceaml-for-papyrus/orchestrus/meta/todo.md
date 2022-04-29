# Orchestrus

## Todo list

### Parse

- [x] XMI standards
  - Ecore specific
  - Genmodel specific
- [ ] Project config
  - build.properties
  - plugin.xml
    - --> profile description (name + path) to `"GlossaryML"`
    - --> Extension points
  - .project
    - --> subprojects references
  - MANIFEST.MF
  - .classpath
    - --> src entries (gen, custom, and referenced !)
  - build.properties
    - --> bin, src, out entries.
- [ ] Java files
  - get and resolve imports ?

### Run

- [ ] Extract References (hrefs)
  - [x] List folders (`Config.sourceFiles`)
  - [x] Separate source/local/external (protocol?!)
  - [x] Resolve source/local that can be solved
  - [ ] Sort out unresolvable -> UX for typing alternative ? (Storage ?)
- [ ] Extract Trace
  - [x] Extract Source/Local/External File artefact
    - [ ] Hardcoded typing "translation" in Config ?
  - [x] Build (multiended) links between Source/Local/External artefact
    - [ ] Source and Local: solve and use Xpath to  recover specific elements path
    - [ ] What about externals ? UX alternative ?
    --> solve grouping ?? Use plugin ID to convert plugin:// cases
  - [ ] Solve specific elements path
  - [ ] Directly where possible: source, resolvable File artefact.
    - [ ] With UX for external ?
- [x] Store Trace in JSon
  - [x] Trace init links (IDs)
  - [x] Artefacts
  - [x] Links
  - [x] Typing: artefacts & links -> EngineeringDomain !!
    - ("Translations" to  ApplicationDomain ?!)
  - [ ] Fragmentation: cluster Paths to shows dependency nests, like common ancestor in the tree (X)path.
  - [ ] WOT ELSE broo ?!!?

- [ ] Load trace
  - [ ] Types for artefacts and links (basically "names")
  - [ ] Artefacts & Fragments
  - [ ] Links

### Setup

- Config file
  - project = `com.cea.papyrus.glossary` --> plugin.xml
  - projectRoot = `R:\Coding\Git\orchestrus\data\GlossaryML-ReferenceML`
  - projectName = `GlossaryML` --> plugin.xml
  - projectDependencies = `com.cea.papyrus.referencemanagement` --> .project

- File extensions ?
  - Resolved conflictual FileArtefact paths
  - Link type "translations" btw EngTypes and AppTypes
  