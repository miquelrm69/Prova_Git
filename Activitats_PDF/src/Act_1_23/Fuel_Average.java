package Act_1_23;

import java.util.Scanner;

public class Fuel_Average {
    Scanner input = new Scanner(System.in);
    double literPrice_1, fullRepostPrice_1, dashKm_1;
    double literPrice_2, fullRepostPrice_2;
    double dashKm_2;
    double kmTotal, totalLiters, average;
    
    public void first (double literPrice, double fullRepostPrice, int dashKm) {
        System.out.println(literPrice + " " + fullRepostPrice + " " + dashKm);
        this.literPrice_1 = literPrice;
        this.fullRepostPrice_1 = fullRepostPrice;
        this.dashKm_1 = dashKm;
    }
    
    public void second (double literPrice, double fullRepostPrice) {
        System.out.println(literPrice + " " + fullRepostPrice);
        this.literPrice_2 = literPrice;
        this.fullRepostPrice_2 = fullRepostPrice;
    }
    
    public void third (int dashKm) {
        System.out.println(dashKm);
        this.dashKm_2 = dashKm;
    }
    
    public void resume () {
        kmTotal = dashKm_2 - dashKm_1;
        System.out.println("Total KM recorreguts: " + kmTotal);
        totalLiters = fullRepostPrice_1 / literPrice_1;
        totalLiters += fullRepostPrice_2 / literPrice_2;
        System.out.println("Total Liters: " + totalLiters);
        average = (totalLiters / kmTotal) * 100;
        System.out.println("The average is: " + average + " l/Km.");
    }
}
