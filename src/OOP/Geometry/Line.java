package OOP.Geometry;

class Line implements Movable {
    private Point start;
    private Point end;
    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString(){
        return start.toString() + " " + end.toString();
    }

    public double length(){
        Point a = this.start;
        Point b = this.end;
        return Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
    }

    @Override
    public void translate(int dx, int dy) {
        this.start = new Point(start.getX()+dx, start.getY() + dy);
        this.end = new Point(end.getX()+dx, end.getY() + dy);
    }

    public Point getStart(){
        return start;
    }

    public Point getEnd() {
        return end;
    }
}