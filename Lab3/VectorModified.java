// Create a package which contains the class and the test class
package Lab3;

import java.util.*;
//Create a class called VectorModified
public class VectorModified {
    //This class has 2 private data field (x,y)
    private double x;
    private double y;

    //Default Construstor
    VectorModified (){}

    //Constructor that intializes x and y
    VectorModified(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Geters
    double getX(){
        return x;
    }
    double getY(){
        return y;
    }

    //Seters
    void setX(double x){
        this.x = x;
    }
    void setY(double y){
        this.y = y;
    }

    //A method that calculates the magnitude of the vector
    double magnitude(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    //A method that calculates the angle of the vector
    double angle(){
        return Math.atan(y/x);
    }

    //A method that print information about the vector in 2 formats (xi+yj) and (Magnitude[angle])
    void print(){
        System.out.println(x + "i + " + y + "j");
        System.out.println(this.magnitude() + "[" + this.angle() + "]");
    }

    //A static method that adds the 2 passed
    static VectorModified add(VectorModified v, VectorModified w){
        VectorModified temp = new VectorModified();
        temp.x = v.x + w.x;
        temp.y = v.y + w.y;
        return temp; 
    }

    //A static method that subtracts the 2 passed
    static VectorModified sub(VectorModified v, VectorModified w){
        VectorModified temp = new VectorModified();
        temp.x = v.x - w.x;
        temp.y = v.y - w.y;
        return temp; 
    }
    //A method that sets the object's data based on the information the user entered
    void read(){
        //Create a Scanner object to input from command line
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        //Takes the double entered and sets X
        this.setX(input.nextDouble());
        //Takes the double entered and sets Y
        System.out.print("Enter the value of y: ");
        this.setY(input.nextDouble());
    }
}
