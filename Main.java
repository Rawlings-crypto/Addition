import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Reads input

        System.out.println("Enter a:");//prompts user to enter an integer a
        int a = scanner.nextInt();//Accepts (a) as an integer variable
        System.out.println("Enter b:");//prompts user to enter b
        int b = scanner.nextInt();//Accepts b as an integer variable

        int sum = a+b;//sums a and b and store them in an integer variable named sum.
        System.out.println("The sum is: " + sum);//Prints the sum.
    }
}