//Creat a class called rectangle
public class Rectangle{
    //main class
    public static void main(String[] args){
        //define width and height varibles as double
        double width = 4; 
        double height = 5.5;
        //calculate the area and parimeter and put in a varibles of double type
        double area = width * height;
        double perimeter = (2 * width) + (2 * height);
        //print out the area and the perimeter
        System.out.println("The Area of the rectangle is " + area + " and the perimeter is " + perimeter);
    }
}