package Act_1_21;

import java.util.Scanner;

/**
 *
 * @author miquel
 */
public class Segundos {
    
    Scanner input = new Scanner(System.in);
    int segundos;
    
    
    public Segundos (int segundos) {
        this.segundos = segundos;
    }
    
    public void operacionSegundos () {
        double dias, horas, minutos;
        
        minutos = segundos / 60;
        horas = minutos / 60;
        dias = horas / 24;
        
        System.out.println("Minutos: " + minutos);
        System.out.println("Horas: " + horas);
        System.out.println("Dias: " + dias);
    }
    
}

class Main {
    public static void main (String[] args) {
        Segundos s1 = new Segundos(3000);
        s1.operacionSegundos();
        
    }
}
