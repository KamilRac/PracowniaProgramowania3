import java.util.ArrayList;
import java.util.Scanner;
public class bookshelf
{
    private String model;
    private ArrayList<book> books = new ArrayList<book>();
    bookshelf(String model){
    this.model=model;
    }
    public void setModel(String model){
    this.model=model;
    }
    public String getModel(){
    return model;
    }
    public ArrayList<book> showcase(){
    System.out.println(books);
    return books;
    }
    public void showcaseX(){
    books.forEach(System.out::println);
    } 
    public int howManyBooks(){
    return books.size();
    }
    
    public void addBooks(book bookNew){
    books.add(bookNew);
    
    }
    
    public static void main(String[] args){
    writer wr1 = new writer("Casy","Johnson","Fantasy");
    book bk1 = new book("Signat",wr1,312);
    book bk2 = new book("SFSFSF",wr1,312);
    bookshelf bs1 = new bookshelf("BKDM");
    bs1.addBooks(bk1);
    bs1.addBooks(bk2);
    bs1.showcaseX();
  }
    
}