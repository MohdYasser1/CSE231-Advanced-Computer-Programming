package Lab4;

import java.time.LocalDate;
import java.util.Scanner;

//Create a super class called BooksM
class BooksM{
    //This super class has a counter to store the id
    private static int c = 1;
    private int id;
    //The title of the book
    private String title;
    //The relase date of the book
    private java.time.LocalDate releaseDate;
    //The price of the book
    private double price;
    
    //A constructor to initialize the data members of the class by the
    //given information
    BooksM(String title, java.time.LocalDate releaseDate, double price){
        id = c;
        c++;
        this.title = title;
        this.releaseDate = releaseDate;
        this.price = price;
    }
    //A method that prints the information of the book
    void printBook(){
        System.out.println("ID: "+id+", Title: "+title+", Release Date: "+releaseDate+", Price: $"+price);
    }
    //Getters    
    int getID(){
        return id;
    }
    String getTitle(){
        return title;
    }
    java.time.LocalDate getReleaseDate(){
        return releaseDate;
    }
    double getPrice(){
        return price;
    }
    ////

    //A method to print the Book's information
    void print(){
        System.out.println(this.toString());
    }

    //A method that overrides the toString method to make it return the book's information
    @Override
    public String toString(){
        return(this.getID()+":  "+this.getTitle()+",  "+this.getReleaseDate()+",  $"+this.getPrice());
    }
    //A method that overrides the equals method to make it return true if the book has same information
    @Override
    public boolean equals(Object book){
        if((this.title.equals(((BooksM)book).title)) && this.releaseDate.equals(((BooksM)book).releaseDate)){
            return true;
        }
        else return false;
    }
}
//A subclass called TextBooksM that inheirts from the super class BooksM
class TextBooksM extends BooksM{
    //TextBooksM adds a data memeber called pages
    private int pages;

    //A construtor to initialize the object based on the information given
    TextBooksM(String title, java.time.LocalDate releaseDate, double price, int pages){
        //Calls the super constructor to intialize the super data types
        super(title, releaseDate, price);
        //Initilize the number of pages
        this.pages = pages;
    }
    //A method to print the TextBook's information
    void printTextBook(){
        System.out.println(this.toString());
    }
    
    //Getters
    int getPages(){
        return pages;
    }
    ////

    //A method that overrides the toString method to make it return the book's information
    @Override
    public String toString(){
        //This method calls the toString method of the super class and adds to it the number of pages
        return(super.toString() + ",  " + pages + " Pages");
    }
    //A method that overrides the equals method to make it return true if the book has same information
    @Override
    public boolean equals(Object book){
        //This method calls the equals method of the super class and checks if the number of pages are the same
        if(super.equals(book) && ((TextBooksM)book).pages == this.pages){
            return true;
        }
        else return false;
    }
}
//A subclass called AudioBooksM that inheirts from the super class BooksM
class AudioBooksM extends BooksM{
    //TextBooksM adds a data memeber called "lenmin" which is Length in Minutes
    private int lenmin;

    //A construtor to initialize the object based on the information given
    AudioBooksM(String title, java.time.LocalDate releaseDate, double price, int lenmin){
        //Calls the super method printBook to print the super data members
        super(title, releaseDate, price);
        //Print the length in minutes
        this.lenmin = lenmin;
    }
    
    //A method to print the AudioBook's information
    void printAudioBook(){
        System.out.println(this.toString());
    }
    //Getters    
    int getLenMin(){
        return lenmin;
    }
    ///////

    //
    //A method that overrides the toString method to make it return the book's information
    @Override
    public String toString(){
        //This method calls the toString method of the super class and adds to it the length in minutes
        return(super.toString() + ",  " + lenmin + " minutes");
    }
    //A method that overrides the equals method to make it return true if the book has same information
    @Override
    public boolean equals(Object book){
        //This method calls the equals method of the super class and checks if the lengths are the same
        if(super.equals(book) && ((AudioBooksM)book).lenmin == this.lenmin){
            return true;
        }
        else return false;
    }

}
//A pubic class to test the classes
public class BookstoreModified{
    

    //A method to read the books from the user and takes in an int-type parameter to select the type of the book
    public static BooksM readBook(int type){
        //Scanner Object to read data from the user
        Scanner bookInfo = new Scanner(System.in);
        //Input: Title
        System.out.println("What is the title of the book?");
        String title = bookInfo.nextLine();
        //Input: Release Date
        System.out.println("Enter the release data as yyyy m d");
        int y = bookInfo.nextInt();
        int m = bookInfo.nextInt();
        int d = bookInfo.nextInt();
        //Input: Price
        System.out.println("Enter the price of the book: ");
        double price = bookInfo.nextDouble();
        //If user inputed type -> 1 then the book is a TextBook
        //If user inputed type -> 2 then the book is an AudioBook
        if(type == 1){
            //Input: Number of pages
            System.out.println("Enter the number of pages: ");
            int pages = bookInfo.nextInt();
            //Input: Number of pages
            TextBooksM book = new TextBooksM(title,  LocalDate.of(y, m, d), price, pages);
            return book;
        }
        else {
            //Input: Length in minutes
            System.out.println("Enter the length of the AudioBook in minutes ");
            int lenmin = bookInfo.nextInt();
            //Create the object
            AudioBooksM book = new AudioBooksM(title, LocalDate.of(y, m, d), price, lenmin);
            return book;
        }

    }

    //main method to test the classes
    public static void main(String[] args) {
        //Input object to take in data from the user
        Scanner input = new Scanner(System.in);
        //Input: Number of Books
        System.out.println("Enter the number of Books: ");
        int numOfBooks = input.nextInt();
        //Create an Array of BooksM to store the books in
        BooksM[] library = new BooksM[numOfBooks];
        for(int i = 0; i < numOfBooks; i++){
            //Input: Type of Book (1,2)
            System.out.println("What is the type of the book, TextBook --> 1, AudioBook --> 2");
            
            library[i] = readBook(input.nextInt());
            
        }
        System.out.println();
        //Printing the information of the books
        System.out.println("Books: ");
        System.out.println("ID: Title:  Realese Date:  Price:  Pages/Length in Minutes: ");
        for (int i = 0; i < numOfBooks; i++) {
            System.out.println(library[i]);   
        }
        //Check if there are dublicate books by using the equals method
        for (int i = 0; i < numOfBooks; i++) {
            for (int j = i+1; j < numOfBooks; j++) {
                if(library[i].equals(library[j])){
                    System.out.println();
                    System.out.println("There is a dublicate: Duplicates -> ID:" + library[i].getID() + " ID:" + library[j].getID());
                }
            }
        }
            
        System.out.println();
    }
}