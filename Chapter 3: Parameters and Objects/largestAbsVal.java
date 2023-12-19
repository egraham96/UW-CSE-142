// Write a method largestAbsVal that accepts three integers as parameters and returns the largest of their three absolute values. For example, a call of largestAbsVal(7, -2, -11) would return 11, and a call of largestAbsVal(-4, 5, 2) would return 5. 


public static int largestAbsVal (int NumberOne, int NumberTwo, int NumberThree) {
    int tempMax = Math.max((Math.abs(NumberOne)), (Math.abs(NumberTwo)));
    return Math.max(tempMax, (Math.abs(NumberThree)));
}
