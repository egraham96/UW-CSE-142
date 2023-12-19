/* Modify your StarFigure code from the previous problem to use a constant for the size. 
The outputs below use a constant size of 3 (left) and 6 (right):

size 3	
////////\\\\\\\\
////********\\\\
****************

star 6
////////////////////\\\\\\\\\\\\\\\\\\\\
////////////////********\\\\\\\\\\\\\\\\
////////////****************\\\\\\\\\\\\
////////************************\\\\\\\\
////********************************\\\\
****************************************
*/


public class StarFigure2 {
    public static final int constant = 3;
    
    public static void main(String[] args) {
        for (int i = 1; i <= constant; i++) {
            for (int j = 0; j < (constant * 4) - (i * 4); j++) { 
                System.out.print("/");
            }
            for (int e = 0; e < 2 * (4 * i) - 8; e++) { 
                System.out.print("*");
            }
            for (int k = 0; k < (constant * 4) - (4 * i); k++) {
                System.out.print("\\");
            }
            System.out.println();
         }
    }
}
