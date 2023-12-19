/* Write a method called wordCount that accepts a String as its parameter and returns the number of words in the String. 
A word is a sequence of one or more nonspace characters (any character other than ' '). 
For example, the call wordCount("hello") should return 1, the call wordCount("how are you?") should return 3, 
the call wordCount(" this     string has     wide       spaces ") should return 5, and the call wordCount(" ") should return 0. */


public static int wordCount(String string) {
    
        int numOfWords = 0;
        char firstChar = string.charAt(0);
        System.out.print("firstChar" + firstChar);
        
        if (firstChar != ' ') {
            numOfWords++;
        }
        
        for (int i = 1; i < string.length(); i++) {
            char secondChar = string.charAt(i);
            if (firstChar == ' ' && secondChar != ' ') {
                numOfWords++;
            } 
            firstChar = secondChar;
        }
        
        return numOfWords;
}