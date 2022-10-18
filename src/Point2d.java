public class Point2d {
    private double xCoord;
    private double yCoord;
    public Point2d ( double x, double y) {
        xCoord = x;
        yCoord = y;
    }
    public Point2d () {
        this(0, 0);
    }
    public double getX () {
        return xCoord;
    }
    public double getY () {
        return yCoord;
    }
    public void setX ( double val) {
        xCoord = val;
    }
    public void setY ( double val) {
        yCoord = val;
    }
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null) {
            return false;
        }
        if ( !getClass().equals(obj.getClass()) ) {
            return false;
        }
        Point2d point2d = (Point2d) obj;
        return this.xCoord== point2d.xCoord &&this.yCoord== point2d.yCoord;
    }
}
