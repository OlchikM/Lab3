package Emotions;
import Creatures.*;
import Interface.Feelingable;

public class Fear implements Feelingable {
    private int LevelOfFear;
    public int getLevel(){
        return this.LevelOfFear;
    }
    public void setLevel(int s){
        this.LevelOfFear = s;
    }

    class Shudder{
        String name;
        Shudder(){
            this.name = "Дрожь";
        }
        void shake(Person p){
            System.out.println(this.name + " сотрясала " + p.getName() +"а, рвала на части. " + p.getName() + " ощущал себя абсолютно беспомощным.");
        }
    }
    public void showEmotion(Person p){
        if (this.LevelOfFear == 10){
            Shudder shudder = new Shudder();
            shudder.shake(p);
        }
    }
    @Override
    public String toString(){
        return "Было страшно.";
    }

}
