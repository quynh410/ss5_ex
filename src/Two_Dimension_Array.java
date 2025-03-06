import java.util.Scanner;

public class Two_Dimension_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng 2 chiều: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột của mảng 2 chiều: ");
        int m = Integer.parseInt(scanner.nextLine());
        int[][] numbers = new int[n][m];

        do{
            System.out.println("**************MENU****************");
            System.out.println("1. Nhập giá trị các phần tử");
            System.out.println("2. Hiển thị giá trị các phần tử theo ma trận");
            System.out.println("3. Kiểm tra sự tồn tại của 1 giá trị");
            System.out.println("4. Thoát");
            System.out.println("Lựa chọn của bạn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 1:
                    for(int i = 0; i < numbers.length; i++){
                        for(int j = 0; j < numbers[i].length; j++){
                            System.out.printf("numbers[%d][%d] : ", i, j);
                            numbers[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                    }
                    break;
                case 2:
                    for(int i = 0; i < numbers.length; i++){
                        for(int j = 0; j < numbers[i].length; j++){
                            System.out.printf("%5d : ", numbers[i][j]);
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 3:
                    System.out.print("Nhập vào 1 giá trị cần tìm: ");
                    int searchValue = Integer.parseInt(scanner.nextLine());
                    boolean isExist = false;
                    for(int i = 0; i < numbers.length; i++){
                        for(int j = 0; j < numbers[i].length; j++){
                            if(numbers[i][j] == searchValue){
                                System.out.println("Bingo!!!");
                                isExist = true;
                                break;
                            }
                        }
                    }
                    if(!isExist){
                        System.out.printf("Không tồn tại giá trị %d trong mảng", searchValue);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không hợp lệ vui lòng nhập lại");
            }
        }while (true);
    }

}