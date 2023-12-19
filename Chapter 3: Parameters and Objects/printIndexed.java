/* Write a method called printIndexed that accepts a String as its parameter and prints the String's characters in order followed by their indexes in reverse order. 
For example, the call of printIndexed("ZELDA"); should print Z4E3L2D1A0 to the console.
*/


public static void printIndexed(String input) {
    int length = input.length() - 1;
    
    for (int i = 0, j = length; i < input.length(); i++, j--) {
        System.out.print(input.charAt(i));
        System.out.print(j);
    }
}
