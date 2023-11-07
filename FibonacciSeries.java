import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number Of Terms In Fibonacci Series :");
        int numTerms = scanner.nextInt();
        if (numTerms < 0){
            System.out.println("Please Enter A Positive Integer");
        }else {
            System.out.println("Fibonacci Series With " + numTerms + "Terms");
        }
        int firstTerm = 0 , secondTerm = 1;
        for (int i =0 ; i < numTerms ; i++){
            System.out.println(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm ;
            firstTerm = secondTerm ;
            secondTerm = nextTerm ;
        }
    }
}
