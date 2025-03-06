import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        int n = scanner.nextInt();

        if (n <= 0) {  // Fix: Ensure valid array size
            System.out.println("Mang ko co phan tu.");
            scanner.close();
            return;
        }
        int[] arr = new int[n];
        System.out.println("Nhap gia tri cho tung phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        int[] sortedArr = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sortedArr[index++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                sortedArr[index++] = arr[i];
            }
        }
        System.arraycopy(sortedArr, 0, arr, 0, n);
        System.out.print("mang sau khi sap xep: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
