package OOP.Geometry;

class Triangle implements Movable {
    private Point a;
    private Point b;
    private Point c;
    // TODO: Constructor, toString, perimeter, translate

    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString(){
        return "A"+a.toString() + "B"+b.toString() + "C"+c.toString();
    }

    public double perimeter(){
        return new Line(a,b).length() + new Line(b,c).length() + new Line(c,a).length();
    }

    @Override
    public void translate(int dx, int dy) {
        this.a = new Point(a.getX() + dx, a.getY() + dy);
        this.b = new Point(b.getX() + dx, b.getY() + dy);
        this.c = new Point(c.getX() + dx, c.getY() + dy);
    }

    private Point getA() {
        return a;
    }

    private Point getB() {
        return b;
    }

    private Point getC() {
        return c;
    }

    private Point[] getPoints() {
        Point[] points = {a, b, c};
        return points;
    }

}
