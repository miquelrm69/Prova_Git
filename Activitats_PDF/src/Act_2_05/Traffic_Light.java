package Act_2_05;

public class Traffic_Light {

    String color = "RED";
    boolean flash = false;
    
    public void setTLight(String color, boolean flash) {
        this.color = color;
        this.flash = flash;
        printTLight();
    }
    
    public void printTLight() {
        System.out.println("Color: " + color);
        System.out.println("Is flashing? " + flash);
    }
    
}
