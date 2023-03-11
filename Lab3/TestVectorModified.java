package Lab3;

public class TestVectorModified{
    public static void main(String[] args){
        VectorModified empty = new VectorModified();
        VectorModified v1 = new VectorModified(5, 10);
        System.out.println("The value of x of an empty construtor object = " + empty.getX());
        System.out.println("The value of y of an empty construtor object = " + empty.getY());
        System.out.println("The value of x of an non-empty construtor object = " + v1.getX());
        System.out.println("The value of y of an non-empty construtor object = " + v1.getY());
        empty.setX(15);
        System.out.println("Setting the x of the empty vector to 15, x = " + empty.getX());
        empty.setY(20);
        System.out.println("Setting the y of the empty vector to 20, y = " + empty.getY());

        System.out.print("printing the magnitude and angle of v1 = "); v1.print();
        System.out.println("Static add v1 and empty = X:" + VectorModified.add(v1, empty).getX() + " Y:" + VectorModified.add(v1, empty).getY());
        System.out.println("Static subtract v1 and empty = X:" + VectorModified.sub(v1, empty).getX() + " Y:" + VectorModified.sub(v1, empty).getY());
        System.out.println("Using the read method on v1");
        v1.read();
        System.out.println("New x: " + v1.getX() + ", New y: " + v1.getY());
    }
}
