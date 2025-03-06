import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Mang ko hop le");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Nhap gia tri cho tung phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int[] frequency = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 1;
            if (frequency[i] == -1) continue;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequency[j] = -1;
                }
            }
            frequency[i] = count;
        }
        int countUnique = 0;
        for (int i = 0; i < n; i++) {
            if (frequency[i] == 1) {
                countUnique++;
            }
        }
        if (countUnique == 0) {
            System.out.println("khong co phan tu nao duy nhat trong mang");
            return;
        }

        int[] result = new int[countUnique];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (frequency[i] == 1) {
                result[index++] = arr[i];
            }
        }

        System.out.print("mang sau khi loai bo trung lap: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
