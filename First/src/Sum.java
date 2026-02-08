import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
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
