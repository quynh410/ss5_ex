import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap gia tri cho tung phan tu cua mang:");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        System.out.println("Gia tri cua phan tu le nguyen duong lon nhat: " + max);
        System.out.println("Gia tri cua phan tu le nguyen duong nho nhat: " + min);
        if (max == Integer.MIN_VALUE && min == Integer.MAX_VALUE) {
            System.out.println("Khong co pahn tu le trong mang");
        }
    }
}
