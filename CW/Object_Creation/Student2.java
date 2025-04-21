package Object_Creation;

public class Student2 {
	int roll_no;
    String name;
    int marks;
    
    void display() {
    	System.out.println(roll_no);
    	System.out.println(name);
    	
    }
    
    void m1() {
    	System.out.println("m1");
    	Student2 s1 = new Student2();
    	System.out.println(s1);
    }
}
