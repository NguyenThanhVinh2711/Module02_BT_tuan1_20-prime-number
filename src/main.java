import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Limit number: ");
        int limit = input.nextInt();
        int count = 0;
        System.out.println("Enter the prime numbers : ");
        int number = input.nextInt();
        System.out.println(number + " prime numbers is :");
        for (int n = 2; n < limit; n++) {
            boolean check = true;
            if (count < number) {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.print(n);
                    System.out.print("\t");
                    count++;
                }
            } else
                break;
        }
    }
}
