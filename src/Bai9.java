import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc ma tran n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ma tran khong hop le");
            return;
        }

        int[][] matrix = new int[n][n];

        System.out.println("Nhap cac phan tu cua ma tran:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Arr[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        System.out.println("Ma tran ban dau:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] rotatedMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[j][n - 1 - i] = matrix[i][j];
            }
        }

        System.out.println("Ma tran sau khi xoay 90 do:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotatedMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
