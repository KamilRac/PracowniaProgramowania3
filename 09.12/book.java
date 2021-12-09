public class book
{
    private String title;
    private String author;
    private publisher publisher;
    private int yearOfP;
    private writer writer;
    book(String title,String author, publisher pb, int yearOfP, writer writer){
    this.title=title;
    this.author=author;
    this.publisher=pb;
    this.yearOfP=yearOfP;
    this.writer=writer;
    }
    public String getTitle(){
    return title;
    }
    public String getAuthor(){
    return author;
    }
    public void setAuthor(String author){
    this.author=author;
    }
    public void setTitle(String title){
    this.title=title;
    }
    public void setYearOfP(int yearOfP){
    this.yearOfP=yearOfP;
    }
    public int getYearOfP(){
    return yearOfP;
    }
    public void display(){
    System.out.println(title +" by " + author);
    }
    public static void main(String[] args) {
    publisher pb1 = new publisher("Babu","Bibo");
    writer w1 = new writer("Bini","Boni","Bingoni");
    book bk1 = new book("Jins","John Mormery",pb1,1421,w1);
    bk1.display();
    }  
}