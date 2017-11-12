package Act_2_14;

public class SumeList {
    int[] intList;
    int result;
    
    public int sumaTotal (int ...num) {
        intList = num;
        //System.out.println(intList.length);
        for ( int x = 0; x < intList.length; x++ ) {
            result = result + intList[x];
        }
        return result;
    }
}

class Main {
   
    public static void main (String[] args) {
        
        SumeList myList_1 = new SumeList();
        SumeList myList_2 = new SumeList();
        SumeList myList_3 = new SumeList();
        
        System.out.println(myList_1.sumaTotal(3, 5, 2, 4, 6));
        System.out.println(myList_2.sumaTotal(2, 10, -1, 2));
        System.out.println(myList_3.sumaTotal());
        
    }

}
