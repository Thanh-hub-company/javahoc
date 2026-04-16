import java.util.Scanner;

public class bai4ss2 {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

   System.out.print(" nhập cạnh a :");
   int a = sc.nextInt();
   System.out.print("nhập canh b :");
    int b = sc.nextInt();
    System.out.println("nhap canh c :");
    int c = sc.nextInt();
    
    if ( a + b > c && b + c > a && c + a > b ){
        System.out.print("Đây là tam giác :");
        if (a ==  b && b == c) {
            System.out.print("Đây là tam giác đêu");
            
        } else if (a == b || b == c || c == a ) {
            System.out.print("Đây là tam giác cân");
        } else if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b){
            System.out.print("đây là tam giác vuông");

        } else {
            System.out.print("Đây là tam giác thường");
        }
    }else {
        System.out.print("Ba cạnh không cấu tạo thành tam giac");
    }
    sc.close();
    }
}
