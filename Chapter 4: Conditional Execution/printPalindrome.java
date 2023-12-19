/* Write a method called printPalindrome that accepts a Scanner for the console as a parameter, 
and prompts the user to enter one or more words and prints whether the entered String is a palindrome (i.e., reads the same forwards as it does backwards, like "abba" or "racecar"). 
If the following Scanner object were declared:

Scanner console = new Scanner(System.in);
printPalindrome(console);
The resulting output for a call where the user types a palindrome would be:

Type one or more words: racecar
racecar is a palindrome!
The output for a call where the user types a word that is not a palindrome would be:

Type one or more words: hello
hello is not a palindrome.
For an added challenge, make the code case-insensitive, so that words like "Abba" and "Madam" will be considered palindromes. */


public static void printPalindrome(Scanner console) {
    
        System.out.print("Type one or more words: ");
        String word = console.nextLine();
        boolean palindrome = true;
        int length = word.length();
        
        for (int i = 0; i < word.length(); i++) {
            if (Character.toLowerCase(word.charAt(i)) != Character.toLowerCase(word.charAt(length - 1 - i))) {
                palindrome = false;
            }
        }
        
        if (palindrome == true) {
            System.out.print(word + " is a palindrome!");
        } else {
            System.out.print(word + " is not a palindrome.");
        }
}