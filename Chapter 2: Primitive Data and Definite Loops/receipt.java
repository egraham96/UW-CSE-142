/* The following program redundantly repeats the same expressions many times. 
Modify the program to remove all redundant expressions using variables of appropriate types.
*/


public class Receipt {
    public static void main(String[] args) {
        System.out.println("Subtotal:");
        int subtotal = 38 + 40 + 30;
        System.out.println(subtotal);
        System.out.println("Tax:");
        double tax = subtotal * .08;
        System.out.println(tax);
        System.out.println("Tip:");
        double tip = subtotal * .15;
        System.out.println(tip);
        double total = subtotal + tax + tip;
        System.out.println("Total:");
        System.out.println(total);

    }
}
