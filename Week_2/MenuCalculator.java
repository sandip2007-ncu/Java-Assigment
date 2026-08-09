
import java.util.Scanner;
public class MenuCalculator {
    public void printCalculator(){
        Scanner input = new Scanner (System.in);
        int choice;
        do{
            System.out.println("1 addition");
            System.out.println("2 subtraction");
            System.out.println("3 multiplication");
            System.out.println("4 devision");
            System.out.println("5 exit");

             System.out.println("Enter your choice ");
             choice = input.nextInt();

             switch(choice){
                case 1:
                    System.out.println("Enter your number one: ");
                    double num_a = input.nextDouble();
                    System.out.println("Enter your number two: ");
                    double num_b = input.nextDouble();

                    System.out.println("The result is " +(num_a + num_b));
                    break;

                case 2:
                    System.out.println("Enter your number one: ");
                    double num_c = input.nextDouble();
                    System.out.println("Enter your number two: ");
                    double num_d = input.nextDouble();

                    System.out.println("The result is " +(num_c - num_d));
                    break;
                case 3:
                    System.out.println("Enter your number one: ");
                    double num_e = input.nextDouble();
                    System.out.println("Enter your number two: ");
                    double num_f = input.nextDouble();

                    System.out.println("The result is " +(num_e * num_f));
                    break;

                case 4:
                    System.out.println("Enter your number one: ");
                    double num_g = input.nextDouble();
                    System.out.println("Enter your number two: ");
                    double num_h = input.nextDouble();

                    if(num_h == 0){
                    System.out.println("Cannot be devided ");
                    }
                    else{
                    System.out.println("The result is " +(num_g / num_h));
                    }
                    break;

                case 5:
                    System.out.println("Exit");
                    break;
                
                default:
                    System.out.println("Invalid Choice");
                    break;


             }

        }while(choice != 5);

        input.close();
    }

}



        
