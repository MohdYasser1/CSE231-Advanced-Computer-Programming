package Lab5;

import javafx.geometry.Point2D;

//A public class to test the canvas class
public class CanvasDriver
{
    public static void main(String[] args) {
        //Creating the shapes
        Line l1 = new Line(new Point2D(1, 2), new Point2D(5, 10));
        Rectangle r1 = new Rectangle(new Point2D(4, 2), 5, 10);
        Ellipse e1 = new Ellipse(new Point2D(0, 9), 12, 9);
        Line l2 = new Line(new Point2D(5, 5), new Point2D(10, 10));
        //Creating the canvas
        Canvas c = new Canvas();
        //Add the shaoes to the canvas
        c.AddShape(l1);
        c.AddShape(r1);
        c.AddShape(e1);
        c.AddShape(l2);
        //Draeing the canvas
        System.out.println("Canvas Before removing the last line:");
        c.DrawAll();
        //Removing a shape from the canvas and redrawing the canvas
        c.RemoveShape((GeometricShapes)l2);
        System.out.println("Canavs After removing the last line:");
        c.DrawAll();
        //Getting the shape closest to the origin
        System.out.println("The Shape closest to the origin is: ");
        c.GetShape(new Point2D(0.0, 0.0)).draw();
    }
}