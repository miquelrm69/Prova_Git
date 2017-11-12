package Act_2_15;

public class aritmeticAverage {
    
    double[] numList;
    double sume, result;
    
    public double average(double ...num) {
        numList = num;
        for (int x = 0; x < numList.length; x++) {
            sume += numList[x];
        }
        result = sume / numList.length;
        return result;
    }
    
}

class Main {
    public static void main (String[] args) {
        
        aritmeticAverage av_1 = new aritmeticAverage();
        
        System.out.println(av_1.average(-10, 5, 0, 7, 20));
        
    }
}
