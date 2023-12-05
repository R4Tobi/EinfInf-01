package OOP.Presents;

public class Cylinder extends Present {
    private double height = 1; // in meters
    private double radius = 1; // in meters

    Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public String toString(){
        return "Cylinder: " + this.radius + "*" + this.height;
    }

    @Override
    public double surface() {
         return 2 * Math.PI * this.radius * (this.radius + this.height);
    }
}
