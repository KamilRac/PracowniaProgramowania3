public class customer
{
private double availableMoney;
private String name;
private String address;

public customer(double availableMoney,String name,String address){
this.address=address;
this.name=name;
this.availableMoney=availableMoney;
}
public void setName(String name){
this.name=name;
}
public void setAvailableMoney(double availableMoney){
this.availableMoney=availableMoney;
}
public void setAddress(String address){
this.address=address;
}
public String getName(){
return name;
}
public double getAvailableMoney(){
return availableMoney;
}
public String getAddress(){
return address;
}

public void buy(){}
public void refund(){}
public void review(){}

}
