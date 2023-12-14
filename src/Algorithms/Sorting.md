### 1. InsertionSort und SelectionSOrt
```
SelectionSort:
 - n-1 Durchläufe in der äußeren Schleife
 - O(n^2) definiert durch (n *(n - 1))/(2)
 - Komplexität ist identisch für besten mittleren und schechtesten fall
 - nicht stabil, weil Reihenfolge gleicher Stellen geändert werden
 
InsertionSort:
 - n-1 Durchläufe in äußerer Schleife
 - O(n^2),denn im Mittel (n^2)/(4) oder (n^2)/(8) Vertauschungen
 - Schlechtester Fall: Liste ist falschrum sortiert --> (n^2)/(2) Vergleiche
 - Mittlerer Fall: Unsortiert, Annahme Gleichverteilung --> Einfügen bei (i-2)/(2) --> (n^2)/(4) Vergleiche
 - Bester Fall: sortierte Folgen --> n Vergleiche --> Für fast sortierte Folgen ist auch linearer Aufwand zu erwarten
 - stabiler Algorithmus, weil nur Elemente umsortiert werden, die nicht dem vorherigen Element in der Folge gleichen
```

### 3. InsertionSort mit binärer Suche
```
 - Vermindert den Suchaufwand für das Element, besonders bei großen Datenmengen
 - lineare Suche hat die Komplexität O(n), binäre Suche O(n log n)
 - Dadurch verbessert sich die Komplexität im mittleren Fall zu O(n log n)
 - im Schlechtesten Fall ist es immer noch O(n^2) und im besten O(n)
```