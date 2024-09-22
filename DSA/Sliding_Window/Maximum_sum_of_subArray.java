package DSA.Sliding_Window;

class Maximum_sum_of_subArray {
    public static int Max_sum(int[] arr, int n, int k) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        while (j < n) {
            sum += arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                maxi = Math.max(maxi, sum);
                // remove the i from window
                sum = sum - arr[i];
                // increment
                i++;
                j++;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 8, 2, 9, 1 };
        int n = arr.length;
        int k = 3;

        int ans = Max_sum(arr, n, k);
        System.out.println(ans);
    }
}