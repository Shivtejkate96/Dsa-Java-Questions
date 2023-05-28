import java.util.*;

public class Main {
    static int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = fact(n);
        System.out.println(factorial);
        int count = 0;
        while (factorial % 10 == 0) {
            count++;
            factorial /= 10;
        }
        System.out.println(count);
    }
}
