/* What output is produced by the following program?

public class CharMystery {
    public static void printRange(char startLetter, char endLetter) {
        for (char letter = startLetter; letter <= endLetter; letter++) {
            System.out.print(letter);
        }
        System.out.println();
    }
​
    public static void main(String[] args) {
        printRange('e', 'g');
        printRange('n', 's');
        printRange('z', 'a');
        printRange('q', 'r');
    }
} */


/*
printRange('e', 'g') : efg
printRangE('n', 's') : nopqrs
printRange('z', 'a') : 
printRange('q', 'r') : qr
*/