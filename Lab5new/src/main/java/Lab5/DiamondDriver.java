package Lab5;

//A class to test Diamond class' functionalities
public class DiamondDriver {
    public static void main(String[] args){
        //Create a diamond object
        Diamond d1 = new Diamond(new javafx.geometry.Point2D(5, 5), 15, 15);
        //Drawing the diamond
        System.out.println("First Diamond");
        d1.draw();
        //Moving the Diamond
        d1.move(2, 2);
        //Drawing after movement
        System.out.println("First Diamond after movement:");
        d1.draw();
        //Creating a new Diamond Object to compare
        Diamond d2 = new Diamond(new javafx.geometry.Point2D(1, 1), 15, 15);
        //Drawing the second diamond
        System.out.println("Second Diamond");
        d2.draw();
        //Comapring the first Diamond to the Second Diamond
        System.out.println("Comparing the first Diamond to the Second:"); 
        System.out.println("d1 > d2 --> 1, d1 < d2 --> -1, d1 = d2 --> 0");        
        System.out.println(d1.compareTo(d2));

    }
}
