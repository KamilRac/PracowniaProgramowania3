public class Counter
{
    int initialValue=0;
    void incByOne(){
        initialValue++;
    }
    void decByOne(){
        initialValue--;
    }
    void incByTen(){
        initialValue = initialValue+10;
    }
    void decByTen(){
        initialValue = initialValue-10;
    }
    void reset(){
        initialValue=0;
    }
    void showStatus(){
        System.out.print(initialValue);
    }
}
