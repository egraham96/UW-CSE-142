/* Write a program called FarewellGoodBye that prints the following lyrics. Use static methods to show structure and eliminate redundancy in your solution.

Farewell,
goodbye,
au revoir,
good night!
It's time, to go,
and I'll be out of sight!

Farewell,
goodbye,
au revoir,
take care!
I'll say, goodbye,
that's neither here nor there!

Farewell,
goodbye,
au revoir,
see you later!
I hope, you think,
I'm a lover, not a hater!
*/


public class FarewellGoodBye {
    public static void main(String[]args) {
        stanzaOne();
        System.out.println("good night!\nIt's time, to go,\nand I'll be out of sight!");
        System.out.println();
        stanzaOne();
        System.out.println("take care!\nI'll say, goodbye,\nthat's neither here nor there!");
        System.out.println();
        stanzaOne();
        System.out.println("see you later!\nI hope, you think,\nI'm a lover, not a hater!");
        
    }
    
    public static void stanzaOne() {
        System.out.println("Farewell,\ngoodbye,\nau revoir,");
    }
    
}