import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = input.nextInt();
        System.out.print("Enter second number:");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);
        System.out.println("After change: " + a);
        System.out.println("After change: " + b);

        input.close();
    }
}