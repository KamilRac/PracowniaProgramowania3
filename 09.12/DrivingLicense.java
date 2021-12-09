public class DrivingLicense
{
    
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String licenseNr;
    private int yearOfIssue;
    private String category;
   
   /*
    public String name;
    public String surname;
    public String address;
    public String postalCode;
    public String city;
    public String licenseNr;
    public int yearOfIssue;
    public String category;
*/
    DrivingLicense(String name, String surname, String address, String postalCode, String city, String licenseNr, int yearOfIssue, String category){
    this.name=name;
    this.surname=surname;
    this.address=address;
    this.postalCode=postalCode;
    this.city=city;
    this.licenseNr=licenseNr;
    this.yearOfIssue=yearOfIssue;
    this.category=category;
    }
    
    public String toString(){
    return(getName()+ " " +getSurname() + "\n" + getAddress() + getPostalCode() + getCity() +"\n"+getLicenseNr() + getYearOfIssue() + getCategory());
    
    }
    
    void showStatus(){
    System.out.println("~~Prawo Jazdy~~");
    System.out.println("Imię: " + name);
    System.out.println("Nazwisko: " + surname);
    System.out.println("Address: " + address);
    System.out.println("Kod Pocztowy: " + postalCode);
    System.out.println("Miasto: " + city);
    System.out.println("Numer Prawa Jazdy: " + licenseNr);
    System.out.println("Rok wydania Prawa Jazdy: " + yearOfIssue);
    System.out.println("Kategoria Prawa Jazdy: " + category);
    }
    
    public String getName(){
    return name;
    };
    
    public void setName(String newName){
    this.name=newName;
    };
    
    public String getSurname(){
    return surname;
    };
    
    public void setSurname(String newSurname){
    this.surname=newSurname;
    };
    
    public String getAddress(){
    return address;
    };
    
    public void setAddress(String newAddress){
    this.address=newAddress;
    };
    
    public String getPostalCode(){
    return postalCode;
    };
    
    public void setPostalCode(String newPostalCode){
    this.postalCode=newPostalCode;
    };
    
    public String getCity(){
    return city;
    };
    
    public void setCity(String newCity){
    this.city=newCity;
    };
    
    public String getLicenseNr(){
    return licenseNr;
    };
    
    public void setLicenseNr(String newLicenseNr){
    this.licenseNr=newLicenseNr;
    };
    
    public int getYearOfIssue(){
    return yearOfIssue;
    };
    
    public void setYearOfIssue(int newYearOfIssue){
        if(newYearOfIssue>1980 && newYearOfIssue<2021){
        this.yearOfIssue=newYearOfIssue;
    }
    };
    
    public String getCategory(){
    return category;
    };
    
    public void seCategory(String newCategory){
    this.category=newCategory;
    };
    
}
