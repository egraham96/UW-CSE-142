/* The following program redundantly repeats the same expressions many times. 
Modify the program to remove all redundant expressions using variables of appropriate types. 
(Your variables should be used to help solve the overall problem. 
You must use a sufficient number of variables to receive credit for solving this problem. 
Declare and initialize each variable in its own statement on its own line.) 
*/


public class ComputePay {
    public static void main(String[] args) {
        System.out.println("My total hours worked:");
        int total = 4 + 5 + 8 + 4;
        System.out.println(total);

        System.out.println("My hourly salary:");
        double salary = 8.75;
        System.out.println("$" + salary);

        System.out.println("My total pay:");
        double totalPay = total * salary;
        System.out.println(totalPay);

        System.out.println("My taxes owed:"); // 20% tax
        double taxesOwed = totalPay * 0.20;
        System.out.println(taxesOwed);
    }
}
