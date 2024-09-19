package ARRAY;

public class Sort75 {

    public static int sortColors(int[] nums) {
        int n = nums.length;
        int curr = 0, p0 = 0, p2 = n - 1;

        while (curr <= p2) {
            if (nums[curr] == 0) {
                // swap
                int temp = nums[curr];
                nums[curr] = nums[p0];
                nums[0] = temp;

                curr++;
                p0++;
            } else if (nums[curr] == 2) {
                // swap
                int temp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2] = temp;
                p2--;
            } else {
                // when nums[curr] ==1;
                curr++;

            }

        }
        return new nums[];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1 };
        int afr = sortColors(arr);

    }
}
