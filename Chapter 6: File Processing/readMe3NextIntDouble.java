/* Consider a file called readme.txt that has the following contents:

6.7     This file has
        several input lines.

  10 20         30   40

test
What would be the output from the code in the previous exercise (shown below) if the calls to hasNext and next were replaced by calls to hasNextInt and nextInt, respectively? How about hasNextDouble and nextDouble ?

Scanner input = new Scanner(new File("readme.txt"));
int count = 0;
while (input.hasNext()) {
    System.out.println("input: " + input.next());
    count++;
}
System.out.println(count + " total"); */


/*
hasNextInt/nextInt : 0 total
hasNextDouble/nextDouble :  input: 6.7
                            1 total
 */