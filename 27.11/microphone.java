public class microphone
{
private double price;
private String model;
private boolean isOn;
private String producer;


public microphone(double price,String model,String producer){
this.producer=producer;
this.model=model;
this.price=price;
}
public void setName(String model){
this.model=model;
}
public void setPrice(double price){
this.price=price;
}
public void setProducer(String producer){
this.producer=producer;
}
public String getModel(){
return model;
}
public double getPrice(){
return price;
}
public String getProducer(){
return producer;
}

public void turnOn(){
isOn=true;}
public void turnOff(){
isOn=false;}
public void changeSensetivity(){}
public void mute(){}

public static void main(String[] args){
    microphone mic1 = new microphone(299.99,"VS-23","Samson");
    microphone mic2 = new microphone(25.50,"Blingu 2000","Acer");
    mic1.setName("VH-332");
    mic2.setPrice(19.99);
    mic1.setProducer("YAMAHA");
    mic2.getModel();
    mic1.getPrice();
    mic2.getProducer();
    mic1.turnOn();
    mic2.turnOff();
    mic1.changeSensetivity();
    mic2.mute();
}

}
