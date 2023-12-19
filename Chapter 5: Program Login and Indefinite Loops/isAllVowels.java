/* Write a method named isAllVowels that returns whether a String consists entirely of vowels (a, e, i, o, or u, case-insensitively). 
If every character of the String is a vowel, your method should return true. 
If any character of the String is a non-vowel, your method should return false. 
Your method should return true if passed the empty string, since it does not contain any non-vowel characters.

For example, here are some calls to your method and their expected results:

Call	                 Value Returned
isAllVowels("eIEiO")	 true
isAllVowels("oink")	     false
*/

public static boolean isAllVowels (String input) {
        boolean allValues = true;
        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                allValues = false;
            }
        }
        return allValues;   
}