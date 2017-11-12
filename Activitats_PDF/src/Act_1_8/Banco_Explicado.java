package Act_1_8;

/**
 *
 * @author miquel
 */
public class Banco_Explicado {
    double dineroCuenta;
    
    public Banco_Explicado(double dineroCuenta) {
        this.dineroCuenta = dineroCuenta;
    }
    
    public double plazoFijo () {
        double bancoPaga, dineroConPlanFijo, dineroRetencionHicienda;
        System.out.println("Dinero inicial en cuenta: " + dineroCuenta);
        dineroConPlanFijo = dineroCuenta * (2.75 / 100);
        System.out.println("Plan fijo anual: " + dineroConPlanFijo);
        System.out.println("Plan fijo seis meses: " + dineroConPlanFijo / 2);
        dineroRetencionHicienda = dineroConPlanFijo * (1 - 0.18);
        System.out.println("Retencion de Hicienda: " + dineroRetencionHicienda);
        bancoPaga = dineroCuenta * (((2.75/100) / 2) * (1 - 0.18));
        System.out.println("El banco te paga: " + bancoPaga);
        System.out.println("En total tendrías " + (dineroCuenta + bancoPaga) + " euros en tu cuenta.");
        return bancoPaga;
    }
}

class Main {
    public static void main (String[] args) {
        Banco_Explicado miBanco = new Banco_Explicado(2000);
        miBanco.plazoFijo();
    }
}
