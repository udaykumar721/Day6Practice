import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter THe NUmber TO check It's Reverse Number");
        int number = scanner.nextInt();
        int remainder , reverse = 0;
        while (number != 0){
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10 ;
        }
        System.out.println("The Reverse Number is " +reverse);
    }
}
