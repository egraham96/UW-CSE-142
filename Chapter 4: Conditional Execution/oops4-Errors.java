/* The following program contains 7 errors. 
Correct the errors and submit a working version of the program. 
The corrected version of the program should produce the following output:

a is the smallest! */


public class Oops4 {
    
        public static void main(String[] args) {
            int a = 7, b = 42;
            int smaller = minimum(a, b);
            if (smaller == a) {
                System.out.println("a is the smallest!");
            }
        }
    
        public static int minimum(int a, int b) {
            int smaller;
            if (a < b) {
                return smaller = a;
            } else {
               return smaller = b;
            }
        }
}