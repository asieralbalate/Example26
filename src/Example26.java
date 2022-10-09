import java.util.Scanner;

public class Example26 {
    public static void main(String[] args) {
        int number;
        System.out.println("Introduce your number: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        System.out.println("The divisors are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
