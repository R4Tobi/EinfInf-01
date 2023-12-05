```
FAKT:    f(0,1)
REGEL:   X>0 AND f(X-1,Y) -> f(X,2*Y)

für f(X,64) müssen wir die regel mehrfach anwenden
f(0,1) -> Regel anwenden
f(1,2) -> Regel solange anwenden bis Y = 64
f(2,4)...f(6,64)

f(X,67) führt zu keinem Ergebnis weil 67 keine Potenz von 2 ist, es gibt keine natürliche Zhal die das Ergebnis darstellen kann

f(3,Y) 
f(0,1) -> Regel anwenden
f(1,2)...f(3,8)
```
Welche Relation wird Beschrieben?
```
Die deduktive Regel in diesem Algorithmus beschreibt eine binäre Relation zwischen natürlichen Zahlen X und Y.
Die Relation könnte als "X ist um den Faktor 2 größer als der Y-Wert des vorherigen Schritts" interpretiert werden.
```