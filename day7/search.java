public class search{
    public static void main(String[] args) {
        String s1="hello world";
        // Find the index of the substring "orld"
        System.out.println(s1.indexOf("orld"));
        // Find the index of 'o' starting from index 5
        System.out.println(s1.indexOf("o",5));
        // Find the first occurrence of 'o'
        System.out.println(s1.indexOf("o"));
        // Find the last occurrence of 'o'
        System.out.println(s1.lastIndexOf("o"));
        // Get the substring starting from index 2
        System.out.println(s1.substring(2));
        // Get the substring from index 6 to the second last character
        System.out.println(s1.substring(6,s1.length()-1));
        // Get the subsequence from index 1 to 6
        System.out.println(s1.subSequence(1, 6));
        // Get the subsequence from index 1 to 10
        System.out.println(s1.subSequence(1, 10));
        // Get the substring from index 1 to 11
        System.out.println(s1.substring(1, 11));

    }
}


