/* Write a complete Java program in a class named Lanterns that generates the following three figures of output. Use static methods to show structure and eliminate redundancy in your solution.

In particular, make sure that main contains no System.out.println statements except for blank lines, that any System.out.println statement(s) repeated are captured in a method that is called just once, and that the same System.out.println statement never appears in two places in the code.

    *****
  *********
*************

    *****
  *********
*************
* | | | | | *
*************
    *****
  *********
*************

    *****
  *********
*************
    *****
* | | | | | *
* | | | | | *
    *****
    *****
*/


public class Lanterns {
    public static void main(String[]args) {
        stackOne();
        System.out.println();
        stackOne();
        middle();
        lineLarge();
        stackOne();
        System.out.println();
        stackOne();
        stackTwo();
        line();
        
    }
    public static void line() {
        System.out.println("    *****");
    }
    public static void lineLarge() {
        System.out.println("*************");
    }
    public static void stackOne() {
        line();
        System.out.println("  *********");
        lineLarge();
    }
    public static void middle() {
        System.out.println("* | | | | | *");
    }
    public static void stackTwo() {
        line();
        middle();
        middle();
        line();
    }
}