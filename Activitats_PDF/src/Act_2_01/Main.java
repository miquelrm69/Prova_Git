package Act_2_01;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Car registerCar = new Car();
        Scanner input = new Scanner(System.in);
        
        boolean metallic;
        int typeCar;
        
        System.out.println(" CAR REGISTRATION ");
        System.out.println("******************");
        System.out.print("MODEL: ");
        String model = input.nextLine();
        System.out.print("COLOR: ");
        String color = input.nextLine();
        System.out.print("ENROLMENT: ");
        String enrolment = input.nextLine();
        System.out.println("IS METALLIC? ");
        metallic = input.nextBoolean();
        System.out.println("TYPE CAR: ");
        System.out.println("    1- Mini");
        System.out.println("    2- Utilitary");
        System.out.println("    3- Family");
        System.out.println("    4- Sport");
        typeCar = input.nextInt();
        System.out.println("FABRICATION YEAR: ");
        int fabricationYear = input.nextInt();
        System.out.println("INSURANCE MODE: ");
        System.out.println("    1- All risks");
        System.out.println("    2- Third");
        int insuranceMode = input.nextInt();
        
        registerCar.carProperties(model, color, enrolment, metallic, typeCar, fabricationYear, insuranceMode);
    }
}
