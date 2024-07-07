import java.util.Scanner;

public class Show100SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int n = 2; n <= 100; n++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n);
            }
        }
    }
}
