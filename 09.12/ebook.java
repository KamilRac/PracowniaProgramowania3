public class ebook extends book
{
    private String fileName;
 
    ebook(String title,String author, publisher publisher, int yearOfP, String fileName, writer writer){
    super(title,author,publisher,yearOfP, writer);
    this.fileName=fileName;
    }
    public String getFileName(){
    return fileName;
    }
    public void setFileName(String fileName){
    this.fileName=fileName;
    }
    public void display(){
    System.out.println(getTitle() +" by " + getAuthor() + " Filename: " + fileName);
    }
    public static void main(String[] args) {
    //book bk1 = new book("Jins","John Mormery");
    //ebook ebk1 = new ebook("Mins","Joe Mooman", "mins.mp3");
    //ebook ebk2 = new ebook("Bins","Jeff Marsky", "bins.wmv");
    //bk1.display();
    //ebk1.display();
    //ebk2.display();
    }
 
}