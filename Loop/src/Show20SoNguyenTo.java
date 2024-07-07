import java.util.Scanner;

public class Show20SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập");
        int number = sc.nextInt();
        int count = 0;
        int n = 2;
        while (count < number) {
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
