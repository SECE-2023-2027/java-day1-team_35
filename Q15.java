import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int a = sc.nextInt();

        System.out.print("Input the second number: ");
        int b = sc.nextInt();

        System.out.print("Input the third number : ");
        int c = sc.nextInt();

        int d1 = a % 10;
        int d2 = b % 10;
        int d3 = c % 10;

        boolean result = (d1 == d2) || (d2 == d3) || (d1 == d3);

        System.out.println("The result is: " + result);

        sc.close();
    }
}