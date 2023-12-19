/* For each of the following do/while loops, how many times will the loop execute its body? Remember that "zero," "infinity," and "unknown" are legal answers.

1.
int x = 1;
do {
    System.out.print(x + " ");
    x += 10;
} while (x < 100);

2.
int max = 10;
do {
    System.out.println("count down: " + max);
    max--;
} while (max < 10);

3.
int x = 250;
do {
    System.out.println(x);
} while (x % 3 != 0);

4.
int x = 100;
do {
    System.out.println(x);
    x = x / 2;
} while (x % 2 == 0);

5.
int x = 2;
do {
    System.out.print(x + " ");
    x *= x;
} while (x < 200);

6.
String word = "a";
do {
    word = "b" + word + "b";
} while (word.length() < 10);
System.out.println(word);

7.
int x = 100;
do {
    System.out.println(x / 10);
    x = x / 2;
} while (x > 0);

8.
String str = "/\\";
do {
    str += str;
} while (str.length() < 10);
System.out.println(str);
*/


/*
1) 10
2) Infinity
3) Infinity
4) 2
5) 3
6) 5
7) 7
8) 3
*/
