package Lab5;

import java.util.Arrays;

public class MoveableArray {
    public static void main(String[] args){
        //A Array of Moveables
        Moveable[] arr = new Moveable[4];
        arr[0] = new Diamond(new javafx.geometry.Point2D(4, 5), 5, 5);
        arr[1] = new Diamond(new javafx.geometry.Point2D(2, 2), 5, 5);
        arr[2] = new Diamond(new javafx.geometry.Point2D(3, 3), 5, 5);
        arr[3] = new Diamond(new javafx.geometry.Point2D(1, 1), 5, 5);
        //Moving each x and y of the diamonds by 2
        for (Moveable i : arr) {
            i.move(2,2);
        }
        //Sorting the array of Diamonds
        Arrays.sort(arr);
        //Drawing the Diamonds
        for (Moveable i : arr) {
            ((GeometricShapes)i).draw();
        }        
    }
}
