/* Write a method named doubleSpace that accepts a Scanner for an input file and a PrintStream for an output file as its parameters, 
writing into the output file a double-spaced version of the text in the input file. You can achieve this task by inserting a blank line between each line of output. */


public static void doubleSpace (Scanner input, PrintStream output) {
    
        while(input.hasNextLine()) {
            String currentLine = input.nextLine();
            Scanner string = new Scanner (currentLine);
            while (string.hasNext()){
                output.print(string.next() + " ");
            }
            output.println();
            output.println();
        }     
}