//Create a class called "Circle"
public class Circle{
    //main class
    public static void main(String[] args){
        //define the radius and store it in a varible of double type
        double radius = 3.2;
        //calculate the area and the perimeter and store it in varibles of double type
        //Used the Math class to get the value of PI
        double area = radius *radius * (double) Math.PI;
        double perimeter = 2 * (double)Math.PI * radius;
        //print out the area and the perimeter
        System.out.println("The Area of the circle is " + area + " and the perimeter is " + perimeter);
    }
}

