package org.company;

public class Practice {
    public static void main(String[] args) {
        String s = "a man: a plan, a canal: panama";
        String e = "race a car";
        String strS = s.replaceAll("[^a-z^A-Z]", "");
        String strE = e.replaceAll("[^a-z^A-Z]", "");

        System.out.println(strS);
        
        System.out.println(isPalindrome(strS) ? "True" : "False");

        System.out.println(strE);

        System.out.println(isPalindrome(strE) ? "True" : "False");
    }

    private static boolean isPalindrome(String words) {
        if(words.length() == 1 || words.length() == 0)
            return true;

        if(words.charAt(0) == words.charAt(words.length() - 1))
            return isPalindrome(words.substring(1, words.length() - 1));

        return false;
    }
}
