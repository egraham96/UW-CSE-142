/* Write a method padString that accepts two parameters: a String and an integer representing a length. 
The method should pad the parameter string with spaces until its length is the given length. 
For example, padString("hello", 8) should return "   hello". 
(This sort of method is useful when trying to print output that lines up horizontally.) 
If the string's length is already at least as long as the length parameter, your method should return the original string. 
For example, padString("congratulations", 10) would return "congratulations". 
*/


public static String padString(String input, int length) {
    
    int numberSpaces = input.length() - length;
    String newString = "";
    if (numberSpaces < 0){
        for (int i = 0; i < Math.abs(numberSpaces); i++) {
            newString += " ";
        }
    }
    return newString + input;
}
