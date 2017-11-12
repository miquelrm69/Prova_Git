package Act_2_17;

public class Point {
    
    double x, y;
    
    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void distance (Point ...p) {
        double x, y;
        x = p[0].getX() - p[1].getX();
        y = p[0].getY() - p[1].getY();
        if (x < 0) {
            x = -x;
        }
        if (y < 0) {
            y = -y;
        }
        System.out.println(x + " , " + y);
    }
    
    public void distance () {
        x = x - 0;
        y = y - 0;
        
        System.out.println(x + " , " + y);
    }
    
    public double getX () {
        return x;
    }
    
    public double getY() {
        return y;
    }
}

class Main {
    public static void main (String[] args) {
        Point p1 = new Point(20, 15);
        Point p2 = new Point (10, 5);
        
        p1.distance(p1, p2);
        p1.distance();
    }
}
