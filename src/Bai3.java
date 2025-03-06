import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap gia tri cho tung phan tu cua mang:");

        int countEven = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Arr[" + (i + 1) + "] = ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                arr[countEven] = num;
                countEven++;
            }
        }System.out.println("So luong phan tu chan: " + countEven);
        System.out.println("Mang chua cac phan tu chan: ");
        for (int i = 0; i < countEven; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
