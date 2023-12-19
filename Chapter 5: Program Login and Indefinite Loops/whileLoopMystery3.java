/* Given the following method:

public static int mystery(int x, int y) {
    while (x != 0 && y != 0) {
        if (x < y) {
            y = y - x;
        } else {
            x = x - y;
        }
    }
    return x + y;
}
Write the value returned by each of the following calls. */


/*
mystery(3, 3) : 3
mystery(5, 3) : 1
mystery(2, 6) : 2
mystery(12, 18) : 6
mystery(30, 75) : 15
*/