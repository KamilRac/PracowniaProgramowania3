public class Books
{
private String name;
private String genre;
private String writer;
private Books(String name,String genre, String writer){
this.name=name;
this.genre=genre;
this.writer=writer;
}
public void setName(String name){
this.name=name;
}
public void setGenre(String genre){
this.genre=genre;
}
public void setWriter(String writer){
this.writer=writer;
}

public String getName(){
return name;
}
public String getGenre(){
return genre;
}

public String getWriter(){
return writer;
}
public void open(){}
public void close(){}
public void setBookmark(){}
}
