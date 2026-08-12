import java.util.Scanner;
public class NumberReversal {
    public void printNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int num = input.nextInt();
        System.out.println("the reversed number" +reverseNumber(num) );

    }
    public static int reverseNumber(int num){
        
        int reverse = 0;
        while(num>0){
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        num = num / 10;
        }
        return reverse;

    }
}
