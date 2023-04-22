package Lab5;

import javafx.geometry.Point2D;

//Create an abstract class called GeometricShapes
public abstract class GeometricShapes{
    
    //This class has a private data member called start of type Point2D
    private javafx.geometry.Point2D start;
    
    //Public Constructor
    public GeometricShapes(javafx.geometry.Point2D start){
        this.start = start;
    }
    
    //Accessor
    public final javafx.geometry.Point2D getStart(){
        return this.start;
    }
    public final void setStart(javafx.geometry.Point2D start){
        this.start = start;
    }
    //A abstract method that prints the information of the shape
    public abstract void draw();
    //A method to print the line's start information
    public final void printStart(){
        System.out.print("Start: x:"+this.getStart().getX() +" y:" +this.getStart().getY());      
    }
}

//A final class called Line that inherits from GeometricShapes
final class Line extends GeometricShapes{
    
    //This class has an extra data member called end of type Point2D
    private javafx.geometry.Point2D end;
        
    //Public Constructor
    public Line(javafx.geometry.Point2D start, javafx.geometry.Point2D end){
        //Call the super constructor to intialize start
        super(start);
        this.end = end;
    }
    
    //Accessor
    public final javafx.geometry.Point2D getEnd(){
        return this.end;
    }
    //Overriding the draw method and printing the Line's information
    @Override
    public final void draw(){
        System.out.println("Line:");
        super.printStart();
        System.out.println("  End: x:" +this.getEnd().getX() +" y:" +this.getEnd().getY());
        System.out.println();
    }
}

//A final class class called Rectangle that inherits from GeometricShapes
final class Rectangle extends GeometricShapes{
    
    //This class has an extra data member length(double) and width(double)
    private double length;
    private double width;
    
    //Public Constructor
    public Rectangle(javafx.geometry.Point2D start, double length, double width){
        super(start);
        this.length = length;
        this.width = width;
    }
    
    //Accessor
    public final double getLength(){
        return this.length;
    }
    public final double getWidth(){
        return this.width;
    }
    //Overriding the draw method and printing the Rectangles's information
    @Override
    public final void draw(){
        System.out.println("Rectangle:");
        super.printStart();
        System.out.print("  Length: " +this.length);
        System.out.println("  Width: " +this.width);
        System.out.println();
    }
}

//A final class called Ellipse that inheirts from GeometricShapes
final class Ellipse extends GeometricShapes{
    
    //This class has extra data members length(double) width(double)
    private double length;
    private double width;
    
    //Public Constructor
    public Ellipse(javafx.geometry.Point2D start, double length, double width){
        super(start);
        this.length = length;
        this.width = width;
    }
    
    //Accessor
    public final double getLength(){
        return this.length;
    }
    public final double getWidth(){
        return this.width;
    }
    //Overriding the draw method and printing the Ellipse's information
    @Override
    public final void draw(){
        System.out.println("Ellipse: ");
        super.printStart();
        System.out.print("  Length: " +this.length);
        System.out.println("  Width: " +this.width);
        System.out.println();
    }  
} 



