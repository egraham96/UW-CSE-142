/* Write a method named hasAnOddDigit that returns whether any digit of an integer is odd. 
Your method should return true if the number has at least one odd digit and false if none of its digits are odd. 0, 2, 4, 6, and 8 are even digits, and 1, 3, 5, 7, 9 are odd digits.

For example, here are some calls to your method and their expected results:

Call	                    Value Returned
hasAnOddDigit(4822116)	    true
hasAnOddDigit(2448)	        false
hasAnOddDigit(-7004)	    true
You should not use a String to solve this problem. */


public static boolean hasAnOddDigit (int input) {
        boolean hasOddDigit = false;
        int numberInput = input;
        while (numberInput != 0){
            int currentDigit = numberInput % 10;
            if (currentDigit % 2 != 0){
                hasOddDigit = true;
            }
            numberInput = numberInput / 10;        
        }
        return hasOddDigit;
}