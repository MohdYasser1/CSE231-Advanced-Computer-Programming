package Lab2;

public class ArrayVector {
    public static void main(String[] args){
        vector[] arr = new vector[3];
        arr[0] = new vector(1, 2);
        arr[1] = new vector(5, 10);
        arr[2] = new vector(20, 30);
        System.out.println("The average = " + avg_array(arr));
    }
    static double avg_array(vector[] vect){
        double sum_of_magn = 0;
        for(int i = 0; i < vect.length; i++){
            sum_of_magn += vect[i].magnitude();
        }
        return sum_of_magn / (double)vect.length;
    }
}
