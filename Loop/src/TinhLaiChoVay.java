import java.util.Scanner;

public class TinhLaiChoVay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số tiền muốn vay");
        double money = sc.nextDouble();
        System.out.println("Tỉ lệ lãi suất theo tháng");
        double tiLeLai = sc.nextDouble();
        System.out.println("Số tháng muốn vay");
        int month = sc.nextInt();
        for (int i = 1; i <= month; i++) {
            double lai = money * tiLeLai / 12 * month;
            System.out.println("Lãi suất của tháng thứ " + i + " là " + lai);
        }
    }
}
