package Act_2_22;

public class Movil {
    Punto posicionInicial;
    Punto posicionActual;
    Punto ultimoAvance;
    
    Recta trayectoria;
    MovUniforme movimiento;
    
    public Movil (Punto posicionInicial, Recta trayectoria, MovUniforme movimiento) {
        this.posicionActual = posicionActual;
        this.posicionInicial = posicionInicial;
        this.ultimoAvance = ultimoAvance;
        this.trayectoria = trayectoria;
        this.movimiento = movimiento;
    }
    
    public Punto posicionActual () {
        return posicionActual;
    }
    
    public void avanza (double tiempo) {
        Punto posIntermedia = new Punto (posicionActual.getX(), posicionActual.getY());
        double distancia = movimiento.recorrido(tiempo);
        double trayecto = trayectoria.anguloPendiente();
        double incrementoX = distancia * Math.cos(trayecto);
        double incrementoY = distancia * Math.sin(trayecto);
        
        posicionActual = new Punto (ultimoAvance.getX() + incrementoX, ultimoAvance.getY() + incrementoY);
        
        ultimoAvance = posIntermedia;
    }
    
    
}
