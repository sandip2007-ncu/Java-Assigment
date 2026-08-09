import java.util.Scanner;

public class GradingSystem {
    public void printgrades(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your marks");
     int marks=sc.nextInt();
     if(marks>90){
        System.out.println("A");
     } else if(marks>80){
        System.out.println("B");
     } else if (marks>70){
        System.out.println("C");
     } else  if(marks<33){ System.out.println("Pass");}
     else { System.out.println("Fails");}
 sc.close();
    }
   
}
