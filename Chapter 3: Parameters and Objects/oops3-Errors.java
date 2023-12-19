/* The following program contains 9 errors. Correct the errors and submit a working version of the program. The corrected version of the program should produce the following output:

x = 10.01 and y = 8.0
x = 10.01 and y = 867.5309
The value from main is: 867.5309
z = 5
*/


public class Oops3 {
    public static void main(String args[]) {
        double y = 867.5309;
        double x = 10.01;
        double em = 8.0;
        printer(x, y, em);
    }

    public static void printer(double x, double y, double em) {
        int z = 5;
        System.out.println("x = " + x + " " + "and y = " + em);
        System.out.println("x = " + x + " " + "and y = " + y);
        System.out.println("The value from main is: " + y);
        System.out.println("z = " + z);
    }
}
