/* Write a method named evenSum that prompts the user for many integers and print the total even sum and maximum of the even numbers. 
You may assume that the user types at least one non-negative even integer.

how many integers? 4
next integer? 2
next integer? 9
next integer? 18
next integer? 4
even sum = 24
even max = 18
*/

public static void evenSum () {
    
        Scanner console = new Scanner (System.in);
        System.out.print("how many integers? ");
        int numberInts = console.nextInt();
        int max = -100000;
        int sum = 0;
        for (int i = 1; i <= numberInts; i++) {
            System.out.print("next integer? ");
            int currentInt = console.nextInt();
            if (currentInt > max && currentInt % 2 == 0) {
                max = currentInt;
            }
            if (currentInt % 2 == 0) {
            sum = sum + currentInt;
            }
        }
        System.out.println("even sum = " + sum);
        System.out.println("even max = " + max);
}