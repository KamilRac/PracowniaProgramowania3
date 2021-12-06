public class seller
{
private double price;
private String name;
private String sellingItem;

public seller(double price,String name,String sellingItem){
this.sellingItem=sellingItem;
this.name=name;
this.price=price;
}
public void setName(String name){
this.name=name;
}
public void setPrice(double price){
this.price=price;
}
public void setSellingItem(String sellingItem){
this.sellingItem=sellingItem;
}
public String getName(){
return name;
}
public double getPrice(){
return price;
}
public String getSellingItem(){
return sellingItem;
}

public void setItForSale(){}
public void share(){}
public void promote(){}

}
