/* Write a complete Java program that prints itself to the console as output. 
Assume that the program is stored in a file named PrintMyself.java, and make your code open the file PrintMyself.java 
and print its contents to the console. */


public class PrintMyself {
        public static void main(String[] args) throws FileNotFoundException {
            Scanner in = new Scanner (new File("PrintMyself.java"));
            printFile(in);
        }
        
        public static void printFile (Scanner input) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
        }
}