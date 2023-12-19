/* Modify your DollarFigure program from the previous exercise to become a new program called DollarFigure2 that uses a global constant for the figure's height. (You may want to make loop tables first.) The previous output used a constant height of 7. The outputs below use a constant size of 3 (left) and 5 (right):

size 3	
$$$******$$$
**$$****$$**
****$**$****

size 5
$$$$$**********$$$$$
**$$$$********$$$$**
****$$$******$$$****
******$$****$$******
********$**$********

(You must solve this problem using only ONE public static final constant,
not multiple constants; and its value must be used in the way described in this problem.) 
*/


public class DollarFigure2 {
    public static final int height = 7;
    public static void main (String[] args) {
        for (int i = 0; i < height; i++) {
            for (int e = 1; e <= (2 * i); e++) {
                System.out.print("*");
            }
            for (int l = 1; l <= height - i; l++) {
                System.out.print("$");
            }
            for (int k = 1; k <= ((2 * height) - (2 * i)); k++) {
                System.out.print("*");
            }
            for (int m = 1; m <= height - i; m++) {
                System.out.print("$");
            }
            for (int j = 1; j <= (2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}