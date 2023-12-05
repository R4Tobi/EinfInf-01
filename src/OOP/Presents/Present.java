package OOP.Presents;

public abstract class Present {
    static int counter = 0;

    protected Present() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    abstract double surface();

    double computePaperSize() {
        return (this.surface() * 1.6 + 0.5) - ((this.surface() * 1.6 + 0.5) % 1);
    }
}