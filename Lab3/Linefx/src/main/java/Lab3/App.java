package Lab3;

//Import the JavaFX Library
import javafx.geometry.Point2D;

public class App {
    // A driver program that tests the program
        public static void main(String[] args){
        App line = new App(2,2,10,5);
        line.print();
    }

    //2 data members the point of type (Point2D) and a vector of type (VectorModified)
    private Point2D point;
    private VectorModified vector;
    //A constructor that takes in objects and creates the line
    App(Point2D point, VectorModified vector){
        this.point = point;
        this.vector = vector;
    }
    //A cinstrustor that takes in information and makes the line
    App(double xp, double yp, double x, double y){
        this.point = new Point2D(xp, yp);
        this.vector = new VectorModified(x, y);
    }
    //A method that prints the position and direction of the line
    public void print(){
        System.out.println("Position: x= " + point.getX() + ", y= " + point.getY());
        System.out.println("Direction: ");
        vector.print();
    }
}
