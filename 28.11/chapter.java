public class chapter
{
    private String title;
    private int startingPage;
    private int pages;

 
    chapter(String title, int startingPage, int pages){
    this.title=title;
    this.startingPage=startingPage;
    this.pages=pages;
    }
    public String toString(){
    return(title + " starting at " + startingPage);
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
    public void setStartingPage(int startingPage){
    this.startingPage=startingPage;
    }
    public int getStartingPage(){
    return startingPage;
    }
    
 
 
}