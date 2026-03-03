import java.util.Scanner;

public class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 a number: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}   