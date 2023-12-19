/* Write a method called printDesign that produces the following output. 
Use nested for loops to capture the structure of the figure.

-----1-----
----333----
---55555---
--7777777--
-999999999-
*/


public static void printDesign() {
    
    for (int i = 1; i <= 9; i += 2) {
        
        for (int e = 0; e <= 9-i; e +=2) {
            System.out.print("-");
        }
        
        for (int a = 1; a <= i; a++) {
                System.out.print(i);
        }
        for (int c = 0; c <= 9 - i; c +=2) {
             System.out.print("-");
        }    
        System.out.println();
    }
}
