package Act_1_20;

import java.util.Scanner;

public class TunelLavado {
    
    Scanner input = new Scanner(System.in);
    enum tiposLavados {BASICO, NORMAL, AVANZADO};
    
    public void menu () {
        System.out.println("1- " + tiposLavados.BASICO);
        System.out.println("2- " + tiposLavados.NORMAL);
        System.out.println("3- " + tiposLavados.AVANZADO);
        
        System.out.print("Opció: ");
        int opcionMenu = input.nextInt();
        
        switch (opcionMenu) {
            case 1:
                System.out.println("Duración: 3 min");
                break;
            case 2:
                System.out.println("Duración: 5 min");
                break;
            case 3:
                System.out.println("Duracion: 8 min");
                break;
            default:
                System.out.println("Introdueix un valor correcte.\n\n\n\n\n\n\n\n");
                menu();
        }
    }
    
}

class Main {
    public static void main (String[] args) {
        TunelLavado tunel = new TunelLavado();
        tunel.menu();
    }
}
