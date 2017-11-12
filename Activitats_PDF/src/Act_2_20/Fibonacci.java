package Act_2_20;

public class Fibonacci {
    
    
    
    public int fibR (int i) throws Exception {
        if (i < 0) {
            throw new Exception ("Negative value!");
        }
        if (i < 2) {
            return i;
        } else {
            return fibR(i - 1) + fibR(i - 2);
        }
    }
    
    public void fibI (int i) throws Exception {
        if (i < 0) {
            throw new Exception ("Negative value");
        }
        int last = 0, preLast = 1, res = 1;
        for (int a = 0; a < i; a++) {
            last += preLast;
            preLast = last - preLast;
            System.out.println("Position " + a + " Value " + last);
        }
        
    }
    
}

class Main {
    public static void main (String[] args) throws Exception {
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.fibR(10));
        System.out.println("**********************");
        fib.fibI(10);
    }
}