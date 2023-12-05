package OOP.Geometry;

class Point implements Movable {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "( " + x + " | " + y + " )";
    }

    public double distance(Point a){
        return Math.sqrt((a.getX()-this.getX())*(a.getX()-this.getX())+(a.getY()-this.getY())*(a.getY()-this.getY()));
    }

    @Override
    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

}
