import java.util.Scanner;

public class LeapYear {
    public void printLeapYear(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = input.nextInt();
        if (year % 4 == 0){
            System.out.println("Entered year is a leap year : ");
        }
        else{
            System.out.println("Entered year is not a leap year : ");
           
        }
        input.close();
    }
    
}
