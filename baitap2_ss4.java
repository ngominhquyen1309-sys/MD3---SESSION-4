import java.util.Scanner;

public class baitap2_ss4 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào độ dài của mảng: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Nhập vào giá trị của mảng: ");

        for (int i = 0; i < size; i++){
            System.out.print("Giá trị của phần tử thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("Tổng giá trị các phần tử của mảng đã nhập là: ");
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println(sum);
    }
}
