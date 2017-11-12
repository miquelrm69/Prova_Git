package Act_1_12;

/**
 *
 * @author miquel
 */
public class Cilindro {
    final double pi = Math.PI;
    
    double diametro = 15.5, altura = 42.4, radio = diametro / 2;;
    
    public double calculaArea () {
        double area;
        area = ( 2 * pi * radio * (radio + altura) );
        System.out.println("Area del Cilindro: " + area);
        return area;
    }
    
    public double calculaVolumen () {
        double volumen;
        volumen = ( pi * Math.pow(radio, 2) * altura );
        System.out.println("Volumen del Cilindro: " + volumen);
        return volumen;
    }
}

class Main {
    public static void main (String[] args) {
        Cilindro c1 = new Cilindro();
        c1.calculaArea();
        c1.calculaVolumen();
    }
}
