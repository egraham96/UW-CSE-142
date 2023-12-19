/* Write a method called triangleArea that accepts the three side lengths of a triangle (all real numbers) as parameters and returns the area of a triangle with those side lengths. 
For example, the call triangleArea (8, 5.2, 7.1) should return 18.151176098258745. 
To compute the area, use Heron's formula, which states that the area of a triangle whose three sides have lengths a, b, and c, is the following. 
The formula is based on the computed value s, a length equal to half the perimeter of the triangle:

area = √ (s (s-a)(s-b)(s-c))
where s = (a + b + c) / 2
*/


public static double triangleArea (double side1, double side2, double side3) {
    double s = (side1 + side2 + side3) / 2.0;
    double area = Math.sqrt((s * (s - side1) * (s - side2) * (s- side3)));
    return area;
}
