import java.util.Scanner;
public class LinearSearchToolkit {
    public static void printLinear() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size= input.nextInt();
        int[] values = new int[size];
        System.out.println("Enter the elements : ");
        for(int i=0;i<size;i++){
            values[i] = input.nextInt();
        }
        System.out.println("Array Elements");
        for(int i = 0; i<size;i++){
            System.out.print(values[i] +" ");
        }
        System.out.println("Enter the Target : ");

        int target = input.nextInt();
        System.out.println("Target: " +target);

        System.out.println("Contains: " + contains(values, target));
        System.out.println("First Index: " + firstIndexOf(values, target));
        System.out.println("Last Index: " + lastIndexOf(values, target));
        System.out.println("Occurrences: " + countOccurrences(values, target));
    }
    static boolean contains(int[] values, int target) {

        for (int i = 0; i < values.length; i++) {

            if (values[i] == target) {
                return true;
            }
        } return false;
    }
    static int firstIndexOf(int[] values, int target) {

        for (int i = 0; i < values.length; i++) {

            if (values[i] == target) {
                return i;
            }
        }       return -1;
    }
    static int lastIndexOf(int[] values, int target) {

        int lastIndex = -1;
        for (int i = 0; i < values.length; i++) {

            if (values[i] == target) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }
    static int countOccurrences(int[] values, int target) {

        int count = 0;

        for (int i = 0; i < values.length; i++) {

            if (values[i] == target) {
                count++;
            }
        }

        return count;
    }
}
