package Lab2;

public class TestVector {
    public static void ma1(String[] args){
        vector empty = new vector();
        vector v1 = new vector(5, 10);
        System.out.println("The value of x of an empty construtor object = " + empty.getX());
        System.out.println("The value of y of an empty construtor object = " + empty.getY());
        System.out.println("The value of x of an non-empty construtor object = " + v1.getX());
        System.out.println("The value of y of an non-empty construtor object = " + v1.getY());
        empty.setX(15);
        System.out.println("Setting the x of the empty vector to 15, x = " + empty.getX());
        empty.setY(20);
        System.out.println("Setting the y of the empty vector to 20, y = " + empty.getY());

        System.out.print("printing the magnitude and angle of v1 = "); v1.print();
        System.out.println("Adding v1 and empty = X:" + v1.add(empty).getX() + " Y:" + v1.add(empty).getY());
        System.out.println("subtracting v1 and empty = X:" + v1.sub(empty).getX() + " Y:" + v1.sub(empty).getY());
    }
}
