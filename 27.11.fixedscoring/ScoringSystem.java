import java.util.ArrayList;
import java.util.*;
public class ScoringSystem
{
   String nameOfTheCompetitor;
   ArrayList<Integer> points = new ArrayList<Integer>();
   public ScoringSystem(String nameOfTheCompetitor, ArrayList<Integer> pointsX ){
    this.nameOfTheCompetitor=nameOfTheCompetitor;
    for(int i=0;i<pointsX.size();i++){
    if(pointsX.get(i)<2 || pointsX.get(i)>4){
    pointsX.remove(i);
    }
    }
    this.points=pointsX;
    }
    
    public double calculateScore(){
    double sum=0;
    double win=0;
    double lp=points.size();
    for(int i=0;i<points.size();i++){
    sum=sum+points.get(i);
    }
    System.out.print(sum/lp);
    return sum/lp;
    }
    
    
    public static void main(String[] args) {
        ArrayList<Integer> pointsX = new ArrayList<Integer>();
        pointsX.add(3);
        pointsX.add(1);
        pointsX.add(2);
        ScoringSystem ssy1 = new ScoringSystem("Ka",pointsX);
        ssy1.calculateScore();
    }
}
