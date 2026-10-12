import java.util.Arrays;
import java.util.Scanner;

public class baitap3_ss4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào độ dài của mảng: ");
        int size = sc.nextInt();
        int[] numberList = new int[size];

        System.out.println("Nhập vào các giá trị của mảng: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Giá trị thứ " + (i + 1) + ": ");
            numberList[i] = sc.nextInt();
        }

        System.out.println("Mảng đã sắp xếp theo thứ tự giảm dần: ");
        for (int i = 0; i < numberList.length - 1; i++){
            for (int j = i + 1; j < numberList.length; j++){
                if(numberList[i] < numberList[j]){
                    int temp = numberList[i];
                    numberList[i] = numberList[j];
                    numberList[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numberList));
    }
}
