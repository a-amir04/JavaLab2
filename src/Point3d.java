public class Point3d extends Point2d{
    //координата Z
    private double zCoord;
    //Конструктор инициализации
    public Point3d ( double x, double y,double z) {
        super(x, y);
        zCoord= z;
    }
    //Конструктор по умолчанию
    public Point3d () {
    //Вызовите конструктор с тремя параметрами и определите источник
        this(0.0, 0.0, 0.0);
    }
    //Возвращение координаты Z
    public double getZ() {
        return zCoord;
    }
    // Установка значения координаты Z
    public void setZ(double val) {
        zCoord= val;
    }
    //Cравнение двух точек
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if ( !getClass().equals(obj.getClass()) ){
            return false;
        }
        Point3d point3d = (Point3d) obj;
        return this.getX() == point3d.getX() && this.getY() == point3d.getY() && this.zCoord == point3d.zCoord;
    }
    //Поиск расстояния между точками
    public double distanceTo(Point3d p) {
        return Math.sqrt(Math.pow(getX()- p.getX(), 2) + Math.pow(getY()- p.getY(), 2) + Math.pow(zCoord- p.getZ(), 2));
    }
}
