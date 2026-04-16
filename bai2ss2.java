import java.util.Scanner;

public class bai2ss2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhâp vao thang 1 đến 12  : ");
        //kiển tra dầu vào có phải số nguyên khong
        if (sc.hasNextInt()) {
            int thang = sc.nextInt();

            switch (thang) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.print("Tháng : " + thang + " có 31 ngày ");
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.print("Tháng " + thang + "có 30 ngay");
                    break;
                case 2:
                    System.out.print("Tháng " + thang + "có 29 ngay");
                    break;

            }
        }
    }
}