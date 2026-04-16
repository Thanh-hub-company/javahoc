
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        // 1. Khai báo biến
        double radius, area;
        final double PI = 3.14; // Sử dụng hằng số theo yêu cầu

        Scanner sc = new Scanner(System.in);

        // 2. Nhập bán kính từ người dùng
        System.out.print("Nhập bán kính của hình tròn: ");
        radius = sc.nextDouble();

        // 3. Tính diện tích
        area = PI * radius * radius;

        // 4. In kết quả ra màn hình
        System.out.println("---------------------------");
        System.out.println("Diện tích hình tròn có bán kính " + radius + " là: " + area);

        sc.close();
    }
}
