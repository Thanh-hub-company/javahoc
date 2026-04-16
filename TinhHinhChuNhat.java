import java.util.Scanner;

public class TinhHinhChuNhat {
    public static void main(String[] args) {
        // 1. Khai báo biến kiểu float
        float width, height, area, perimeter;
        Scanner sc = new Scanner(System.in);

        // 2. Nhập dữ liệu từ bàn phím
        System.out.print("Nhập chiều rộng (width): ");
        width = sc.nextFloat();
        System.out.print("Nhập chiều cao (height): ");
        height = sc.nextFloat();

        // 3. Tính diện tích và chu vi
        area = width * height;
        perimeter = (width + height) * 2;

        // 4. In kết quả ra màn hình
        System.out.println("---------------------------");
        System.out.println("Diện tích hình chữ nhật: " + area);
        System.out.println("Chu vi hình chữ nhật: " + perimeter);

        sc.close();
    }
}