package ARRAY;

public class Array2dsum {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 }
        };
        int m = arr.length;
        int n = arr[0].length;
        int x1, x2, y1, y2;
        x1 = 1;
        x2 = 3;
        y1 = 2;
        y2 = 3;

        int sum = 0;
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);

    }

}
