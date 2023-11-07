import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Number To CHeck It Is Perfect Or Not");
        int number = scanner.nextInt();
        int rem , sum = 0 ;
        for(int i = 1; i < number; i++)
        {
            rem = number % i;
            if (rem == 0)
            {
                sum = sum + i;
            }
        }
        if (sum == number)
            System.out.println(number + " Is A Perfect Number");
        else
            System.out.println(number + " Is Not A Perfect Number");
    }
}