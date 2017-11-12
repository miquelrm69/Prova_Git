package Act_1_18;

/**
 *
 * @author miquel
 */
public class DiasSemana {
    String[] diasSemana = {" ", "LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES", "SÁBADO", "DOMINGO"};
    
    enum dias {LUNES, MARTES, MIÉRCOLES, JUEVES, VIERENES, SÁBADO, DOMINGO};
    
    public static void main (String[] args) {
        System.out.println("Primer día: " + dias.LUNES);
        System.out.println("Último día: " + dias.DOMINGO);
    }
}
