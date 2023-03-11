//Create a class called HalfPyramid
public class HalfPyramid{
    //main class
    public static void main(String[] args){
            //outer loop which switches to the next line when finishing printing stars
            for (int i = 0; i < 5; i++){
                //inner loop which prints multiple of stars accourding to the line it is in
                for (int j= 0; j<= i; j++){
                    //print star
                    System.out.print("*");
                }
                //go to the next line
                System.out.println();
            }
    }
}