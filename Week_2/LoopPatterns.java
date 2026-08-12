import java.util.Scanner;
public class LoopPatterns {
    public void printPattern(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sizeof the pattern");
        int size = input.nextInt();
        System.out.println("Pattern Rectangle:");
        patternRectangle(size);
        System.out.println("Pattern Triangle:");
        patternTriangle(size);
        System.out.println("Pattern Number:");
        patternNumber(size);
    }

    public static void patternRectangle(int size){
        for(int i= 1; i<=size; i++){
            for(int j= 1; j<=size; j++){
            System.out.print("* ");
        }
        System.out.println();

        }

    }
    public static void patternTriangle(int size){
        for(int i= 1; i<=size; i++){
            for(int j= 1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();

        }

    }
    public static void patternNumber(int size){
        int a= 1;
        for(int i= 1; i<=size; i++){
            for(int j= 1; j<=i; j++){
            System.out.print(+ (a++) );
            
        }
        a = 1;
        System.out.println();

        }

    }
}
