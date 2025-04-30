/* You have given one number (number range is 1 to 30)
if that number is divisible by 3 then print "FIZZ"
if that number is divisible by 5 then print "BUZZ" 
if that number is divisible by 3 and 5 both then print FIZZBUZZ */ 

public class ForLoopEx2 {
    public static void main(String[] args) {
        for(int n = 1; n<=30; n++) {
            if(n%3==0 && n%5==0) {
                System.out.println("Given number is " + n + " FIZZBUZZ");
            }

            else if(n%5==0) {
                System.out.println("Given number is " + n + " BUZZ");
            }

            else if(n%3==0) {
                System.out.println("Given number is " + n + " FIZZ");
            }
        }
    }
}


