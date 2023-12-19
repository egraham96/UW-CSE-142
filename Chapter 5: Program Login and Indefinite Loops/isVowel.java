/* Write a method named isVowel that returns whether a String is a vowel (a single-letter string containing a, e, i, o, or u, case-insensitively). */

public static boolean isVowel (String input) {
    if (input.equalsIgnoreCase("a")|| input.equalsIgnoreCase("e") || input.equalsIgnoreCase("i") || input.equalsIgnoreCase("o") || input.equalsIgnoreCase("u")){
        return true;
    }else{
        return false;
    }
}