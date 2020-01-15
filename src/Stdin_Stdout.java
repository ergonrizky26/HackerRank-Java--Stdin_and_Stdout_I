import java.util.Scanner;

public class Stdin_Stdout {
    public static void main (String[] args) {
//        int a = 42;
//        int b = 100;
//        int c = 125;

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
