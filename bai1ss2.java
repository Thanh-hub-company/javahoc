import java.util.Scanner;

public class bai1ss2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print ("nhập một số nguyên N : ");

    // kiểm tra đầu vào có phải số nguyên dương không
    if (sc.hasNextInt()) {
        int n = sc.nextInt ();

        if (n <= 0 ) {
            System.out.println("số nhập vào không hơp lệ ");
        }else {
            long tong = 0;
            for (int i = 1; i <= n; i++){
                tong += i ;
            }
            //hiển thị kết quả
            System.out.println ("tông của số nguyen dương là :"+tong);
        }
    }else {
        System.out.println ("vui long nhap so nguyên ");
    }

}

}
