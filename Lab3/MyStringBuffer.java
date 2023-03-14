package Lab3;

public class MyStringBuffer {

    public static void main(String[] args){
        MyStringBuffer mystr = new MyStringBuffer("Computer");
        mystr.print();
        mystr.indexOf('p');
        System.out.println(mystr.length());
        mystr.erase(4, 3); //Should return "Compr"
        mystr.print();
        mystr.insert(4, "ute"); //Should return "Computer"
        mystr.print();
    }

    private char[] s;

    MyStringBuffer(String string){
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
    void erase(int index, int length){
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
        this.s = sera;
    }
    void insert(int index, String str){
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
        this.s = snew;
    }
}
