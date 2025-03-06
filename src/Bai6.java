public class Bai6 {
    public static void main(String[] args) {
        int[] originalArray = {12, 45, 12, 78, 23, 45, 12, 90, 45, 23,
                78, 90, 45, 90, 78, 12, 45, 23, 23, 78};

        int[] markingArray = new int[1001];

        for (int num : originalArray) {
            markingArray[num]++;
        }
        int maxCount = 0;
        for (int count : markingArray) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.println("Phan tu xuat hien nhieu nhat va so lan xuat hien:");
        for (int i = 1; i < markingArray.length; i++) {
            if (markingArray[i] == maxCount) {
                System.out.println(i + " xuat hien " + maxCount + " lan");
            }
        }
    }
}
