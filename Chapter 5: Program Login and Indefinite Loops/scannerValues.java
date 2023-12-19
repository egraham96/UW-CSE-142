/* Consider the following code:

Scanner console = new Scanner(System.in);
System.out.print("Type something for me! ");
if (console.hasNextInt()) {
    int number = console.nextInt();
    System.out.println("Your IQ is " + number);
} else if (console.hasNext()) {
    String token = console.next();
    System.out.println("Your name is " + token);
}
What is the output when the user types the following values? (You don't need to include the "Type something for me!" prompt or the user's input; just write the line of output that would appear after the user is done typing and presses Enter.) */


/*
Jane : Your name is Jane
56 : Your IQ is 56
56.2 : Your name is 56.2
*/