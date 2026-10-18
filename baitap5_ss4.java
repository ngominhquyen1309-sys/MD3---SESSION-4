import java.util.Scanner;

public class baitap5_ss4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số hàng: ");
        int rows = sc.nextInt();

        System.out.print("Nhập số cột: ");
        int cols = sc.nextInt();

        int [][] numbers = new int [rows] [cols];

        for(int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print("Nhập phần tử [" + i + "][" + j + "] :");
                numbers[i][j] = sc.nextInt();
            }
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if(numbers[i][j] % 2 == 0){
                    evenSum += numbers[i][j];
                } else {
                    oddSum += numbers[i][j];
                }
            }
        }

        System.out.println("Tổng các số chẵn: " + evenSum);
        System.out.println("Tổng các số lẽ: " + oddSum);

        sc.close();
    }
}
