package Act_2_08;

import java.lang.Math;

public class Point {
    
    private double x, y;
    
    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point () {
        this (0, 0);
    }
    
    public double getX () {
        return x;
    }
    
    public double getY () {
        return y;
    }
    
    public void distance (Point p1, Point p2) throws Exception {
        if (p1 == null || p2 == null) {
            throw new Exception ("Error! Parameters are NULL!");
        }
        double a1, b1, a2, b2, n, n1, n2;
        a1 = p1.getX();
        b1 = p1.getY();
        a2 = p2.getX();
        b2 = p2.getY();
        n1 = a1 - a2;
        n2 = b1 - b2;
        n = (Math.pow( n1 , 2 ) + Math.pow( n2 , 2 ));
        System.out.println(Math.sqrt(n));
        
    }
}

class mainPoint {
    public static void main (String[] args) throws Exception {
        
        Point point_1 = new Point(0, 0);
        Point point_2 = new Point(16, 4);
        Point point_3 = new Point(18, 24);
        Point point_4 = new Point( (( point_2.getX() + point_3.getX()) / 2), ( ( point_2.getY() + point_3.getY()) / 2 ) );
        
        System.out.println("Average: " + point_4.getX() + " , " + point_4.getY());
        point_1.distance(point_2, point_3);
        
        
    }
}
