### Wie lautet die Ausgabe des folgenden Java-Codes (Zeile 4, 6, 7 und 8)?
~~~
4: fly to the left
6: teleport to 0
7: fly to 00
8: run to the right
~~~
### Erklären Sie an diesem Beispiel kurz den Unterschied zwischen Überladen und Überschreiben von Methoden. Verwenden Sie dazu insbesondere die Begriffe Klasse und Signatur.

#### Überladen:
Definition mehrerer Methoden in derselben Klasse.
Bsp.:
~~~
public abstract void move(String s);
public void move(int x){
    System.out.println("teleport to "+x);
}
~~~
move(String s) wird von move(int x) überladen, keine der beiden Funktionen geht "verloren".

#### Überschreiben (@Override):
Unterklasse hat eine Methode implementiert, die in der Basisklasse bereits definiert wurde. Die Methode der Unterklasse überschreibt die der Basisklasse.
Bsp.:
~~~
class Fish extends Animal {
    public void move(String dest){
        System.out.println("swim to "+dest);
    }   
}

class RoadRunner extends Bird {
    public void move(int x){
        System.out.println("run faster to "+x);
    }
}
~~~

Die Funktion move wird in Roadrunner überschrieben.

### Welche der folgenden Code-Zeilen kann/können nicht übersetzt werden? Warum nicht?
~~~
1 Animal shark = new Fish(); //Funktioniert, weil Animal Fish übergeordnet ist, und Fisch als Refernz der Basisklasse gespeichert werden kann
2 Animal gnu = new Animal(); //Funktioniert, weil Animal hier regulär Instanziiert (erstellt) wird.
3 RoadRunner coyote = new RoadRunner(); -||-
4 Fish nemo = coyote; // Funktioniert nicht, weil Animal (Basisklasse) nicht als eine seiner Unterklassen (Fish) instanziiert werden kann.
~~~