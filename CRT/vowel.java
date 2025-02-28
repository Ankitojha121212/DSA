public class vowel {
    public static void main(String[] args) {
        String str = "Rahul";
        int vowels = 0;
        int consonents = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                vowels++;
            } else {
                consonents++;
            }
        }
        System.out.println("consonents are : " + consonents);
        System.out.println("vowels are : " + vowels);

        System.out.println("Difference is consonents -vowels : " + (consonents - vowels));
    }
}
