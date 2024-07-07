import java.util.Scanner;

public class KtrSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + " Không phải là số nguyên tố");
        }else {
            int i = 2;
            boolean ktra = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    ktra = false;
                    break;
                }
                i++;
            }
            if (ktra){
                System.out.println(number + " Đây là số nguyên tố");
            }else {
                System.out.println(number + " Đây không phải là số nguyên tố");
            }
        }
    }
}
