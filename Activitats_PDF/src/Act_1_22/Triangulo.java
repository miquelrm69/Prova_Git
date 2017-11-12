package Act_1_22;

import java.util.Scanner;

/**
 *
 * @author miquel
 */
public class Triangulo {
    Scanner input = new Scanner(System.in);
    double lado;
    
    public Triangulo (double lado) {
        this.lado = lado;
    }
    
    public void operaciones () {
        double perimetro, area;
        
        perimetro = lado * 3;
        System.out.println("Perímetro: " + perimetro);
        
        double base, altura;
        base = lado / 2;
        altura = Math.sqrt(3 * lado) / 2;
        
        area = (Math.sqrt(3) / 4) * Math.pow(lado, 2);
        
        System.out.println("Area: " + area);
        
    }
    
    public static void main (String[] args) {
        Triangulo t1 = new Triangulo(5);
        t1.operaciones();
    }
}
