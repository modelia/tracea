# LaTeX template for SOM-Research reports

Repository containing the template for reports of the SOM-Research Lab group.
A document demonstrating the template can be downloaded from [https://github.com/SOM-Research/report-latex-template/raw/master/demo.pdf](https://github.com/SOM-Research/report-latex-template/raw/master/demo.pdf)

# Document conventions

* LaTeX files in this repository do not use tabs for indentation, but two spaces instead (see `.editorconfig`).
* Only one sentence per line is written to ease forward/backward search (this kind of search is done on a per-line basis).

# Build details

This project **MUST** be build with XeLaTeX or LuaLaTeX to use the *Helvetica Light* font for the text body.

Nevertheless, regular LaTeX commands can be used (e.g., pdflatex).
In that case, regular *Helvetica* will be used instead.

XeLaTeX (or LuaLaTeX) are required because the `report` template uses package [fontspec](https://www.ctan.org/pkg/fontspec) 2.5a or higher (released on Feb. 2016).

**We recommend upgrading LaTeX distributions older than this date (Feb. 2016) in order to build documents using this template.**

Using a moder LaTeX distribution (e.g., MiKTeX 2.9 or TeX Live 2016), the following command can be used to download and build the example report:

```
shell$ git clone https://github.com/SOM-Research/report-latex-template.git
shell$ cd report-latex-template
shell$ xelatex document && bibtex document && xelatex document && xelatex document
```

Alternatively, if XeLaTeX is not available, the following command can be issued instead (note that the document will look like slightly different).

```
shell$ pdflatex document && bibtex document && pdflatex document && pdflatex document
```

# Document configuration

A document must be configured using (for example) the following code:

```
\title{% 
  Demonstrating the Report Template
}
\author{
  John Doe \and Jane Doe
}
\address{
  SOM Research Lab\\
  Av. Carl Friedrich Gauss, 5. Building B3\\
  08860 Castelldefels
}
\date{
  \today
}
\cover{
  images/template/cover
}
\logo{
  images/template/logo
}
```

**NOTE:** If manual adjustments are needed in the vertical alignment of the title in the cover, the spacing can be tweaked in the `\newgeometry{...}` command located in line 245 of the `report.cls` file.

# Custom commands

## Partial building

The document class accepts the "partial" option to enable conditional compilation, e.g.:


```
\documentclass[10pt,twoside,partial]{report}
```

Two additional commands can be used to detect whether full or partial building is selected. These are:

```
This paragraph will be typesetted in any case.

\iffull{This paragraph will be typesetted only if "partial" IS NOT enabled.}

\ifpartial{This paragraph will be typesetted only if "partial" IS enabled.}
```

## Clarifications

The command `\clarify{text}{comment}` allows mark ing parts of the text that need to be further revised.
The `comment` argument is used to give the rationale of this revision.

When the `\clarify` command is used, an additional section called *Notes for Clarifications* is added at the end of the document summarizing all the marked texts, the included comments, and the pages where they appear.

## Boxes

### Full boxes

A full box containing text may be placed at any point using the following code:

```
\fullboxbegin
This is an example text.
\fullboxend
```

### Side boxes

Side boxes can be placed on a side of the page (l-left, r-right, i-inner, o-outer), taking the 50% of it.
When the side box crosses the boundaries of a section, the underlying `wrapfigure` environment fails to calculate the right height.
An optional argument allows to manually set the height of the sidebox (in number of lines) in these cases.

```
\sideboxbegin[19]{o}
This is an example text.
\sideboxend
```

### Framed boxes

Framed boxes are similar to full boxes, but they have a title and a blank background. Next is an example of how to use them:

```
\frameboxbegin{Title}
This is an example text.
\frameboxend
```

## Sample text

Sample text relies on the lipsum package. The following commands can be used to print sample text:

`\stext` prints a sample text (2 paragraphs by default, i.e., as `\lipsum[1-2]`). The optional argument may be used to customize the paragraph to typeset (similarly to `\lipsum[argument]`). 

`\spar` prints a sample paragraph (e.g., `\lipsum[1]`).

`\sspar` prints a short sample paragraph. Similar to `\lipsum[66]`.



# Template details

This template is based on the LaTeX template for business reports provided by Karol Kozio (www.karol-koziol.net) under Gnu Public Licence (GPL) terms.
