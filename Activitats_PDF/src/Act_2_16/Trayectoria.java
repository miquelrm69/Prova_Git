package Act_2_16;

public class Trayectoria {
    
    private double x, y;

    
    public Trayectoria (double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Trayectoria () {
        this (0, 0);
    }
    
    public void recorrido (Trayectoria ...t) {
        double totalX = 0, totalY = 0;
        Trayectoria anterior;
        for (int a = 0; a < t.length; a++) {
            anterior = t[a];
            totalX += t[a].getX() - anterior.getX();
            totalY += t[a].getY() - anterior.getY();
        }
        System.out.println(totalX + " , " + totalY);

    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
}

class Main {
    public static void main (String[] args) {
        Trayectoria t1 = new Trayectoria (2, 4);
        Trayectoria t2 = new Trayectoria (4, 5);
        Trayectoria executeT = new Trayectoria ();
        
        executeT.recorrido(t1, t2);
    }
}