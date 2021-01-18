import java.util.Scanner;

public class MaxCuts {

    public static int maxCuts(int n, int a, int b, int c) {
        if(n == 0) {
            return 0;
        }
        if(n < 0) {
            return -1;
        }
        
        int t1 = maxCuts(n-a, a, b, c);
        int t2 = maxCuts(n-b,a,b,c);
        int t3 = maxCuts(n-c, a, b, c);
        int max = t1 > t2 ? (t1 > t3)?t1:t3 : (t2 > t3)? t2: t3;
        if(max == -1) {
            return -1;
        }
        else {
            return max+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(maxCuts(n,a,b,c));
    }
}
