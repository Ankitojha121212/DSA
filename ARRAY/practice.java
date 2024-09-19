class practice {
    public static boolean isPalindrome(String s) {
        int n = s.length();
        s = s.replaceAll("\\s", "");
        s = s.replaceAll("[^A-Z]", "");
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;

            }

        }

        return true;
    }

    public static void main(String[] args) {
        boolean a = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(a);
    }
}