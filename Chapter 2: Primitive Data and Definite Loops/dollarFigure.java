/* Write a Java program called DollarFigure that produces the following output. Use nested for loops to capture the structure of the figure.

$$$$$$$**************$$$$$$$
**$$$$$$************$$$$$$**
****$$$$$**********$$$$$****
******$$$$********$$$$******
********$$$******$$$********
**********$$****$$**********
************$**$************

(You must solve this problem using only ONE public static final constant,
not multiple constants; and its value must be used in the way described in this problem.) 
*/


public class DollarFigure {
    public static void main (String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int e = 1; e <= (2 * i); e++) {
                System.out.print("*");
            }
            for (int l = 1; l <= 7 - i; l++) {
                System.out.print("$");
            }
            for (int k = 1; k <= ((2 * 7) - (2 * i)); k++) {
                System.out.print("*");
            }
            for (int m = 1; m <= 7 - i; m++) {
                System.out.print("$");
            }
            for (int j = 1; j <= (2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
