/* Write a method named digitSum that accepts an integer as a parameter and returns the sum of the digits of that number. 
For example, digitSum(29107) returns 2+9+1+0+7 or 19. For negative numbers, return the same value that would result if the number were positive. 
For example, digitSum(-456) returns 4+5+6 or 15. */


public static int digitSum (int input) {
            String inputNumber = Integer.toString(Math.abs(input));
            int sum = 0;
            for (int i = 0; i < inputNumber.length(); i++){
                int num = Character.getNumericValue(inputNumber.charAt(i));
                System.out.print("im num" + num);
                num = Math.abs(num);
                sum += num;
            }
            return sum;
}