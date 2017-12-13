package act_extres;

import java.util.Scanner;

public class Exercici_01 {
    int[] arrayNum = new int[5];
    Scanner input = new Scanner(System.in);
    int v1, v2, v3, v4, v5;
    
    public void menu () {
        System.out.println("Introdueix 5 valors: ");
        System.out.println("Valor 1: ");
        v1 = input.nextInt();
        System.out.println("Valor 2: ");
        v2 = input.nextInt();
        System.out.println("Valor 3: ");
        v3 = input.nextInt();
        System.out.println("Valor 4: ");
        v4 = input.nextInt();
        System.out.println("Valor 5: ");
        v5 = input.nextInt();
    }
    
    public void setArray () {
        arrayNum[0] = v1;
        arrayNum[1] = v2;
        arrayNum[2] = v3;
        arrayNum[3] = v4;
        arrayNum[4] = v5;
    }
    
    public void printArray () {
        for (int x = 0; x <= 4; x++) {
            System.out.println("Valor de " + x + " és " + arrayNum[x]);
        }
    }
}

class Main {
    public static void main (String[] args) {
        Exercici_01 test = new Exercici_01();
        test.menu();
        test.setArray();
        test.printArray();
    }
}
