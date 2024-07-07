import java.util.Scanner;

public class showHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Vẽ hình tam giác");
            System.out.println("2. Vẽ hình vuông");
            System.out.println("3. Vẽ hình chữ nhật");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Vẽ hình tam giác");
                    System.out.println("Nhập chiều cao tam giác");
                    int height = sc.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 0; j < height ; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < 2 * i - 1; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Vẽ hình vuông");
                    System.out.println("Nhập cạnh hình vuông");
                    int canh = sc.nextInt();
                    for (int i = 0; i <= canh; i++) {
                        for (int j = 0; j < canh ; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Vẽ hình chữ nhật");
                    System.out.println("Nhập cạnh hình chữ nhật");
                    int canh1 = sc.nextInt();
                    System.out.println("Nhập cạnh hình chữ nhật");
                    int canh2 = sc.nextInt();
                    for (int i = 1; i <= canh1; i++) {
                        for (int j = 0; j < canh2 ; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn");
            }
        }
    }
}
