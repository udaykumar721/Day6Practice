import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        int count = 0 ;
        if (number == 0 || number == 1)
            count = 1;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                count = 1;
                break;
            }
        }
        if (count == 0){
            System.out.println("The GIven Number Is Prime Number");
        }else {
            System.out.println("The Given Number Is Not A Prime Number");
        }
    }
}
