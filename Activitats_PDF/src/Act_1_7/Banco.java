package Act_1_7;

public class Banco {
    double dineroCuenta;
    
    public Banco(double dineroCuenta) {
        this.dineroCuenta = dineroCuenta;
    }
    
    public double plazoFijo () {
        double bancoPaga;
        bancoPaga = (dineroCuenta * (( 2.75 / 100 ) / 2 ) * (1-0.18));
        return bancoPaga;
    }
}

class Main {
    public static void main (String[] args) {
        Banco miBanco = new Banco(2000);
        System.out.println(miBanco.plazoFijo());
    }
}
