import java.util.Scanner;
public class GreatestCommonDivisor {
    public void printNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int first = input.nextInt();
        System.out.println("Enter the second number ");
        int second = input.nextInt();

        System.out.println("Greatest Common Divisor " +gcd(first,second) );
        input.close();       

    }
    

    public static int gcd(int first, int second){
        first= Math.abs(first);
        second= Math.abs(second);
        while (second != 0) {

            int remainder = first % second;

            first = second;
            second = remainder;
        }

        return first;
    } 
    } 
    

