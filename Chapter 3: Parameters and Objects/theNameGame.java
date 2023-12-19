/* Write a complete program called "TheNameGame", where the user inputs a first and last name and a song in the following format is printed about their first, then last, name. 
Use a method to avoid redundancy.

What is your name? Fifty Cent
Fifty Fifty, bo-Bifty
Banana-fana fo-Fifty
Fee-fi-mo-Mifty
FIFTY!

Cent Cent, bo-Bent
Banana-fana fo-Fent
Fee-fi-mo-Ment
CENT! 
*/


import java.util.*;

public class TheNameGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = input.nextLine();
		
		int firstSpace = name.indexOf(" ");
		String firstName = name.substring(0, firstSpace);
		String lastName = name.substring(firstSpace + 1);	
		
		singSong(firstName);
		System.out.println();
		singSong(lastName);
	}
	
	public static void singSong(String name) {
		String suffix = name.substring(1);
		System.out.println(name + " " + name + ", bo-B" + suffix);
		System.out.println("Banana-fana fo-F" + suffix);
		System.out.println("Fee-fi-mo-M" + suffix);
		System.out.println(name.toUpperCase() + "!");
	}
}
