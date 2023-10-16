# BNF

Diese Datei beinhaltet Teile aus EBNF: [...] Optionen. (ISO/IEC 14977:1996(E))

~~~
<Präposition>   ::= neben | unter | über | vor | hinter
<Richtung>      ::= rechts | links
<Gegenstand>    ::= Teddy | Auto | Baustein | Puzzle | Zinnsoldat

<Beschreibung>  ::= <Gegenstand> <Präposition> [<Richtung>] <Gegenstand>

<Kiste>         ::= <Kiste> | leer | 'Kiste(' <Beschreibung> ');
~~~