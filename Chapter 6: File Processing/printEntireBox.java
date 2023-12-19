/* Write a method named printBox that accepts two parameters: a Scanner representing an input file, and an integer representing the length of the longest line of input in that file. Your method should print the contents of the file to the console, but print them inside a box figure. For example, if the file example.txt contains the following input data:

This is some
text here.
Then the following would be the output of your method, when passed a Scanner on that file and the integer 12 as parameters:

+--------------+
| This is some |
| text here.   |
+--------------+ */


public static void printBox(Scanner input, int width) {
    
        printTopBottom(width);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.print("| " + line);
            for (int i = line.length(); i < width; i++) { 
                System.out.print(" ");
            }
            System.out.println(" |");
        }
        printTopBottom(width);
}
    
    public static void printTopBottom(int width) {
        
        System.out.print("+");
        for (int i = 0; i < width + 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
}