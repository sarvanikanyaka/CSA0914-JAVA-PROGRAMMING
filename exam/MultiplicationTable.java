import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        scanner.close();
        printMultiplicationTable(number, start, end);
    }

    public static void printMultiplicationTable(int num, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
