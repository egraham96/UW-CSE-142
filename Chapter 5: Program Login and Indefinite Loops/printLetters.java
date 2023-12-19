/* Consider the flawed method printLetters that follows, which accepts a string as its parameter and attempts to print the letters of the string, separated by dashes. 
For example, the call of printLetters("Rabbit") should print R-a-b-b-i-t. The initial code shown is incorrect. Correct it to produce the desired behavior. 
(Your method should print nothing if the empty string ("") is passed.) */


public static void printLetters(String text) {
    if (text.length() == 0) {
        return;
    }
    
    System.out.print(text.charAt(0));
    
    int i = 1;
    while (i < text.length()) {
        System.out.print("-" + text.charAt(i));
        i++;
    }
    System.out.println(); // to end the line of output
}
