public class pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(str) ? "The string is a pangram." : "The string is not a pangram.");
    }

    public static boolean isPangram(String str) {
        boolean[] alphabet = new boolean[26];
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }
        for (boolean b : alphabet) {
            if (!b) {
                return false;
            }
        }
        return true;
    }   
}





























































