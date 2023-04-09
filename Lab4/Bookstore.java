package Lab4;

import java.time.LocalDate;
import java.util.Scanner;

//Create a super class called books
class Books{
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
    Books(String title, java.time.LocalDate releaseDate, double price){
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
}
//A subclass called TextBooks that inheirts from the super class Books
class TextBooks extends Books{
    //TextBooks adds a data memeber called pages
    private int pages;

    //A construtor to initialize the object based on the information given
    TextBooks(String title, java.time.LocalDate releaseDate, double price, int pages){
        //Calls the super constructor to intialize the super data types
        super(title, releaseDate, price);
        //Initilize the number of pages
        this.pages = pages;
    }
    //A method to print the TextBook's information
    void printTextBook(){
        //Calls the super method printBook to print the super data members
        printBook();
        //Print the number of Pages
        System.out.print(", Pages: "+ pages);
    }
    //Getters
    int getPages(){
        return pages;
    }
    ////
}

//A subclass called AudioBooks that inheirts from the super class Books
class AudioBooks extends Books{
    //TextBooks adds a data memeber called "lenmin" which is Length in Minutes
    private int lenmin;

    //A construtor to initialize the object based on the information given
    AudioBooks(String title, java.time.LocalDate releaseDate, double price, int lenmin){
        //Calls the super method printBook to print the super data members
        super(title, releaseDate, price);
        //Print the length in minutes
        this.lenmin = lenmin;
    }
    //A method to print the AudioBook's information
    void printAudioBook(){
        //Calls the super method printBook to print the super data members
        printBook();
        //Print the length in minutes
        System.out.print(", Length in Minutes: "+ lenmin);
    }
    //Getters    
    int getLenMin(){
        return lenmin;
    }
/////////////    
}
//A pubic class to test the classes
public class Bookstore {
    

    //A method to read the books from the user and takes in an int-type parameter to select the type of the book
    public static Books readBook(int type){
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
            //Create the object
            TextBooks book = new TextBooks(title,  LocalDate.of(y, m, d), price, pages);
            return book;
        }
        else {
            //Input: Length in minutes
            System.out.println("Enter the length of the AudioBook in minutes ");
            int lenmin = bookInfo.nextInt();
            //Create the object
            AudioBooks book = new AudioBooks(title, LocalDate.of(y, m, d), price, lenmin);
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
        //Create an Array of Books to store the Books in
        Books[] library = new Books[numOfBooks];
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
            System.out.print(library[i].getID()+":  "+library[i].getTitle()+",  "+library[i].getReleaseDate()+",  $"+library[i].getPrice());
            if(library[i] instanceof TextBooks){
                System.out.print(",  "+((TextBooks)library[i]).getPages()+" Pages");
                System.out.println();
            }
            else{
                System.out.print(",  "+((AudioBooks)library[i]).getLenMin()+ " min");
                System.out.println();
            }     
        }
        System.out.println();
    }
}