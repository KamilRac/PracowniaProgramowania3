public class writer 
{
    private String name;
    private String surname;
    private String preferedGenre;

 
    writer(String name, String surname, String preferedGenre){
    this.name=name;
    this.surname=surname;
    this.preferedGenre=preferedGenre;
    }
    public String toString(){
    return(name + " by " + surname);
    }
    public void setName(String name){
    this.name=name;
    }
    public void setSurname(String surname){
    this.surname=surname;
    }
    public void setPreferedGenre(String preferedGenre){
    this.preferedGenre=preferedGenre;
    }
    
    public String getName(){
    return name;
    }
    public String getPreferedGenre(){
    return preferedGenre;
    }
    public String getSurname(){
    return surname;
    }
}