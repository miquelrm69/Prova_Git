package Act_2_21;

public class Ackerman {
    int result = 0;
    public int fAckerman (int m, int n) throws Exception {
        if (n < 0 || m < 0) {
            throw new Exception ("Negative value! ERROR!");
        }
        if (m == 0) {
            result = n + 1;
        } else if (n == 0 && m > 0) {
            fAckerman(m - 1, 1);
        } else if (n > 0 && m > 0) {
            fAckerman(m - 1, fAckerman(m, n - 1));
        }
        return result;
    }
    
}

class Main {
    public static void main (String[] args) throws Exception {
        Ackerman A1 = new Ackerman();
        System.out.println(A1.fAckerman(0, 0));
        System.out.println(A1.fAckerman(2, 2));
        System.out.println(A1.fAckerman(3, 3));
    }
}
