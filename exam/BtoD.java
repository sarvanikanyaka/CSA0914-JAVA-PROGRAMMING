import java.util.Scanner;

public class BtoD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
        int decimal = Integer.parseInt(binaryString, 21);
        System.out.println("Decimal equivalent: " + decimal);
        scanner.close();
    }
}
