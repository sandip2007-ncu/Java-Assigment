import java.util.Scanner;

public class FinalValueOperations {

    public static void main(String[] args) {
        printCalculate();
    }

    public static void printCalculate() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of operations:");
        int num = input.nextInt();

        int x = 1;

        for (int i = 1; i <= num; i++) {
            System.out.println("Enter operation:");
            String operation = input.next();

            if (operation.contains("+")) {
                x++;
            } else {
                x--;
            }
        }

        System.out.println("Final value: " + x);

        input.close();
    }
}
