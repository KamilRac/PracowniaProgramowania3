public class product
{
private double value;
private String name;
private String producer;

public product(double value,String name,String producer){
this.producer=producer;
this.name=name;
this.value=value;
}
public void setName(String name){
this.name=name;
}
public void setAvailableMoney(double availableMoney){
this.value=value;
}
public void setProducer(String producer){
this.producer=producer;
}
public String getName(){
return name;
}
public double getValue(){
return value;
}
public String getProducer(){
return producer;
}

public void pack(){}
public void unpack(){}

}
