/* Write a method named hopscotch that accepts an integer parameter for a number of "hops" and prints a hopscotch board of that many hops. A "hop" is defined as the split into two numbers and then back together again into one. For example, hopscotch(3); should print:

   1
2     3
   4
5     6
   7
8     9
   10 
*/


public static void hopscotch (int input) {
        System.out.println("   1   ");
        int currentNumber = 1;
        while (currentNumber + 3 <= ((input * 3) + 1)){
            System.out.println((currentNumber + 1) + "     " + (currentNumber + 2));
            System.out.println("   " + (currentNumber + 3) + "    ");
            currentNumber = currentNumber + 3;
        }
}