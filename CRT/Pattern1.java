public class Pattern1 {
    public static void main(String[] args) {
        int i, j;
        i = 1;
        int count = 1;
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;

        while (i < 5) {
            j = 1;
            while (j <= i) {
                if (j == 1) {
                    sum += count;
                }
                if (j == 2) {
                    sum2 += count;
                }
                if (i == 4) {
                    sum3 += count;
                }
                System.out.print(count);

                count++;
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Sum of first column : " + sum);
        System.out.println("sum of Second column : " + sum2);
        System.out.println("Sum of last Row : " + sum3);
    }
}