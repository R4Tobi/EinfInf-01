package OOP.Presents;

public class Ball extends Present {
    private double radius = 1; // in meters

    Ball(double radius) {
        this.radius = radius;
    }

    public String toString(){
        return "Ball: " + this.radius;
    }

    @Override
    public double surface() {
        return 4 * Math.PI * this.radius * this.radius;
    }

}
