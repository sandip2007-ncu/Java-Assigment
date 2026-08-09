import java.util.Scanner;
public class PrimeNumber {
    public void printNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();

        if(isPrime(number)){
            System.out.println("the prime number is " + number);
        }
        else{
            System.out.println("not prime number is " + number);


        }
    }
    public static boolean isPrime (int number){
        if(number < 2){
            return false;
        }
        for(int div = 2; div*div<= number; div++){
            if(number % div == 0){
                return false;
            }
        }
        
        return true;
    }
    
}
