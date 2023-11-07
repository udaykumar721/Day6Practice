import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CouponNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number Of Coupons You Want");
        int N = scanner.nextInt();
        //int totalRandomNumbers = generateDistinctCoupons(N);
        Set<Integer> distinctCoupons = new HashSet<>();
        Random random = new Random();
        int totalRandomNumbers = 0;

        while (distinctCoupons.size() < N) {
            int randomCoupon = random.nextInt(N) + 1;
            distinctCoupons.add(randomCoupon);
            totalRandomNumbers++;
        }
        System.out.println("Total random numbers needed to have all distinct numbers: " + totalRandomNumbers);
    }
}

