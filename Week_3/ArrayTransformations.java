import java.util.Scanner;
public class ArrayTransformations {
    static void reverseInPlace(int[] values) {

        int left = 0;
        int right = values.length - 1;

        while (left < right) {
            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;

            left++;
            right--;
        }
    }
    static int[] reversedCopy(int[] values) {

        int[] result = new int[values.length];

        for (int i = 0; i < values.length; i++) {

            result[i] = values[values.length - 1 - i];
        }

        return result;
    }
    static int removeValue(int[] values, int target) {

        int index = 0;

        for (int i = 0; i < values.length; i++) {

            if (values[i] != target) {

                values[index] = values[i];
                index++;
            }
        }

        return index;
    }

    static int[] runningSum(int[] values) {

        int[] result = new int[values.length];

        int sum = 0;

        for (int i = 0; i < values.length; i++) {

            sum = sum + values[i];
            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] values = new int[size];

        System.out.println("Enter the elements:");

        for (int i = 0; i < size; i++) {
            values[i] = input.nextInt();
        }
        System.out.println("Original Array:");

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

        reverseInPlace(values);

        System.out.println("Reverse In Place:");

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

        int[] copy = reversedCopy(values);

        System.out.println("Reversed Copy:");

        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }

        System.out.print("Enter target to remove: ");
        int target = input.nextInt();

        int length = removeValue(values, target);

        System.out.println("After removing " + target + ":");

        for (int i = 0; i < length; i++) {
            System.out.print(values[i] + " ");
        }

        System.out.println("Logical Length = " + length);

        int[] sum = runningSum(values);

        System.out.println("Running Sum:");

        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
        }

        input.close();
    }
}
