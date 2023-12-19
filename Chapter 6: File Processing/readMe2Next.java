/* Consider a file called readme.txt that has the following contents:

6.7     This file has
        several input lines.

  10 20         30   40

test
What would be the output from the code in the previous exercise if the calls to hasNextLine and nextLine were replaced by calls to hasNext and next, respectively, as shown below?

Scanner input = new Scanner(new File("readme.txt"));
int count = 0;
while (input.hasNext()) {
    System.out.println("input: " + input.next());
    count++;
}
System.out.println(count + " total"); */


/*
input: 6.7
input: This
input: file
input: has
input: several
input: input
input: lines.
input: 10
input: 20
input: 30
input: 40
input: test
12 total

*/