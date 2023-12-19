/* Write a method named inputStats that takes a Scanner representing a file as a parameter and that reports various statistics about the file's text. 
In particular, your method should report the number of lines in the file, the longest line, the number of tokens on each line, and the length of the longest token on each line. 
You may assume that the input file has at least one line of input and that each line has at least one token. For example, if a Scanner named input on file carroll.txt contains the following text:

"Beware the Jabberwock, my son,
the jaws that bite, the claws that catch,
Beware the JubJub bird and shun
the frumious bandersnatch."
then the call inputStats(input); should produce the following output:

Line 1 has 5 tokens (longest = 11)
Line 2 has 8 tokens (longest = 6)
Line 3 has 6 tokens (longest = 6)
Line 4 has 3 tokens (longest = 14)

Longest line: the jaws that bite, the claws that catch, */


public static void inputStats (Scanner input) {
    
        int numberOfLines = 1;
        String longestLine = "";
        int maxNumberTokens = 0;
        
        while (input.hasNextLine()) {
            
            Scanner currentLine = new Scanner (input.nextLine());
            String currentString = "";
            int lengthLongestToken = 1;
            int numberTokens = 0;
            
            while (currentLine.hasNext()) {
                numberTokens++;
                String currentToken = currentLine.next();
                currentString += currentToken + " ";
                int length = currentToken.length();
                
                if (length > lengthLongestToken) {
                    lengthLongestToken = length;
                }
                if (numberTokens > maxNumberTokens) {
                    maxNumberTokens = numberTokens;
                }
                if (longestLine.length() < currentString.length()){
                    longestLine = currentString;
                }
                
            }
            System.out.println("Line " + numberOfLines + " has " + numberTokens + " tokens " + "(longest = " + lengthLongestToken + ")");
            numberOfLines++;
       }     
        System.out.println("Longest line: " + longestLine);
}