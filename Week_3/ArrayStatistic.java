import java.util.Scanner;
public class ArrayStatistic {
    public void printArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = input.nextInt();
        int[] num = new int[n];
        System.out.println("Enter " + n + " num:");
        for(int i=0;i< num.length;i++){
            num[i] = input.nextInt();
        }
        System.out.println("Sum = " + sum(num));
        System.out.println("Average = " + average(num));
        System.out.println("Minimum = " +minimum(num));
        System.out.println("Maximum = " + max(num));
        int even = countEven(num);
        System.out.println("Even Count = " + even);
        int odd = num.length - even;
        System.out.println("Odd Count = " + odd);
        printSign(num);

    }

    public static int sum(int arr[]){
        int sum =0;
        for(int i = 0; i< arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public static double average(int arr[]){
    int sum = 0;

    for(int i = 0; i < arr.length; i++){
        sum += arr[i];
    }

    return (double) sum / arr.length;
}
    public static int minimum(int[] arr) {
        int minimum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }

        return minimum;
    }

    public static int max(int arr[]) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
    public static int countEven(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }
public static void printSign(int arr[]) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                zero++;
            } 
            else if (arr[i] > 0) {
                positive++;
            } 
            else {
                negative++;
            }
        }

        System.out.println("Positive Number " + positive);
        System.out.println("Negative Number " + negative);
        System.out.println("Zero " + zero);
    }

}


