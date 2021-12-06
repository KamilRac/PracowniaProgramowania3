public class ComputerFile
{
private int size;
private String name;
private String extension;

public ComputerFile(int size,String name,String extension){
this.size=size;
this.name=name;
this.extension=extension;
}
public void setName(String name){
this.name=name;
}
public void setExtension(String extension){
this.extension=extension;
}
public String getName(){
return name;
}
public String getExtension(){
return extension;
}
public void archive(){
extension="Zip";
if(size>0){
size=size-100;
}

}


}
