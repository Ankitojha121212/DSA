package TCS;

public class PowerOfTwoLog {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        double logValue = Math.log(n) / Math.log(2);
        return logValue == (int) logValue; // Check if it's an integer
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8)); // true
        System.out.println(isPowerOfTwo(10)); // false
    }
}
