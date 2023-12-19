/* Write a complete Java program in a class named Egg that displays the following output:
  _______
 /       \
/         \
-"-'-"-'-"-
\         /
 \_______/
*/


public class Egg {
    public static void main(String[] args){
        line();
        top1();
        top2();
        middle();
        bottom1();
        bottom2();
    }
    public static void line() {
        System.out.println("  _______  ");
    }
    public static void top1() {
        System.out.println(" /       \\ ");
    }
    public static void top2() {
        System.out.println("/         \\");                   
    }
    public static void middle() {
        System.out.println("-\"-'-\"-'-\"-");
    }
    public static void bottom1() {
        System.out.println("\\         /");
    }
    public static void bottom2() {
        System.out.println(" \\_______/");                   
    }
}
