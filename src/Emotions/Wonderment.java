package Emotions;

import Creatures.Person;
import Interface.Feelingable;

public class Wonderment implements Feelingable {
    private int LevelofWonderment;
    public int getLevel(){
        return this.LevelofWonderment;
    }

    @Override
    public void showEmotion(Person p) {
        if (this.LevelofWonderment < 5){
            System.out.println(p.getName() + " даже бровью не повёл");
        }
    }
    public void setLevel(int s){
        this.LevelofWonderment = s;
    }
}
