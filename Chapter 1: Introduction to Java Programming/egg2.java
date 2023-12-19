/*
 Write a complete Java program in a class named Egg2 that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-
  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-
\         /
 \_______/
  _______
 /       \
/         \
-"-'-"-'-"-
\         /
 \_______/
*/


public class Egg2 {
    public static void main(String[] args){
        top();
        bottom();
        middle();
        top();
        bottom();
        middle();
        bottom();
        top();
        middle();
        bottom();
    }
    public static void top() {
        System.out.println("  _______  ");
        System.out.println(" /       \\ ");
        System.out.println("/         \\");
    }
    public static void middle() {
        System.out.println("-\"-'-\"-'-\"-");
    }
    public static void bottom() {
        System.out.println("\\         /");
        System.out.println(" \\_______/"); 
    }
}
