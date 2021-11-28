
public class ScoringSystem
{
   String nameOfTheCompetitor;
   int[] points={};
   int lp=points.length;
   public ScoringSystem(String nameOfTheCompetitor, int[] points){
    this.nameOfTheCompetitor=nameOfTheCompetitor;
    this.points=points;
    int[] newpoints={};
    int flag=0;
    for(int i=0;i<lp;i++){
    if(points[i]==2 || points[i]==3 | points[i]==4){
    newpoints[flag]=points[i];
    flag++;
    }
    }
    this.points=newpoints;
    }
    public int b(){
    return lp;
    }
    public int[] xb(){
    return points;
    }
    public double calculateScore(){
    int sum=0;
    int lp=this.points.length;
    for(int i=0;i<lp;i++){
    sum=sum+points[i];
    }
    return sum/lp;
    }
    
    
}

