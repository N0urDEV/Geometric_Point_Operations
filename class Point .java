public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point otherPoint) {
        double dx = this.x - otherPoint.getX();
        double dy = this.y - otherPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double norm() {
        return Math.sqrt(x * x + y * y);
    }

//TEST:

    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(7, 6);

        System.out.println("Point 1 - X: " + point1.getX() + ", Y: " + point1.getY());
        System.out.println("Point 2 - X: " + point2.getX() + ", Y: " + point2.getY());

        point1.setX(5);
        point2.setY(2);

        System.out.println("Point 1 - X: " + point1.getX() + ", Y: " + point1.getY());
        System.out.println("Point 2 - X: " + point2.getX() + ", Y: " + point2.getY());

        double distanceBetweenPoints = point1.distance(point2);
        System.out.println("Distance between points: " + distanceBetweenPoints);

        double normPoint1 = point1.norm();
        System.out.println("Norm of Point 1: " + normPoint1);
    }
}
