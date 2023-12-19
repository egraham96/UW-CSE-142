/* For each of the following while loops, how many times will the loop execute its body? Remember that "zero," "infinity," and "unknown" are legal answers.

1.
int x = 1;
while (x < 100) {
    System.out.print(x + " ");
    x += 10;
}
2.
int max = 10;
while (max < 10) {
    System.out.println("count down: " + max);
    max--;
}
3.
int x = 250;
while (x % 3 != 0) {
    System.out.println(x);
}
4.
int x = 2;
while (x < 200) {
    System.out.print(x + " ");
     x *= x;
}
5.
String word = "a";
while (word.length() < 10) {
    word = "b" + word + "b";
}
System.out.println(word);
6.
​
int x = 100;
while (x > 0) {
    System.out.println(x / 10);
    x = x / 2;
}
*/


/*
1) 10
2) 0
3) Infinity
4) 3
5) 5
6) 7
*/