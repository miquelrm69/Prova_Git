package Act_1_23;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Fuel_Average F_A = new Fuel_Average();
        
        System.out.print("Price per Liter: ");
        double pricePerLiter = input.nextDouble();
        System.out.print("Full Repost Price: ");
        double fullRepostPrice = input.nextDouble();
        System.out.print("Dash KM: ");
        int dashKm = input.nextInt();
        
        F_A.first(pricePerLiter, fullRepostPrice, dashKm);
        
        System.out.println("********************************************");
        
        System.out.print("Price per Liter: ");
        pricePerLiter = input.nextDouble();
        System.out.print("Full Repost Price: ");
        fullRepostPrice = input.nextDouble();
        
        F_A.second(pricePerLiter, fullRepostPrice);
        
        System.out.println("********************************************");
        
        System.out.print("Dash Km: ");
        dashKm = input.nextInt();
        
        System.out.println("********************************************");
        
        F_A.third(dashKm);
        F_A.resume();
    }
}
