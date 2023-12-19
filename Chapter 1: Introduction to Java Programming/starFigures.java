/*
 Write a complete Java program in a class named StarFigures that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

*****
*****
 * *
  *
 * *

*****
*****
 * *
  *
 * *
*****
*****

  *
  *
  *
*****
*****
 * *
  *
 * *
 */


public class StarFigures {
    public static void main(String[] args) {
        block();
        System.out.println();
        block();
        twoLine();
        System.out.println();
        soloStar();
        soloStar();
        soloStar();
        block();
        
    }
    public static void twoLine() {
        System.out.println("*****");
        System.out.println("*****");
    }
    public static void soloStar() {
        System.out.println("  *");
    }
    public static void star() {
        System.out.println(" * *");
        soloStar();
        System.out.println(" * *");
    }
    public static void block() {
        twoLine();
        star();
    }
}