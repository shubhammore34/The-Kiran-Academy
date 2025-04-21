package Object_Creation;

public class Student_test {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1); //op : Object_Creation.Student@372f7a8d here @_ is hashcode or address of s1
		
		Student s2 = new Student();
		System.out.println(s2); //op : Object_Creation.Student@372f7a8d here @_ is hashcode or address of s2

	}

}
