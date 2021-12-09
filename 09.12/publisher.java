public class publisher
{
    private String name;
    private String city;
    
    publisher(String name, String city){
    this.name=name;
    this.city=city;
    }
    
    public String getName(){
    return name;
    }
    public String getCity(){
    return city;
    }
    
    public void setName(String name){
    this.name=name;
    }
    public void setCity(String city){
    this.city=city;
    }
    
    
}
