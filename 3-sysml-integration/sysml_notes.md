# Indicative notes about the SysML ecosystem

## Architecture

### Root

Root provides the most general syntactic capabilities of the language: Elements and Relationships between them,
Annotations of Elements, and Membership of Elements in Namespaces. Namespaces can assign unique names to
Namespace members, but support multiple aliases per Element. They also support Import of Elements from other
Namespaces, enabling an Element to have a different name when imported. [KerML doc]

`Element Annotations Namespaces (& Relationships !)`
*No semantics*

`Annotations`: *An Annotation is a Relationship between an Element and an AnnotatingElement that provides additional information about the Element being annotated. Each Annotation is between a single AnnotatingElement and a single Element being annotated, but an AnnotatingElement may have multiple Annotation Relationships with different annotatedElements, and any Element may have multiple Annotations.*

*An `AnnotatingElement` is an Element that is used to provide additional information on other elements. An
Annotation is a Relationship between an annotating element and an element that is being described. An annotated
element can annotate multiple elements, and each element can have multiple annotations.*

### Core

The Core layer specializes the Root layer to add the minimum modeling constructs for specifying systems as they
are build or operate (that have semantics). *Semantics* is about alignment of models and the things being modeled
(real, simulated, or imagined things of any kind, including objects, links between them, and performances of
behaviors). Models give conditions for how things should be (a specification of things), or for a model to be an
accurate reflection of things (an explanation or record of things). [KerML doc]

`Types Classifiers Features`

### Kernel

The Kernel layer completes the KerML metamodel. It specializes Core to add application-independent modeling
capabilities beyond basic classification. These distinguish structure (things and limits on how they change over time)
from processes (how things change over time). Structural elements include Classes and DataTypes (kinds of things),
Associa    tions between them, and Connectors (usages of Associations). [KerML doc]

`Classification Structures Assocations ...`

*Metadata is additional information on `Elements` of a model that does not have any instance-level semantics (in the sense described in 7.3.1.1). In general, metadata is specified in `AnnotatingElements` (including `Comments` and `TextualRepresentations`) attached to `annotatedElements` using `Annotation` `Relationships` (see 7.2.3). An `AnnotatingFeature` is a kind of `AnnotatingElement` that allows for the definition of structured metadata with modeler-specified attributes. This may be used, for example, to add tool-specific information to a model that can be relevant to the function various kinds of tooling that may use or process a model, or domain-specific information relevant to a certain project or organization. An `AnnotatingFeature` is syntactically a `Feature` (see 7.3.4) that is typed by a single `DataType` (see 7.4.2), with implicit multiplicity 1..1. If the `DataType` has no features, then the `AnnotatingFeature` simply acts as a userdefined syntactic tag on the `annotatedElement`. If the `DataType` has features, then the AnnotatingFeature must have nested features that redefine each of the features of its type, binding them to the results of model-level evaluable Expressions (see 7.4.8), which provide the values of the specified attributive metadata for the annotatedElement.*

### System

The SysML metamodel reuses basic elements from the KerML Root that includes Element and Relationship. All
other KerML and SysML model elements are extensions of these basic elements.
An element has a unique identifier. Elements can have a name and any number of aliases.
A relationship is a kind of element that relates other elements. Some relationships are constrained to have two ends
(i.e., binary relationship) while others are not (e.g., Association and Connector in the Kernel, Dependency and
Expose in SysML). The ends on relationships are ordered. A directed relationship designates its ends as sources and
and targets.  [SysML doc]

`Actions analyses Attributes Interfaces Requirements ...`

## Inner structure

### Grammars

KerML, KerMLExpressions and SysML Xtexts files provides a concrete syntax to model systems at their exact level of abstraction. They all rely on the SysMLv2 abstract syntax. KerML offers conceptual representations for Root, Core, and Kernel level language expressions. KerMLExpression offers a basis to render most of the classical mathematical expressions (*e.g.*, power, speed, Fourier?) and operators (*e.g.*, +, *, =, &, ^).

### Libraries

Libraries offers a set of semantically rich instances of the languages.

- `SysML.library Library` Contains textual representations for kernel as well as system elements. It also contains Quantities and Units for international standards, and grammatical constructions related to the expression of Geometry (and Analysis??).

- `KerML Library` & `SysML Library` contains example of usages of textual representation related to respective languages.

### Metadata
