/* Write a program in a class named StarFigure that produces the following output using for loops.

////////////////\\\\\\\\\\\\\\\\
////////////********\\\\\\\\\\\\
////////****************\\\\\\\\
////************************\\\\
******************************** 
*/


public class StarFigure {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 20 - (4 * i); j++) { 
                System.out.print("/");
            }
            for (int e = 0; e < 2 * (4 * i) - 8; e++) { 
                System.out.print("*");
            }
            for (int k = 0; k < 20 - (4 * i); k++) {
                System.out.print("\\");
            }
            System.out.println();
         }
    }
}
