public class book
{
    private String title;
    private writer author;
    private int pages;

 
    book(String title, writer author, int numberOfPages){
    this.title=title;
    this.author=author;
    this.pages=pages;
    }
    public String toString(){
    return(title + " by " + author);
    }
    void close(){
    
    }
    void open(){
    
    }
    public void setTitle(String title){
    this.title=title;
    }
    public void setPages(int pages){
    this.pages=pages;
    }
    public String getTitle(){
    return title;
    }
    public int getPages(){
    return pages;
    }
    
    
    
 
 
}