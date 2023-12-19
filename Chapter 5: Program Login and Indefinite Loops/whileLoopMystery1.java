/* Given the following method:

public static void mystery(int x) {
    int y = 1;
    int z = 0;
    while (2 * y <= x) {
        y = y * 2;
        z++;
    }
    System.out.println(y + " " + z);
}
Write the output of each of the following calls. */


/*
mystery(1) : 1 0
mystery(6) : 4 2
mystery(19) : 16 4
mystery(39) : 32 5
mystery(74) : 64 6
*/