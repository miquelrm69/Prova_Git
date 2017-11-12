package Act_2_01;

public class Car {
    String stuff;
    String insuranceMode_String;
    String typeCar_String;
    boolean restart = true;
    
    public void carProperties(String model, String color, String enrolment, boolean metallic, int typeCar, int fabircationYear, int insuranceMode) {
        while (restart) {
            if (metallic) {
                stuff = "Metallic";
            } else if (!metallic) {
                stuff = "No metallic";
            }
            switch (typeCar) {
                case 1:
                    typeCar_String = "MINI";
                    break;
                case 2:
                    typeCar_String = "UTILITARIAN";
                    break;
                case 3:
                    typeCar_String = "FAMILY";
                    break;
                case 4:
                    typeCar_String = "SPORT";
                    break;
                default:
                    System.out.println("Type car ERROR! Bad input. Try again.");
                    restart = true;
            }
            switch (insuranceMode) {
                case 1:
                   insuranceMode_String = "All Risks";
                   break;
                case 2: 
                    insuranceMode_String = "Third";
                    break;
                default:
                    System.out.println("Insurance mode ERROR! Bad input. Try again.");
                    restart = true;
            }
            restart = false;
        }
        System.out.println("***************************************************");
        System.out.println("Car model: " + model);
        System.out.println("Car color: " + color);
        System.out.println("Car enrolment: " + enrolment);
        System.out.println("Stuff: " + stuff);
        System.out.println("Type car: " + typeCar_String);
        System.out.println("Insurance: " + insuranceMode_String);
        System.out.println("***************************************************");
    }
}
