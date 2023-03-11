public class Arrays{
    public static void main(String[] args){
    }
    public static int add(int[] num){
        int len = num.length;
        int sum = 0;
        for(int i = 0; i < len; i++){
            sum = sum + num[i];
        }
        return (sum);
    }
}