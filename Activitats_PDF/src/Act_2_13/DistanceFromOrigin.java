package Act_2_13;

public class DistanceFromOrigin {
    
    double x, y;
    
    public DistanceFromOrigin(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void printPoint() {
        System.out.println("Point: " + x + " , " + y);
    }
    
    public void calcDistance(DistanceFromOrigin op, DistanceFromOrigin p) {
        System.out.println((p.x - op.x) + " , " + (p.y - op.y));
    }
}

class Main {
    public static void main (String[] args) {
        DistanceFromOrigin point_1 = new DistanceFromOrigin(4, 3);
        DistanceFromOrigin originPoint = new DistanceFromOrigin(2, 1);
        
        point_1.calcDistance(originPoint, point_1);
    }
}
