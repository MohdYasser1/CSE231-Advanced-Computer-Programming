package Lab5;

//This public class called Diamond represents the Diamond Shape
public class Diamond extends GeometricShapes implements Moveable, java.lang.Comparable<Diamond>{
    //This class adds 2 data members length(double) and width(double)
    private double length;
    private double width;
    
    //Public Consructor
    public Diamond(javafx.geometry.Point2D start, double length, double width){
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
    
    //Overriding the drae function to Draw the Diamond
    @Override
    public final void draw(){
        System.out.println("Diamond:");
        super.printStart();
        System.out.print("  Length: " +this.length);
        System.out.println("  Width: " +this.width);
        System.out.println();
    }
  
    //Overriding the move method in the Moveable interface
    @Override
    public final void move(double dx, double dy){
        this.setStart(new javafx.geometry.Point2D(this.getStart().getX() + dx, this.getStart().getY() + dy));
    }
    
    //Overriding the CompareTo method in the Comapareable interface
    //We are comparing in terms of start X coordinates and then Y coordinates
    //It compares which is further than the origin
    @Override
    public final int compareTo(Diamond o){
        if (this.getStart().getX() > o.getStart().getX()){
            return 1;
        } else if (this.getStart().getX() < o.getStart().getX()){
            return -1;
        } else{
            if (this.getStart().getY() > o.getStart().getY()){
                return 1;
            } else if(this.getStart().getY() < o.getStart().getY()){
                return -1;
            } else{
                return 0;
            }
        }
    }
}
