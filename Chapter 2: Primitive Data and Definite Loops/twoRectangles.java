/* Write a program called TwoRectangles that uses two integer class constants called WIDTH and HEIGHT to draw two rectangles of stars of the given dimensions. 
The first rectangle should be flush left, and the second should be indented horizontally by the given width. 
For example, if the WIDTH and HEIGHT are 7 and 4 respectively, the program should draw the following figure:

*******
*******
*******
*******
       *******
       *******
       *******
       *******

NOTE: When submitting your solution below, set your WIDTH to 7 and HEIGHT to 4. 
*/


public class TwoRectangles {
    public static final int HEIGHT = 4;
    public static final int WIDTH = 7;
    public static void main(String[] args) {
        for (int j = 0; j < HEIGHT; j++) {
            for (int e = 0; e < WIDTH; e++) {
                System.out.print("*");
            }System.out.println();
         }
         for (int a = 0; a < HEIGHT; a++) {
            for (int m = 0; m < WIDTH; m++) {
                System.out.print(" ");
             }
             for (int k = 0; k < WIDTH; k++) {
                 System.out.print("*");
             }System.out.println();
         }
    }
}
