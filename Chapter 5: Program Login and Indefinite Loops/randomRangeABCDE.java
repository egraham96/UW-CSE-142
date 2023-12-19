/* Consider the following code. What range of values can each variable (a, b, c, d, and e) have? Specify ranges with a dash i.e. "1 - 10" and separate multiple numbers with commas i.e. "1,2,3,4,5,etc..."

Random rand = new Random();
int a = rand.nextInt(100);
int b = rand.nextInt(20) + 50;
int c = rand.nextInt(20 + 50);
int d = rand.nextInt(100) - 20;
int e = rand.nextInt(10) * 4; */

/*
a) 0 - 99
b) 50 - 69
c) 0 - 69
d) -20 - 79
e) 0, 4, 8, 12, 16, 20, 24, 28, 32, 36
*/