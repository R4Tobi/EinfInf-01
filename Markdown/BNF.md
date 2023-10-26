# BNF

Diese Datei beinhaltet Teile aus EBNF: Optionen [...]. (ISO/IEC 14977:1996(E))

~~~
<Präposition>   ::= neben | unter | über | vor | hinter
<Richtung>      ::= rechts | links
<Gegenstand>    ::= Teddy | Auto | Baustein | Puzzle | Zinnsoldat | Ball | Lego

<Beschreibung>  ::= <Gegenstand> [<Richtung>] <Präposition> <Gegenstand> | <Gegenstand> | leer

<Kiste>         ::= <Kiste> | Kiste(<Beschreibung>);
~~~