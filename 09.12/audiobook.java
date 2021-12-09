public class audiobook extends book
{
    private int minutes;
    private int seconds;
    audiobook(String title,String author, publisher publisher, writer writer, int yearOfP ,int minutes, int seconds){
    super(title,author,publisher,yearOfP,writer);
    this.minutes=minutes;
    this.seconds=seconds;
    }
    public int getMinutes(){
    return minutes;
    }
    public void setMinutes(int minutes){
    this.minutes=minutes;
    }
    public int getSeconds(){
    return seconds;
    }
    public void setSeconds(int seconds){
    this.seconds=seconds;
    }
 
    public void display(){
    System.out.println(getTitle() +" by " + getAuthor() + " Duration: " + minutes +":"+ seconds);
    }
 
    public static void main(String[] args) {
    //book bk1 = new book("Jins","John Mormery");
    //audiobook abk1 = new audiobook("Mins","Joe Mooman",51,23);
    //audiobook abk2 = new audiobook("Bins","Jeff Marsky", 12,59);
    //bk1.display();
    //abk1.display();
    //abk2.display();
    }
 
}