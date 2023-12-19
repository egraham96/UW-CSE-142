/* Consider a file called readme.txt that has the following contents:

6.7     This file has
        several input lines.

  10 20         30   40

test
What would be the output from the following code when it is run on the readme.txt file?

Scanner input = new Scanner(new File("readme.txt"));
int count = 0;
while (input.hasNextLine()) {
    System.out.println("input: " + input.nextLine());
    count++;
}
System.out.println(count + " total"); */


/*
input: 6.7     This file has
input:         several input lines.
input: 
input:   10 20         30   40
input: 
input: test
6 total
*/