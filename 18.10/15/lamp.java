public class lamp
{
    boolean status;
    
    void turnOn(){
    status=true;
    }
    void turnOff(){
    status=false;
    }
    void showStatus(){
    System.out.println(status);
    }
}
