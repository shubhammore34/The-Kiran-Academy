/*Calculator has average operation which accepts two numbers from user & compute its average
  Task2 is assigned to vishal */
package TasksOfCompany;

public class Calculator2 {
	//Sakshi's code
 //	void addTwo(int num1, int num2) 
	int addTwo(int num1, int num2) 
	{
		int result = num1 + num2;
		System.out.println(result);
		return result; //
		
	}
	
	//Vishal's Code
	void average(int a, int b) 
	{
		Calculator2 c2 = new Calculator2();
		int result = c2.addTwo(a, b); //Error : Type mismatch: cannot convert from void to int
		
		int average = result/2;
		System.out.println(average);
	}
}
