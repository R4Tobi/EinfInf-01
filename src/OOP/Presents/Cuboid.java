package OOP.Presents;

public class Cuboid extends Present {
    private double length = 1; // in meters
    private double width = 1; // in meters
    private double height = 1; // in meters

    Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String toString(){
        return "Cuboid: " + this.length + "*" + this.width + "*" + this.height;
    }

    @Override
    public double surface() {

        return 2*(this.length*this.width + this.width*this.height + this.length *this.height);
    }
}
