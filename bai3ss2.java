
import java.util.Scanner;

public class bai3ss2 {
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    //nhap dữ lieu tu ban phim
    System.out.println("nhập số nguyên bất kì");
    long n =  sc.nextLong();

    //xử lý số âm thành số âm thành số dương
    long originalN = n ;
    n = Math.abs(n);

    long sum = 0;
    long tempN = n;

    // bước xử dụng vòng lặp
    while(tempN>0){
        sum += tempN % 10 ;
        tempN /= 10;
    }

    ///  buóc 4 in ra kết quả
    System.out.println("tông các chữ số của " + originalN + " là " + sum );
    sc.close();
}

}
