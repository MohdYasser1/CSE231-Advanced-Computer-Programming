package Lab3;

public class MyString {
    public static void main(String[] args){
        MyString mystr = new MyString("Computer");
        mystr.print();
        mystr.indexOf('p');
        System.out.println(mystr.length());
        mystr.erase(4, 3).print(); //Should return "Compr"
        mystr.print();// Should return "Computer" because the class is immutable
        mystr.insert(4, "utelol").print(); //Should return "Computelolr"
        mystr.print();//Should return "Computer" because the class is immutable
    }
    private char[] s;

    MyString(String string){
        this.s = new char[string.length()];
        for(int i = 0; i < string.length(); i++){
            this.s[i] = string.charAt(i);  
        }
    }
    void print(){
        for(int i = 0; i < this.s.length; i++){
            System.out.print(s[i]);
        }
        System.out.println();
    }
    int indexOf(char c){
        for(int i = 0; i < this.s.length; i++){
            if(s[i] == c){
                return i;
            }
        }
        return -1;
    }
    int length(){
        return this.s.length;
    }
    MyString erase(int index, int length){
        MyString result = new MyString("");
        char[] sera = new char[this.s.length - length];
        //A counter for the new array "sera"
        int k = 0;
        for(int i = 0; i < this.s.length; i++){
            if(i == index){
                i += length;
            }
            sera[k] = s[i];
            k++;
        }
        result.s = sera;
        return result;
    }
    MyString insert(int index, String str){
        MyString result = new MyString("");
        char[] snew = new char[this.s.length + str.length()];
        //A counter for the original array to continue
        int k = 0;
        //A counter to store the last index after insertion
        int x = 0;
        for(int i = 0; i < snew.length; i++){
            if(i == index){
                for(int j = 0; j < str.length(); j++){
                    x = i+j;
                    snew[x] = str.charAt(j);
                }
                i = x+1;  
            }

            snew[i] = s[k];
            k++;
        }
        result.s = snew;
        return result;
    }
}
