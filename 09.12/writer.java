public class writer
{
    private String name;
    private String surname;
    private String genre;
    
    writer(String name, String surname, String genre){
    this.name=name;
    this.surname=surname;
    this.genre=genre;
    }
    
    public String getName(){
    return name;
    }
    public String getSurname(){
    return surname;
    }
    public void setSurname(String surname){
    this.surname=surname;
    }
    public String getGenre(){
    return genre;
    }
    
    public void setName(String name){
    this.name=name;
    }
    public void setGenre(String genre){
    this.genre=genre;
    }
}
