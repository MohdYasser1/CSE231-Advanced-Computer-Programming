package Lab3;

//Create a class called MyString
public class MyString {
    //A main method to test the class
    public static void main(String[] args){
        MyString mystr = new MyString("Computer");
        mystr.print();//Should print "Computer"
        mystr.indexOf('p');
        System.out.println(mystr.length());//Should print "8"
        mystr.erase(4, 3).print(); //Should return "Compr"
        mystr.print();// Should return "Computer" because the class is immutable
        mystr.insert(4, "utelol").print(); //Should return "Computelolr"
        mystr.print();//Should return "Computer" because the class is immutable
    }
    //An array of characters
    private char[] s;

    //A Constructor which takes in a string and puts its characters in the array of characters (s)
    MyString(String string){
        this.s = new char[string.length()];
        for(int i = 0; i < string.length(); i++){
            this.s[i] = string.charAt(i);  
        }
    }
    //Prints the array of characters one by one
    void print(){
        for(int i = 0; i < this.s.length; i++){
            System.out.print(s[i]);
        }
        System.out.println();
    }

    //Looks for the character and returns the index of the first instance of it
    //If the character is not found it should return -1
    int indexOf(char c){
        for(int i = 0; i < this.s.length; i++){
            if(s[i] == c){
                return i;
            }
        }
        return -1;
    }

    //Returns the length of the array
    int length(){
        return this.s.length;
    }

    //A method that erases some characters from the array and returns a new object
    MyString erase(int index, int length){
        //Create a new empty object to return the result in
        MyString result = new MyString("");
        //A new array of characters with the new size of the string
        char[] sera = new char[this.s.length - length];
        //A counter for the new array "sera"
        int k = 0;
        //A loop that goes through the entire original string
        for(int i = 0; i < this.s.length; i++){
            //if the index of the string we want to erase is found we enter
            if(i == index){
                //Skip over the characters we want to erase
                i += length;
            }
            //Cointinue the rest of the string
            sera[k] = s[i];
            k++;
        }
        //point the array s to point towards sera
        result.s = sera;
        //return the object
        return result;
    }
    //A method the inserts charcters to the string and returns a new object
    MyString insert(int index, String str){
        //Create a new empty object to return the result in
        MyString result = new MyString("");
        //A new array of characters with the new size of the string
        char[] snew = new char[this.s.length + str.length()];
        //A counter for the original array to continue
        int k = 0;
        //A counter to store the last index after insertion
        int x = 0;
        //A loop that goes through all the size of the new array
        for(int i = 0; i < snew.length; i++){
            //If the index of the character we want to modify is found, enter
            if(i == index){
                //add these characters one by one
                for(int j = 0; j < str.length(); j++){
                    x = i+j;
                    snew[x] = str.charAt(j);
                }
                //update counter
                i = x+1;  
            }
            //Cointinue the rest of the string
            snew[i] = s[k];
            k++;
        }
        //point the array s to point towards sera
        result.s = snew;
        //return the object
        return result;
    }
}
