/* Write a method named boyGirl that accepts a Scanner as a parameter. 
The Scanner is reading its input from a file containing a series of names followed by integers. 
The names alternate between boys' names and girls' names. Your method should compute the absolute difference between the sum of the boys' integers and the sum of the girls' integers. 
The input could end with either a boy or girl; you may not assume that it contains an even number of names. If the input file tas.txt contains the following text:

Steve 3 Sylvia 7 Craig 14 Lisa 13 Brian 4 Charlotte 9 Jordan 6
then your method could be called in the following way:

Scanner input = new Scanner(new File("tas.txt"));
boyGirl(input);
and should produce the following output, since the boys' sum is 27 and the girls' sum is 29:

4 boys, 3 girls
Difference between boys' and girls' sums: 2 */


public static void boyGirl(Scanner console) {
    
        int boy = 0;
        int bSum = 0;
        int girl = 0;
        int gSum = 0;
        int i = 2;
        
        while (console.hasNext()) {
            console.next();
            if ((i / 2) % 2 != 0) {
                bSum += console.nextInt();
                boy++;
            } else {
                gSum += console.nextInt();
                girl++;
            }
            i += 2;
        }
        
        System.out.println(boy + " boys, " + girl + " girls");
        System.out.println("Difference between boys' and girls' sums: " + Math.abs(bSum - gSum));
}