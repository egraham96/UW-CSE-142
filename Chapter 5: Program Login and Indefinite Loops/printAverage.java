/* Write a method named printAverage that accepts a Scanner for the console as a parameter and repeatedly prompts the user for numbers. Once any number less than zero is typed, the average of all non-negative numbers typed is displayed. Display the average as a double, and do not round it. For example, a call to your method might look like this:

Scanner console = new Scanner(System.in);
printAverage(console);
The following is one example log of execution for your method:

Type a number: 7
Type a number: 4
Type a number: 16
Type a number: -4
Average was 9.0
If the first number typed is negative, do not print an average. For example:

Type a number: -2 */


public static void printAverage (Scanner console) {
        int numbersEntered = 0;
        double sum = 0.0;
        int currentNumber;
        do {
            System.out.print("Type a number: ");
            currentNumber = console.nextInt();
            if (currentNumber >= 0){
            sum += currentNumber;
            numbersEntered++;
            }
        } while (currentNumber >= 0);
        if (numbersEntered > 0){
        double average = sum/numbersEntered;
        System.out.println("Average was " + average);
        }
}