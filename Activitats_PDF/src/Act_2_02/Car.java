package Act_2_02;

import java.util.Scanner;

public class Car {
    Scanner input = new Scanner(System.in);
    
    public static void main (String[] args) {
        Car myCar = new Car();
        myCar.menuCar();
    }
     
    public void menuCar() {
        System.out.println("Introduce the model of the car: ");
        String model = input.nextLine();
        System.out.println("Introduce the color: ");
        String color = input.nextLine();
        if (model != " " && color != " ") {
            printCar(model, color);
        } else {
            System.out.println("Error!");
        }
    }
    
    public void printCar(String model, String color) {
        System.out.println("\n");System.out.println("\n");System.out.println("\n");
        System.out.println("\n");System.out.println("\n");System.out.println("\n");
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        
    }
}
