/* You have given one number
if that number is divisible by 3 then print "FIZZ"
if that number is divisible by 5 then print "BUZZ" 
if that number is divisible by 3 and 5 both then print FIZZBUZZ */ 

public class control_stmt {
    public static void main(String[] args) {
        int n = 15;
        if(n%3==0 && n%5==0) {
            System.out.println("FIZZBUZZ");
        }

        else if(n%5==0) {
            System.out.println("BUZZ");
        }

        else if(n%3==0) {
            System.out.println("FIZZ");
        }
    }
}
