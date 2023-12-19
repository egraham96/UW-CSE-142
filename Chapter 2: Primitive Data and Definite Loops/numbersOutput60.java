/* It's common to print a rotating, increasing list of single-digit numbers at the start of a program's output 
as a visual guide to number the columns of the output to follow. 
With this in mind, write nested for loops to produce the following output, with each line 60 characters wide:

         |         |         |         |         |         |
123456789012345678901234567890123456789012345678901234567890 
*/


/*
for (int c = 1; c <= 6; c++){
    for (int i = 0; i <9; i++) {
         System.out.print(" ");
    }
    System.out.print("|");
}

System.out.println();
for (int j = 1; j <= 6; j++) {
    for (int e = 1; e <= 9; e++) {
        System.out.print(e);
    }
       System.out.print("0");    
}
*/