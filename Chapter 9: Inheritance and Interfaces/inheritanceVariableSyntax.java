/* Consider the following classes:

public class Vehicle {...}
public class Car extends Vehicle {...}
public class SUV extends Car {...}

Which of the following are legal statements? */


/*
Vehicle v = new Car();
Car c = new SUV();
SUV s = new SUV();
Vehicle v = new SUV();
*/