package Act_1_11;

/**
 *
 * @author miquel
 */
public class Rectangulo {
    
    int alto, ancho, area, perimetro;
    
    public Rectangulo (int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
    
    public void longitudes () {
        System.out.println("Altura: " + alto + " cm");
        System.out.println("Amplitud : " + ancho + " cm");
    }
    
    public void area () {
        area = alto * ancho;
        System.out.println("Area: " + area);
    }
    
    public void perimetro () {
        perimetro = 2 * (alto + ancho);
        System.out.println("Perimetro: " + perimetro);
    }
}

class Main {
    public static void main (String[] args) {
        Rectangulo R1 = new Rectangulo(15, 25);
        R1.longitudes();
        R1.area();
        R1.perimetro();
    }
}
