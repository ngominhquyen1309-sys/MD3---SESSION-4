import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class baitap6_ss4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào độ dài của mảng: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int  i = 0; i < size; i++){
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.print("Mảng bạn vừa nhập: ");
        System.out.println(Arrays.toString(array));

        System.out.print("Nhập số bạn muốn tìm kiếm: ");
        int target = sc.nextInt();

        for (int i = 0; i < array.length - 1; i++) {

            int maxIndex = i;
            for (int  j = i + 1; j < array.length; j++){
                if (array[j]  > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }

        System.out.println("Mảng đã sắp xếp theo thứ tự giảm dần: ");
        System.out.println(Arrays.toString(array));

        boolean linearFound = false;

        for (int  i = 0; i < size; i++){
            if (array[i] == target){
                System.out.println("Tìm kiếm tuyến tính: phần tử " + target +" ở vị trí: " + i);
                linearFound = true;
                break;
            }
        }

        if(!linearFound){
            System.out.println("Tìm kiếm tuyến tính: Không tìm thấy " + target);
        }

        int left = 0;
        int right = array.length - 1;
        int foundIndex = -1;

        while (left <= right){
            int mid = (left + right) / 2;
            if (array[mid] == target){
                foundIndex = mid;
                break;
            } else if (array[mid] < target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Tìm kiếm nhị phân: tìm thấy " + target + " tại chỉ số " + foundIndex);
        } else {
            System.out.println("Tìm kiếm nhị phân: không tìm thấy " + target);
        }
        sc.close();
    }
}
