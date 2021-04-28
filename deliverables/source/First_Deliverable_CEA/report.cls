%%%
%%% SOM Research template class
%%%
%%% 2016/11/04 -- v0.1 
%%% A. Gomez
%%%
%%% Modified report class based on the report template provided by Karol Kozio 
%%% (www.karol-koziol.net) under Gnu Public Licence (GPL) terms
%%%
\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{som-report}[
  2016/11/04 -- v0.1 -- 
  A. Gomez's modified report class based on the report template provided by 
  Karol Kozio (www.karol-koziol.net) under Gnu Public Licence (GPL) terms
]

%%%
%%% Engine detector
%%% 

\RequirePackage{ifxetex,ifluatex} 
\newif\ifxetexorluatex
\ifxetex
  \xetexorluatextrue
\else
  \ifluatex
    \xetexorluatextrue
  \else
    \xetexorluatexfalse
  \fi
\fi


%%%
%%% Base class
%%%

\LoadClassWithOptions{article}

\makeatletter
\newif\if@partial\@partialfalse
\DeclareOption{partial}{\@partialtrue}
\newcommand\iffull[1]{\if@partial\else\trim@spaces{#1}\fi}
\newcommand\ifpartial[1]{\if@partial\trim@spaces{#1}\fi}
\makeatother

\ProcessOptions\relax

%%%
%%% Variables
%%%

\RequirePackage{trimspaces}
\makeatletter
\newcommand{\address}[1]{\gdef\@address{#1}}
\newcommand{\copyrightnotice}[1]{\gdef\@copyrightnotice{#1}}
\newcommand{\cover}[1]{\gdef\@cover{\trim@spaces{#1}}}
\newcommand{\back}[1]{\gdef\@back{\trim@spaces{#1}}}
\newcommand{\logo}[1]{\gdef\@logo{\trim@spaces{#1}}}

\address{
  SOM Research Lab. Office 223\\
  Av. Carl Friedrich Gauss, 5. Building B3\\
  08860 Castelldefels (Barcelona), Spain
}
\copyrightnotice{SOM Research Lab}
\date{\today}
\cover{images/template/cover_modelia}
\back{images/template/back}
\logo{images/template/logo}
\makeatother

%%%
%%% Colors
%%%

\RequirePackage[dvipsnames]{xcolor}
%\definecolor{blue}{HTML}{3B7393}
\definecolor{blue}{HTML}{639bab}
\definecolor{comp1}{HTML}{e4f5f4}
\definecolor{comp2}{HTML}{edc9c7}
\definecolor{BLUE}{HTML}{639bab}
\definecolor{gray}{HTML}{333333}

%%%
%%% Fonts
%%%

\ifxetexorluatex 
  % Use OTF Helvetica Light if XeTeX or LuaTeX is used 
  \RequirePackage{fontspec}
  \RequirePackage{anyfontsize}
  %\defaultfontfeatures{Mapping=tex-text,Ligatures=TeX,LetterSpace=-1pt}
  \defaultfontfeatures{Mapping=tex-text,Ligatures=TeX}
  \setmainfont[
    Path=fonts/,
    BoldFont=HelveticaLTStd-Roman.otf,
    ItalicFont=HelveticaLTStd-LightObl.otf,
    BoldItalicFont=HelveticaLTStd-Obl.otf,
  ]
  {HelveticaLTStd-Light.otf}
  \newfontfamily\headingfont[
    Path=fonts/,
    BoldFont=HelveticaLTStd-Bold.otf,
    ItalicFont=HelveticaLTStd-Obl.otf,
    BoldItalicFont=HelveticaLTStd-BoldObl.otf,
  ]
  {HelveticaLTStd-Roman.otf}
  \newcommand{\textcaption}[1]{{\fontspec[Path=fonts/,Ligatures={NoCommon, NoDiscretionary, NoHistoric, NoRequired, NoContextual}]{HelveticaLTStd-Light-Uppercase.otf}#1}}
  \newcommand*\quotefont{\fontspec[Path=fonts/]{texgyreschola-bold.otf}}
\else
  % Use embedded Helvetica Regular if using LaTeX
  % Warning: Layout may not be accurate
  \typeout{**WARNING**: Using Helvetica as a font replacement for the document body}
  \RequirePackage{helvet}
  \renewcommand*\familydefault{\sfdefault}
  \newcommand*{\headingfont}{\sffamily\bfseries}
  \newcommand{\textcaption}[1]{\uppercase{#1}}
  \newcommand*\quotefont{}
\fi

%%%
%%% Formatting
%%%

% Description labels
\renewcommand{\descriptionlabel}[1]{\hspace{\labelsep}\textcolor{blue}{\uppercase{#1}}}
\DeclareTextFontCommand{\emph}{\color{black}\em}

%%%
%%% Hyperlinks
%%%
\RequirePackage{hyperref}
\hypersetup{
    colorlinks=true,
    linkcolor={.!80},
    citecolor={.!80!blue},
    urlcolor={.!80!blue}
}

%%%
%%% Page configuration
%%%

\RequirePackage{geometry}
\geometry{
  a4paper,
  headheight=15pt,
  top=3cm, bottom=3.5cm, left=2cm, right=2cm,
  foot=1.5cm
}
\setlength{\textfloatsep}{2em}
\setlength{\intextsep}{2em}
\setlength{\columnsep}{1.5em}

\linespread{1.2}
\RequirePackage[bottom,hang,flushmargin]{footmisc}

%%%
%%% Captions
%%%

\RequirePackage[hang]{caption}
\DeclareCaptionFormat{upper}{#1#2{\textcaption{#3}}\par}
\captionsetup{labelfont={bf,color=gray},textfont={normalsize,color=gray},format = upper,figurename=FIGURE,tablename=TABLE}

%%%
%%% Sections
%%%

\RequirePackage[noindentafter]{titlesec}
\makeatletter
\newcommand{\sectionbreak}{\cleardoublepage}
\setcounter{secnumdepth}{4}
\titleformat{\section}{\color{blue}\headingfont\Large\bfseries\uppercase}{\thesection}{0.8em}{}[\titlerule]
\titleformat{\subsection}{\color{blue}\headingfont\large\bfseries\uppercase}{\thesubsection}{0.8em}{}
\titleformat{\subsubsection}{\color{blue}\headingfont\bfseries\uppercase}{\thesubsubsection}{0.8em}{}
\titleformat{\paragraph}{\color{blue}\headingfont\bfseries\uppercase}{\theparagraph}{1em}{}
\titleformat{\subparagraph}[runin]{\color{blue}\uppercase}{\thesubparagraph}{0pt}{}
\titlespacing{\subparagraph}{0pt}{1em}{1em}
\let\@refname\refname
\renewcommand{\refname}{\expandafter\MakeUppercase\expandafter{\@refname}}
\makeatother
\renewcommand{\contentsname}{\uppercase{Contents}}

%%%
%%% Environments
%%%

\newenvironment{itemizecompact}
{\setlist[itemize]{itemsep=0mm}\begin{itemize}}
{\end{itemize}}
\newenvironment{enumeratecompact}
{\setlist[enumerate]{itemsep=0mm}\begin{enumerate}}
{\end{enumerate}}
\newenvironment{descriptioncompact}
{\setlist[description]{itemsep=0mm}\begin{description}}
{\end{description}}


\RequirePackage{etoolbox}
\RequirePackage{tikz}

\newcommand*\quotesize{80}
% Make commands for the quotes
\newcommand*{\openquote}
   {\tikz[remember picture,overlay,xshift=-5ex,yshift=-4ex]
   \node (OQ) {\quotefont\fontsize{\quotesize}{\quotesize}\selectfont\color{blue}``};\kern0pt}

\newcommand*{\closequote}[1]
  {\tikz[remember picture,overlay,xshift=5ex,yshift={#1}]
   \node (CQ) {\quotefont\fontsize{\quotesize}{\quotesize}\selectfont\color{blue}''};}

\newcommand*\shadedauthorformat{\emph} % define format for the author argument

% Now a command to allow left, right and centre alignment of the author
\newcommand*\authoralign[1]{%
  \if#1l
    \def\authorfill{}\def\quotefill{\hfill}
  \else
    \if#1r
      \def\authorfill{\hfill}\def\quotefill{}
    \else
      \if#1c
        \gdef\authorfill{\hfill}\def\quotefill{\hfill}
      \else\typeout{Invalid option}
      \fi
    \fi
  \fi}
% wrap everything in its own environment which takes one argument (author) and one optional argument
% specifying the alignment [l, r or c]
%
\RequirePackage{scrextend}
\newenvironment{fancyquote}[2][l]%
{\begin{addmargin}[4ex]{4ex}\authoralign{#1}
\ifblank{#2}
   {\def\shadequoteauthor{}\def\yshift{-0.2ex}\def\quotefill{\hfill}}
   {\def\shadequoteauthor{\par\authorfill\shadedauthorformat{#2}}\def\yshift{2ex}}
\begin{quote}\openquote}
{\shadequoteauthor\quotefill\closequote{\yshift}\end{quote}\vspace{\parsep}\end{addmargin}}




%%%
%%% Headers and footers
%%%

\RequirePackage{fancyhdr}
\RequirePackage{calc}
\pagestyle{fancy}
\makeatletter
\newlength{\myheight}
\renewcommand{\sectionmark}[1]{\markright{\arabic{section}\hspace{1em}\uppercase{#1}}}
\newcommand*{\@logoimg}{
\settoheight{\myheight}{\thepage}
\raisebox{-2ex-0.5\myheight}{\includegraphics[height=3ex]{\@logo}}
}
\lhead{}
\chead{}
\fancyhead[EL]{\color{blue}\rightmark}
\fancyhead[ER]{}
\fancyhead[OL]{}
\fancyhead[OR]{\color{blue}\rightmark}
\cfoot{\color{blue}\@title}
\fancyfoot[EL]{\color{blue}\thepage}
\fancyfoot[ER]{\@logoimg}
\fancyfoot[OL]{\@logoimg}
\fancyfoot[OR]{\color{blue}\thepage}
\renewcommand\headrulewidth{0pt}
\renewcommand\footrulewidth{0pt}
\makeatother

%%%
%%% Titlepage
%%%

\newcommand*\cleartoleftpage{%
  \clearpage
  \ifodd\value{page}\hbox{}\newpage\fi
}

% Picture on cover page
\RequirePackage{eso-pic}
\makeatletter
\newcommand\BackgroundPic{%
\put(0,0){%
\parbox[b][\paperheight]{\paperwidth}{%
\vfill
\centering
\includegraphics[width=\paperwidth,height=\paperheight,%
keepaspectratio]{\@cover}%
\vfill
}}}
\newcommand\BackgroundBackPic{%
\put(0,0){%
\parbox[b][\paperheight]{\paperwidth}{%
\vfill
\centering
\includegraphics[width=\paperwidth,height=\paperheight,%
keepaspectratio]{\@back}%
\vfill
}}}
\makeatother

% Authors
\makeatletter
\renewcommand{\maketitle}{
\newgeometry{left=36mm, textwidth=150mm, top=65mm, bottom=21mm}
\thispagestyle{empty}
\AddToShipoutPicture*{\BackgroundPic}
\ClearShipoutPicture
\begin{flushleft}
  \color{black}
  \fontsize{27pt}{30}\headingfont\noindent\trim@spaces{\@title}
  \vfill
  \def\and{\end{tabular}~{\fontsize{25}{0}\selectfont\rmfamily\raisebox{-3.5pt}{/}}~\begin{tabular}[t]{l}} 
  {
    \color{white}\bfseries\headingfont\fontsize{18pt}{0}\selectfont
    \begin{tabular}[t]{l}
      \@author
    \end{tabular}\par
  }
  \vspace{1em}
  {
    \global\let\and\relax
    \color{white}\headingfont\fontsize{14pt}{17pt}\selectfont
    \begin{tabular}{p{\textwidth}}
      \@address
    \end{tabular}
  }
  \vspace{1em}
\end{flushleft}
\restoregeometry
\newpage
\thispagestyle{empty}
\phantom{~}
\vfill
{\urlstyle{rm}\small\noindent\trim@spaces{\@title}~\textcopyright~\ifx\@copyrightnotice\empty\else\trim@spaces{\@copyrightnotice},\fi~\@date. All rights are reserved.
}
\newpage
\thispagestyle{empty}
\ifpartial{
  \vspace*{\fill}
  \begin{center}
    \setlength{\fboxsep}{2em}
    \fcolorbox{blue}{blue}{
      \parbox{8cm}{
      \centering\fontsize{4pt}{17pt}\selectfont\color{white}
      Partial document building is ON:\\
      \vspace{2em}
      This document is a draft and may be incomplete}
    }
  \end{center}
  \vspace*{\fill}
  }
  \cleardoublepage
  \setcounter{page}{1}
}
\makeatother

\newcommand{\makeback}{
\clearpage
\pagestyle{empty}
\cleartoleftpage
\AddToShipoutPicture*{\BackgroundBackPic}
\ClearShipoutPicture{~}
\clearpage
}
\makeatother

%%%
%%% Clarifications
%%%

% Print them only if the notes package is loaded (c@pagenode exists)
% and there are notes defined within the document (pnotesavechap > 0)
\newcommand{\clarifications}{
\makeatletter
\ifcsname c@pagenote\endcsname
\ifthenelse{\value{pnotesavechap}>0}{\cleardoublepage\printnotes}{}
\fi
\makeatother
}

%%%
%%% Text boxes
%%%

% Fullbox
\RequirePackage{tcolorbox}
\RequirePackage{wrapfig}
\def\fullboxbegin{
  \bigskip
  \begin{tcolorbox}[colback=blue,colframe=blue,coltext=white,arc=0mm,boxrule=0pt]
}
\def\fullboxend{
  \end{tcolorbox}\medskip
}

% Sidebox
%
% Floating sideboxes must receive a position (l-left, r-right, i-inner, o-outer)
% It is possible to define sideboxes with a single command that calculates the
% exact height needed for the box in lines. However this solution is overcomplex,
% and we do not use it conciously to avoid future problems
\makeatletter
\def\sideboxbegin{
  \@ifnextchar[{\@t@sideboxbegin}{\@e@sideboxbegin}
}
\def\@t@sideboxbegin[#1]#2{
  \begin{wrapfigure}[#1]{#2}{0.5\textwidth}
  \vspace{-\intextsep}
  \begin{tcolorbox}[colback=blue,colframe=blue,coltext=white,arc=0mm,boxrule=0pt,before upper={\parindent15pt}]
  \noindent\ignorespaces
} 
\def\@e@sideboxbegin#1{
  \begin{wrapfigure}{#1}{0.5\textwidth}
  \vspace{-\intextsep}
  \begin{tcolorbox}[colback=blue,colframe=blue,coltext=white,arc=0mm,boxrule=0pt,before upper={\parindent15pt}]
  \noindent\ignorespaces
}
\def\sideboxend{
  \end{tcolorbox}
  \vspace{-\intextsep}
  \end{wrapfigure}
}
\makeatother

% Framebox
\newcounter{frames}
\def\frameboxbegin#1{
  \bigskip
  \refstepcounter{frames}
  \begin{tcolorbox}[colback=white,colframe=blue,arc=0mm,title={\MakeUppercase{\textbf{Frame \arabic{frames}}: #1}}]
}
\def\frameboxend{
  \end{tcolorbox}
}

% Examples
\newcounter{tips}
\def\tipbegin#1{
  \bigskip
  \refstepcounter{tips}
  \begin{tcolorbox}[colback=white,colframe=blue,arc=0mm,title={\MakeUppercase{\textbf{Tip \arabic{tips}}: #1}}]
}
\def\tipend{
  \end{tcolorbox}
}

% Examples
\newcounter{examples}
\def\examplebegin#1{
  \bigskip
  \refstepcounter{examples}
  \begin{tcolorbox}[colback=white,colframe=comp1,arc=0mm,coltitle=black,title={\MakeUppercase{\textbf{Example \arabic{examples}}: #1}}]
}
\def\exampleend{
  \end{tcolorbox}
}

% Notes
\newcounter{tnote}
\def\tnotebegin#1{
  \bigskip
  \refstepcounter{tnote}
  \begin{tcolorbox}[colback=white,colframe=comp2,arc=0mm,coltitle=black,title={\MakeUppercase{\textbf{Note \arabic{tnote}}: #1}}]
}
\def\tnoteend{
  \end{tcolorbox}
}
