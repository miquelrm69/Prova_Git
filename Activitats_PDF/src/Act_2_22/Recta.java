package Act_2_22;

public class Recta {
    private double angulo, a, b;
    Punto lastPoint;
    
    public Recta (double a) {
        this.a = a;
        this.b = 2*a + 1;
    }
    
    public Recta () {
        this (0);
    }
    
    public double anguloPendiente () {
        Punto pI = new Punto();
        Punto pF = new Punto(a, b);
        double m, angulo;
        m = ((pF.getY() - pI.getY()) / (pF.getX() - pI.getX()));
        angulo = Math.atan(m);
        return angulo;
    }
}
