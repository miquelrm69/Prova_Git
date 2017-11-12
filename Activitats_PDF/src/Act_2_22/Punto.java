package Act_2_22;

public class Punto {
    
    private double x, y;
    
    public Punto (double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Punto () {
        this (2.1, 5.2);
    }
    
    public String muestraPosPoint () {
        return "Pos.X: " + x + "\nPos.Y: " + y; 
    }
    
    public double getX () {
        return x;
    }
    
    public double getY () {
        return y;
    }
    
    public void setX (double x) {
        this.x = x;
    }
    
    public void setY (double y) {
        this.y = y;
    }
    
}