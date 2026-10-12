import java.util.Arrays;
import java.util.Scanner;

public class baitap1_ss4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.print("Nhập các giá trị của mảng: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Giá trị thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("Mảng đã được sắp xếp theo thứ tự giảm dần:");

        for (int i = 0; i < array.length - 1; i++) {
            for (int  j = i + 1; j < array.length; j++){
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        System.out.print("Phần tử lớn nhất của mảng là: " + array[0]);

    }
}
