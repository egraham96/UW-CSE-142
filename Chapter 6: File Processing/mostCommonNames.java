/* Write a method named mostCommonNames that accepts as its parameter a Scanner for an input file whose data is a sequence of lines, 
where each line contains a set of first names separated by spaces. 
Your method should print the name that occurs the most frequently in each line of the file. 
The method should also return the total number of unique names that were seen in the file. 
You may assume that no name appears on more than one line of the file.

Each line should be considered separately from the others. On a given line, some names are repeated; all occurrences of a given name will appear consecutively in the file. 
If two or more names occur the same number of times, print the one that appears earlier in the file. If every single name on a given line is different, 
every name will have 1 occurrence, so you should just print the first name in the file.

For example, if the input file contains the following text:

Benson Eric   Eric  Marty Kim  Kim Kim   Jenny  Nancy Nancy  Nancy  Paul  Paul
Stuart Stuart Stuart Ethan Alyssa Alyssa Helene Jessica Jessica Jessica Jessica
Jared  Alisa Yuki   Catriona  Cody   Coral   Trent Kevin  Ben Stefanie Kenneth

On the first line, there is one occurrence of the name Benson, two occurrences of Eric, 
one occurrence of Marty, three occurrences of Kim, one of Jenny, three of Nancy, and two 
of Paul. Kim and Nancy appear the most times (3), and Kim appears first in the file. So for that line, 
your method should print that the most common is Kim. The complete output would be the following. 
The method would also return 23, since there are 23 unique names in the entire file.

Most common: Kim
Most common: Jessica
Most common: Jared

You may assume that there is at least one line of data in the file and that each line will contain at least one name. */

public int mostCommonNames(Scanner sc) {
    
        int unique = 0;
        
        while(sc.hasNextLine()) {
            Scanner line = new Scanner(sc.nextLine());
            unique++;
            int maxCount = 1;
            String maxName = line.next();
            int count = 1;
            String prevName = maxName;
            
            while(line.hasNext()) {
                String currentName = line.next();
                
                if(currentName.equals(prevName)) {
                    count++;
                } else {
                    if(count > maxCount) {
                        maxCount = count;
                        maxName = prevName;
                    }
                    
                    unique++;
                    count = 1;
                    prevName = currentName;
                }
            }
            
            if(count > maxCount)
                maxName = prevName;
            
            System.out.println("Most common: " + maxName);
        }
        
        return unique;
}