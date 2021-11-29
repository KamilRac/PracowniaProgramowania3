import java.util.ArrayList;
import java.util.Scanner;
public class folder
{
    private String name;
    private String location;
    private ArrayList<ComputerFile> files = new ArrayList<ComputerFile>();
    folder(String name, String location){
    this.name=name;
    this.location=location;
    }
    public void setName(String name){
    this.name=name;
    }
    public void setLocation(String location){
    this.location=location;
    }
    public String getName(){
    return name;
    }
    public String getLocation(){
    return location;
    }
    public ArrayList<ComputerFile> showcase(){
    System.out.println(files);
    return files;
    }
    public void showcaseX(){
    files.forEach(System.out::println);
    } 
    public int howManyFiles(){
    return files.size();
    }
    
    public void displayDS(){
        System.out.println("Folder name: " + this.name);
        for (ComputerFile file : this.files) {
        System.out.println("File: " + file.toString());
        }
    };
    
    public void addFiles(ComputerFile file){
    files.add(file);
    
    }
    public void removeFiles(ComputerFile file){
    files.remove(file);
    }
    
    public static void main(String[] args){
    folder sl1 = new folder("gry","Dysk C");
    ComputerFile f1 = new ComputerFile(132,"Bob","png");
    ComputerFile f2 = new ComputerFile(982,"Tygrysek","exe");
    sl1.addFiles(f1);
    sl1.addFiles(f2);
    sl1.displayDS();
    ComputerFile f3 = new ComputerFile(12,"Frogger","exe");
    sl1.addFiles(f3);
    sl1.displayDS();
    sl1.removeFiles(f3);
    sl1.displayDS();
  }
    
}