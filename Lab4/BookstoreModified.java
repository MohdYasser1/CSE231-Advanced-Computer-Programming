package Lab4;

import java.time.LocalDate;
import java.util.Scanner;


class BooksM{
    private static int c = 1;
    private int id;
    private String title;
    private java.time.LocalDate releaseDate;
    private double price;
    
    BooksM(String title, java.time.LocalDate releaseDate, double price){
        id = c;
        c++;
        this.title = title;
        this.releaseDate = releaseDate;
        this.price = price;
    }
    void printBook(){
        System.out.println("ID: "+id+", Title: "+title+", Release Date: "+releaseDate+", Price: $"+price);
    }
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

    void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        return(this.getID()+":  "+this.getTitle()+",  "+this.getReleaseDate()+",  $"+this.getPrice());
    }

    @Override
    public boolean equals(Object book){
        if((this.title.equals(((BooksM)book).title)) && this.releaseDate.equals(((BooksM)book).releaseDate)){
            return true;
        }
        else return false;
    }
}
class TextBooksM extends BooksM{
    private int pages;

    TextBooksM(String title, java.time.LocalDate releaseDate, double price, int pages){
        super(title, releaseDate, price);
        this.pages = pages;
    }
    void printTextBook(){
        System.out.println(this.toString());
    }
    int getPages(){
        return pages;
    }
    @Override
    public String toString(){
        return(super.toString() + ",  " + pages + " Pages");
    }
    @Override
    public boolean equals(Object book){
        if(super.equals(book) && ((TextBooksM)book).pages == this.pages){
            return true;
        }
        else return false;
    }
}
class AudioBooksM extends BooksM{
    private int lenmin;

    AudioBooksM(String title, java.time.LocalDate releaseDate, double price, int lenmin){
        super(title, releaseDate, price);
        this.lenmin = lenmin;
    }
    void printAudioBook(){
        System.out.println(this.toString());
    }
    int getLenMin(){
        return lenmin;
    }
    @Override
    public String toString(){
        return(super.toString() + ",  " + lenmin + " minutes");
    }
    @Override
    public boolean equals(Object book){
        if(super.equals(book) && ((AudioBooksM)book).lenmin == this.lenmin){
            return true;
        }
        else return false;
    }

}
public class BookstoreModified{
    

    public static BooksM readBook(int type){
        Scanner bookInfo = new Scanner(System.in);
        System.out.println("What is the title of the book?");
        String title = bookInfo.nextLine();
        System.out.println("Enter the release data as yyyy m d");
        int y = bookInfo.nextInt();
        int m = bookInfo.nextInt();
        int d = bookInfo.nextInt();
        System.out.println("Enter the price of the book: ");
        double price = bookInfo.nextDouble();
        if(type == 1){
            System.out.println("Enter the number of pages: ");
            int pages = bookInfo.nextInt();
            TextBooksM book = new TextBooksM(title,  LocalDate.of(y, m, d), price, pages);
            return book;
        }
        else {
            System.out.println("Enter the length of the AudioBook in minutes ");
            int lenmin = bookInfo.nextInt();
            AudioBooksM book = new AudioBooksM(title, LocalDate.of(y, m, d), price, lenmin);
            return book;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Books: ");
        int numOfBooks = input.nextInt();
        BooksM[] library = new BooksM[numOfBooks];
        for(int i = 0; i < numOfBooks; i++){
            System.out.println("What is the type of the book, TextBook --> 1, AudioBook --> 2");
            
            library[i] = readBook(input.nextInt());
            
        }
        System.out.println();
        System.out.println("Books: ");
        System.out.println("ID: Title:  Realese Date:  Price:  Pages/Length in Minutes: ");
        for (int i = 0; i < numOfBooks; i++) {
            System.out.println(library[i]);   
        }
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