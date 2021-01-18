import java.util.*;
public class SumOfDigitsRecursion {
    public static int sumOfDigits(int n) {
        if(n < 10) {
            return n;
        }
        return sumOfDigits(n/10)+n%10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sumOfDigits(n));
    }
}