/* Given the following file contents, what will be the output from each of the following code fragments?

the quick brown
   fox   jumps

       over
the lazy    dog
// 1.
Scanner input = new Scanner(new File("brownfox.txt"));
while (input.hasNextLine()) {
    String line = input.nextLine();
    System.out.println(line);
}
// 2.
Scanner input = new Scanner(new File("brownfox.txt"));
while (input.hasNext()) {
    String token = input.next();
    System.out.println(token);
} */


/*
1)
the quick brown
   fox   jumps

       over
the lazy    dog

2) 
the
quick
brown
fox
jumps
over
the 
lazy
dog
*/