package Object_Creation;

public class Student2_test {

	public static void main(String[] args) {
		Student2 s1 = new Student2();
		System.out.println(s1); //op : Object_Creation.Student@372f7a8d here @_ is hashcode or address of s1
		
		s1.roll_no = 1;
		s1.name = "Jay";
		
		s1.display();
		
		Student2 s2 = new Student2();
		s2.roll_no = 2;
		s2.name = "Veeru";
		s2.display();
		
		s1.m1();
	}

}
