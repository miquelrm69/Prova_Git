package Act_2_22;

public class TEST {
    public static void main (String[] args) {
//        MovUniforme m1 = new MovUniforme();
//        System.out.println("Recorrido: " + m1.recorrido(3.2));
//        Recta rTest = new Recta(2);
//        System.out.println("Angulo pendiente: " + rTest.anguloPendiente());
        Punto posicion = new Punto (2.1, 5.2);
        MovUniforme mov = new MovUniforme();
        Recta trayectoria = new Recta (2);
        
        Movil m = new Movil (posicion, trayectoria, mov);
        
        System.out.println("Posicion Actual: " + m.posicionActual());
        
        
    }
}
