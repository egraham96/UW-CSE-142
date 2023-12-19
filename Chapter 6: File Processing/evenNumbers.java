/* Write a method named evenNumbers that accepts a Scanner as a parameter reading input from a file containing a series of integers, and report various statistics about the integers. You may assume that there is at least one integer in the file. Report the total number of numbers, the sum of the numbers, the count of even numbers and the percent of even numbers. For example, if a Scannerinput on file numbers.txt contains the following text:

5 7 2 8 9 10 12 98 7 14 20 22
then the call evenNumbers(input); should produce the following output:

12 numbers, sum = 214
8 evens (66.67%) */


public static void evenNumbers (Scanner console) {
    
         int numbers = 0;
         int currentInt = console.nextInt();
         numbers++;
         int evens = 0;
         if (currentInt % 2 == 0){
             evens++;
         }
         int sum = currentInt;
        
        while (console.hasNextInt()) {
            int val = console.nextInt();
            numbers++;
            sum += val;
            
            if(val % 2 == 0 || val == 0){
                evens++;
            }
        }
      
        
        double percent = ((double) evens/numbers) * 100;
        double d = 2.34568;
        DecimalFormat f = new DecimalFormat("#0.00");
        String formatPercent = f.format(percent);
        
        System.out.println(numbers + " numbers, " + "sum = " + sum);
        System.out.println(evens + " evens " + "(" + formatPercent + "%)");
}