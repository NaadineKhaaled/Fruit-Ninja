package Logic;


import GUI.LevelScene;
import GUI.Observer;

public class Score {



Observer observer;




    int score=0;
    public int addScore(GameObject fruit)
    {
        if(fruit instanceof SpecialFruit){
        score+=fruit.getPoints();
        }
        else if(fruit instanceof OrdinaryFruit)
        {
         score+=fruit.getPoints();
        }

        return score;

    }


    public  int reset(){
        score=0;
        return score;
    }
}

