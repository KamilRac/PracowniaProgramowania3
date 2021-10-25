public class InternetDevice{
    String name;
    boolean isConnected;
    static int connectedDevices;
    static String[] connectedDevicesArr;
    static int flag=0;
    void displayConnections(){
    System.out.println("Status:");
    }
    void displayStatus(){
        System.out.println("Status:");
        System.out.println("Name of the Device: " + name);
        System.out.println("Is it connected? " + isConnected);
    };
    
    void isConnectedStatus(){
        System.out.println("Status:");
        System.out.println("Is it connected? " + isConnected);
    };
    
    public static void main(String[] args) {
        InternetDevice device1=new InternetDevice("Phone");
        device1.connect();
        device1.displayStatus();
        InternetDevice device2=new InternetDevice("Washing Machine");
        device2.connect();
        device2.displayStatus();
        InternetDevice device3=new InternetDevice("Computer");
        device3.connect();
        device3.displayStatus();
        InternetDevice device4=new InternetDevice("Laptop");
        device4.displayStatus();
        InternetDevice device5=new InternetDevice("TV");
        device5.displayStatus();
    }
    
    void connect(){
    isConnected=true;
    connectedDevices++;
    }
    
    
    void disconnect(){
    isConnected=false;
    connectedDevices--;
    }
    
    static void howManyConnected(){
        if(connectedDevices !=1){
            System.out.println("There are " + connectedDevices + " devices connected to the internet." );
    }
    else{
        System.out.println("There is 1 device connected to the internet." );
    }
}
    
    InternetDevice(String name){
        this.name = name;
    }
}