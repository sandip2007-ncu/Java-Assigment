import java.util.Scanner;

public class BitMaskUtility {

    static boolean isBitSet(int number, int position) {
         return (number & (1 << position)) != 0;
    }
    static int setBit(int number, int position) {
        return number | (1 << position);
    }
    static int clearBit(int number, int position) {

        return number & ~(1 << position);
    }
    static int toggleBit(int number, int position) {
         return number ^ (1 << position);
    }
    static String toBinary32(int number) {

        String binary = Integer.toBinaryString(number);

        while (binary.length() < 32) {
            binary = "0" + binary;
        } return binary;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        System.out.print("Enter bit position (0-31): ");
        int position = input.nextInt();
        if (position < 0 || position > 31) {

            System.out.println("Invalid bit position.");

        } else {

            System.out.println("\nBefore:");
            System.out.println("Decimal: " + number);
            System.out.println("Binary : " + toBinary32(number));

            System.out.println("\nChoose operation:");
            System.out.println("1. Check Bit");
            System.out.println("2. Set Bit");
            System.out.println("3. Clear Bit");
            System.out.println("4. Toggle Bit");

            System.out.print("Enter choice: ");
            int choice = input.nextInt();

            if (choice == 1) {

                boolean result = isBitSet(number, position);

                System.out.println("Bit " + position + " is set: " + result);

            } else if (choice == 2) {

                int result = setBit(number, position);

                System.out.println("\nAfter Set Bit:");
                System.out.println("Decimal: " + result);
                System.out.println("Binary : " + toBinary32(result));

            } else if (choice == 3) {

                int result = clearBit(number, position);

                System.out.println("\nAfter Clear Bit:");
                System.out.println("Decimal: " + result);
                System.out.println("Binary : " + toBinary32(result));

            } else if (choice == 4) {

                int result = toggleBit(number, position);

                System.out.println("\nAfter Toggle Bit:");
                System.out.println("Decimal: " + result);
                System.out.println("Binary : " + toBinary32(result));

            } else {

                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}
