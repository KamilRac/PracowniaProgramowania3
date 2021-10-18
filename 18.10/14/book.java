public class book
{
    int numofPages;
    String title;
    int currentPage;
    int whereIsBookmark;
    
    void pageDown(){
    currentPage--;
    }
    void pageUp(){
    currentPage++;
    }
    void placeBookmark(){
    whereIsBookmark=currentPage;
    }
}
