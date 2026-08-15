import java.util.Scanner;
public class MarksProcessor {
    public void printNumber(){
        Scanner input = new Scanner(System.in);

        int mark;
        int count = 0;
        int sum = 0;
        int highest = 0;
        int passes = 0;
        int failures = 0;

        while (true) {

            System.out.print("Enter mark ");
            mark = input.nextInt();

            if (mark == -1) {
                break;
            }

            if (!isValidMark(mark)) {
                System.out.println("Invalid mark");
                continue;
            }
            count++;
            sum = sum + mark;

            if (count == 1) {
                highest = mark;
            } else if (mark > highest) {
                highest = mark;
            }

            if (mark >= 50) {
                passes++;
            } else {
                failures++;
            }
        }
        double average = findAverage(sum, count);

        printResult(count, sum, average, highest, passes, failures);

        input.close();

        
    }
    static boolean isValidMark(int mark) {
        if (mark >= 0 && mark <= 100) {
            return true;
        } else {
            return false;
        }
    }
    static double findAverage(int sum, int count) {
        if (count == 0) {
            return 0;
        }

        return (double) sum / count;
    }
    static void printResult(int count, int sum, double average, int highest, int passes, int failures) {

        System.out.println("Valid marks: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest mark: " + highest);
        System.out.println("Passes: " + passes);
        System.out.println("Failures: " + failures);
    }
    
}
