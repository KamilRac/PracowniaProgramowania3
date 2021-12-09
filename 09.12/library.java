import java.util.ArrayList;
public class library
{
    private ArrayList<book> books;
library(){}
   public void addBook(book newBook){
    books.add(newBook);
    }
   public void removeBook(book bookToRemove){
    books.remove(bookToRemove);
    }
    public ArrayList<book> display(){
    return books;
    }
}