import java.util.Arrays;
import java.util.Scanner;

public class baitap4_ss4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào độ dài của mảng: ");
        int arrSize = sc.nextInt();

        if (arrSize == 0) {
            System.out.print("Kích thước rỗng");
        } else {
            int[] numberList = new int[arrSize];

            System.out.println("Nhập vào các giá trị của mảng: ");
            for(int i = 0; i < arrSize; i++){
                System.out.print("Giá trị thứ " + (i + 1) + ": ");
                numberList[i] = sc.nextInt();
            }

            System.out.println("Giá trị ban đầu của mảng:");
            System.out.print(Arrays.toString(numberList));

            System.out.println("Mảng sau khi đảo ngược là: ");
            int n = numberList.length;
            for(int i = 0; i < n / 2; i++ ){
                int temp = numberList[i];
                numberList[i] = numberList[n - i - 1];
                numberList[n - i - 1] = temp;
            }
            System.out.println(Arrays.toString(numberList));
        }
    }
}
