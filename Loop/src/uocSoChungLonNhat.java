import java.util.Scanner;

public class uocSoChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên a");
        int a = sc.nextInt();
        System.out.println("Nhập số nguyên b");
        int b = sc.nextInt();
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("Ước chung lớn nhất là " + a);
    }
}
