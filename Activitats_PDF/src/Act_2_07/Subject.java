package Act_2_07;

public class Subject {
    
    String name;
    int code, course;
    
    public Subject ( String name, int code, int course ) {
        this.name = name;
        this.code = code;
        this.course = course;
    }
    
    public void getSubject () {
        System.out.println("Name: " + name);
        System.out.println("Code: " + code);
        System.out.println("Course: " + course);
    }
}

class exerciseSubject {
    public static void main (String[] args) {
        Subject subject_1 = new Subject("Matemàticas", 1017, 1);
        
        subject_1.getSubject();
    }
}
