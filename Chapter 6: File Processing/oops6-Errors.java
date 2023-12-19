/* The following program contains 6 errors. Correct the errors and submit a working version of the program. 
The corrected version of the program should produce the following output:

Lines: 5
Words: 21
when it is run on the following input file, example.txt:

hello  how    are you
1 2 3 4

I am fine
This line has a large number of words on it */


import java.io.*;
import java.util.*;

public class Oops6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("example.txt"));
        countWords(in);
    }

    public static void countWords(Scanner input) {
        int lineCount = 0;
        int wordCount = 0;

        while (input.hasNextLine()) {
            String line = input.nextLine();   // read one line
            lineCount++;
            Scanner lineScan = new Scanner(line);
            while (lineScan.hasNext()) {         // tokens in line
                String word = lineScan.next();
                wordCount++;
            }
        }
        
        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
    }
}