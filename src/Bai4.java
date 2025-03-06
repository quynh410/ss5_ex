import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("Kích thước rỗng.");
            scanner.close();
            return;
        }
        int[] arr = new int[n];
        System.out.println("Nhập giá trị cho từng phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu: ");
        printArray(arr);

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.println("Mảng sau khi đảo ngược: ");
        printArray(arr);
    }
    // Hàm hiển thị mảng
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
