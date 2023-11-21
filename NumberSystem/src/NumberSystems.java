package prc.numbersystems;

import java.util.Scanner;

public class NumberSystems {
    private static final Scanner scanner = new Scanner(System.in);

    private static String readLine(String message) {
        System.out.print(message);

        try {
            return NumberSystems.scanner.nextLine();
        }
        catch(Exception ex) { }

        return null;
    }

    public static String twosCompliment(String bin) {
        String twos, ones = "";
        for(int i = 0; i < bin.length(); i++)
            ones += String.valueOf(bin.charAt(i) == '0' ? '1' : '0');

        StringBuilder builder = new StringBuilder(ones);
        boolean b = false;
        for(int i = ones.length() - 1; i > 0; i--)
            if(ones.charAt(i) == '1')
                builder.setCharAt(i, '0');
            else {
                builder.setCharAt(i, '1');
                b = true;
                break;
            }

        if(!b)
            builder.append("1", 0, 7);

        twos = builder.toString();
        return twos;
    }

    private static int binaryToInt(String str) {
        return Integer.parseInt(str, 2);
    }

    private static String binaryToHex(String str) {
        return Integer.toString(NumberSystems.binaryToInt(str), 16);
    }

    private static String binaryToOct(String str) {
        return Integer.toOctalString(NumberSystems.binaryToInt(str));
    }

    private static String intToBinary(int num) {
        return Integer.toString(num, 2);
    }

    private static String intToOct(int num) {
        return Integer.toOctalString(num);
    }

    private static String intToHex(int num) {
        return Integer.toHexString(num);
    }

    private static String octToBinary(String str) {
        return Integer.toBinaryString(Integer.parseInt(str, 8));
    }

    private static String octToInt(String str) {
        return String.valueOf(Integer.parseInt(str, 8));
    }

    private static String octToHex(String str) {
        return Integer.toHexString(Integer.parseInt(str, 8));
    }

    private static String hexToBinary(String str) {
        return Integer.toBinaryString(Integer.parseInt(str, 16));
    }

    private static String hexToInt(String str) {
        return String.valueOf(Integer.parseInt(str, 16));
    }

    private static String hexToOct(String str) {
        return Integer.toOctalString(Integer.parseInt(str, 16));
    }

    private static void binaryOperations() {
        System.out.println("Binary Operations");
        System.out.println("--------------------------------");
        System.out.println("[1] Division");
        System.out.println("[2] Multiplication");
        System.out.println("[3] Subtraction");
        System.out.println("[4] Addition");
        System.out.println("[5] Negative (2's Compliment)");
        System.out.println("--------------------------------");

        char sel = NumberSystems.readLine("Enter number of your choice: ").charAt(0);
        System.out.println("--------------------------------");

        int x, y, total;
        switch(sel) {
            case '1':
                x = NumberSystems.binaryToInt(NumberSystems.readLine("Enter binary a number: "));
                y = NumberSystems.binaryToInt(NumberSystems.readLine("Enter binary another number: "));
                total = x / y;

                System.out.println("\nThe result is " + intToBinary(total) + " (Decimal: " + String.valueOf(total) + ")");
                break;

            case '2':
                x = NumberSystems.binaryToInt(NumberSystems.readLine("Enter binary a number: "));
                y = NumberSystems.binaryToInt(NumberSystems.readLine("Enter binary another number: "));
                total = x * y;

                System.out.println("\nThe result is " + intToBinary(total) + " (Decimal: " + String.valueOf(total) + ")");
                break;

            case '3':
                x = NumberSystems.binaryToInt(NumberSystems.readLine("Enter binary a number: "));
                y = NumberSystems.binaryToInt(NumberSystems.readLine("Enter binary another number: "));
                total = x / y;

                System.out.println("\nThe result is " + intToBinary(total) + " (Decimal: " + String.valueOf(total) + ")");
                break;

            case '4':
                x = NumberSystems.binaryToInt(NumberSystems.readLine("Enter binary a number: "));
                y = NumberSystems.binaryToInt(NumberSystems.readLine("Enter binary another number: "));
                total = x + y;

                System.out.println("\nThe result is " + intToBinary(total) + " (Decimal: " + String.valueOf(total) + ")");
                break;
            case '5':
                String comp = NumberSystems.twosCompliment(NumberSystems.readLine("Enter a binary number: "));
                System.out.println("\nThe result is " + comp + " (Decimal: " + NumberSystems.binaryToInt(comp) + ")");
                break;
            default:
                System.out.println("Invalid selection number.");
                System.out.println("--------------------------------");
                NumberSystems.binaryOperations();
                break;
        }
    }

    private static void numberConversion() {
        System.out.println("Binary Conversion");
        System.out.println("--------------------------------");
        System.out.println("[1] Binary to X");
        System.out.println("[2] Decimal to X");
        System.out.println("[3] Octal to X");
        System.out.println("[4] Hexa to X");
        System.out.println("--------------------------------");

        char sel = NumberSystems.readLine("Enter number of your choice: ").charAt(0);
        System.out.println("--------------------------------");

        String in = null;
        switch(sel) {
            case '1':
                in = NumberSystems.readLine("Enter a binary: ");

                System.out.println("\nOutput:");
                System.out.println("Decimal - " + NumberSystems.binaryToInt(in));
                System.out.println("Octadecimal - " + NumberSystems.binaryToOct(in));
                System.out.println("Hexadecimal - " + NumberSystems.binaryToHex(in));
                break;

            case '2':
                in = NumberSystems.readLine("Enter a decimal: ");
                int val = Integer.parseInt(in);

                System.out.println("\nOutput:");
                System.out.println("Binary - " + NumberSystems.intToBinary(val));
                System.out.println("Octadecimal - " + NumberSystems.intToOct(val));
                System.out.println("Hexadecimal - " + NumberSystems.intToHex(val));
                break;

            case '3':
                in = NumberSystems.readLine("Enter an octal value: ");

                System.out.println("\nOutput:");
                System.out.println("Binary - " + NumberSystems.octToBinary(in));
                System.out.println("Decimal - " + NumberSystems.octToInt(in));
                System.out.println("Hexadecimal - " + NumberSystems.octToHex(in));
                break;

            case '4':
                in = NumberSystems.readLine("Enter an hexadecimal value: ");

                System.out.println("\nOutput:");
                System.out.println("Binary - " + NumberSystems.hexToBinary(in));
                System.out.println("Octaldecimal - " + NumberSystems.hexToOct(in));
                System.out.println("Decimal - " + NumberSystems.hexToInt(in));
                break;
        }
    }

    private static void showMainMenu() {
        System.out.println("--------------------------------");
        System.out.println("Number Systems");
        System.out.println("--------------------------------");
        System.out.println("[1] Binary Operations");
        System.out.println("[2] Number System Conversion");
        System.out.println("[3] Exit");
        System.out.println("--------------------------------");

        char sel = NumberSystems.readLine("Enter number of your choice: ").charAt(0);
        System.out.println("--------------------------------");

        switch(sel) {
            case '1':
                NumberSystems.binaryOperations();
                break;
            case '2':
                NumberSystems.numberConversion();
                break;
            case '3':
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {
        for(;;)
            NumberSystems.showMainMenu();
    }
}