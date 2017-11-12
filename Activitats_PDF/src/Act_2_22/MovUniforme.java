package Act_2_22;

public class MovUniforme {
    final double v_init;
    
    public MovUniforme () {
        v_init = 2.4;
    }
    
    public double recorrido (double t) {
        double recorrido;
        recorrido = v_init * t;
        return recorrido;
    }
}