package Lab5;

import javafx.geometry.Point2D;
import java.util.ArrayList;

//A public class to implement a canvas containing shapes
public class Canvas
{
    //This class has an ArrayList to store the shapes
    private ArrayList<GeometricShapes> canvas;
    
    //Public Constructor
    public Canvas() {
        this.canvas = new ArrayList<GeometricShapes>();
    }
    
    //A method to add a shape to the canvas
    public void AddShape(GeometricShapes shape) {
        this.canvas.add(shape);
    }
    
    //A method to remove a shape from a canvas
    public void RemoveShape(GeometricShapes shape) {
        this.canvas.remove(shape);
    }
    
    //This method get the closest shape from the origin
    public GeometricShapes GetShape(Point2D point) {
        double minDist = Math.abs(this.canvas.get(0).getStart().distance(point));
        int minId = 0;
        for (int i = 1; i < this.canvas.size(); i++) {
            if (Math.abs(this.canvas.get(i).getStart().distance(point)) < minDist) {
                minDist = Math.abs(this.canvas.get(i).getStart().distance(point));
                minId = i;
            }
        }
        return this.canvas.get(minId);
    }
    
    //This method draws all the shapes in the canvas
    public void DrawAll() {
        for (GeometricShapes shape : this.canvas) {
            shape.draw();
        }
    }
}