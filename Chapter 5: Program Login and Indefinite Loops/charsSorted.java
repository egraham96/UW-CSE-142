/* Write a method called charsSorted that accepts a String as its parameter and returns true if the characters in the string 
appear in sorted alphabetical order. For example, the calls of charsSorted("abcde") and charsSorted("bins") should return true, 
but the call of charsSorted("beads") should return false. */


public static boolean charsSorted (String input) {
        boolean charsSorted = true;
        Character firstLetter = Character.toLowerCase(input.charAt(0));
        int prevAscii = (int) firstLetter;
        for (int i = 1; i < input.length(); i++) {
            Character c = Character.toLowerCase(input.charAt(i));
            int asciiValue = (int) c;
            if (asciiValue < prevAscii) {
                charsSorted = false;
                return charsSorted;
            }
        }
        return charsSorted;
}