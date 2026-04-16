
    import java.util.Scanner;

    public class bai3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 1. Nhập tử số và mẫu số của phân số thứ nhất
            System.out.print("Nhập tử số phân số 1: ");
            int tu1 = sc.nextInt();
            System.out.print("Nhập mẫu số phân số 1: ");
            int mau1 = sc.nextInt();

            // 2. Nhập tử số và mẫu số của phân số thứ hai
            System.out.print("Nhập tử số phân số 2: ");
            int tu2 = sc.nextInt();
            System.out.print("Nhập mẫu số phân số 2: ");
            int mau2 = sc.nextInt();

            // Kiểm tra mẫu số khác 0
            if (mau1 == 0 || mau2 == 0) {
                System.out.println("Lỗi: Mẫu số phải khác 0!");
            } else {
                // 3. Tính toán tổng theo công thức quy đồng
                int tuTong = (tu1 * mau2) + (tu2 * mau1);
                int mauTong = mau1 * mau2;

                // 4. In kết quả ra màn hình
                System.out.println("---------------------------");
                System.out.println("Kết quả: " + tuTong + "/" + mauTong);
            }

            sc.close();
        }
    }

