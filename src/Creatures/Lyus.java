package Creatures;
import Emotions.*;
import Enums.*;
import SurroundingWorld.*;
import Things.*;
import Interface.*;

import java.nio.file.WatchService;

public class Lyus extends Person implements PhysicalMove{
    private Feelingable emotion1;
    private Feelingable emotion2;


    public Lyus(){
        super("Льюис");
        Wonderment wonderment  = new Wonderment();
        this.emotion1 = wonderment;
        Fear fear = new Fear();
        this.emotion2 = fear;
        this.existence = Survivability.ALIVE;
    }
    public void eat(Meal meal){
        String a = meal.getName();
        System.out.println(this.name +" съел "+a);
    }
    public void kiss(Person p1, Person p2){
        String a1 = p1.name;
        String a2 = p2.name;
        System.out.println(this.name + " поцеловал " + a1 + " и " + a2);
    }
    public void watch(int level, Thing thing){
        if (thing.getClass() == LaundryTank.class) {
            String namet = thing.getName();
            String colourt = ((LaundryTank) thing).getColour();
            String shapet = ((LaundryTank) thing).getShape();
            if ((level < 5) && (level > 0)) {
                System.out.println(this.name + " мельком взглянул на " + colourt + " " + shapet + " " + namet);
            } else if ((level >= 5) && (level <= 10)){
                System.out.println(this.name + " посмотрел на " + colourt + " " + shapet + " " + namet);
            }
        }
        else {
            System.out.println(this.name + " посмотрел на " + thing.getName() );
            }

    }
    public void watch(int level, EnvironmentObject environmentObject){
        if (level == 5) {
            System.out.println(this.name + " посмотрел" + " " + "на"  + " " + environmentObject.getName());
        }
        if ((level > 5) && (level <= 10)){
            System.out.println(this.name + " уставился на " + environmentObject.getName());
        }
    }
    public void driveaCar(int distance, EnvironmentObject p){
        if (distance == 0){
            System.out.println("Выезжая" + " " +"из" + " " + p.getName());
        } else if (distance > 0){
            System.out.println( " " + this.name + " отъехал"+ " " + "от" + " "  + "домa" + " " + "миль" + " "  + "на" + " " + distance);
        }

    }
    public void setStatement(String s, int m){
        if (s.equals("удивление")){
            emotion1.setLevel(m);
        }
        if (s.equals("страх")){
            emotion2.setLevel(m);
        }

    }
    public void showStatement(int one, int two){
        if (one == 1){
        emotion1.showEmotion(this);
        }
        if (two == 1){
            emotion2.showEmotion(this);
        }
    }
    public void goaway(){
        System.out.println(this.name + " уже выходил ");
    }
    public void driveway(EnvironmentObject p1, EnvironmentObject p2){
        if (p1.getClass() == Road.class) {
            if (p2.getClass() == ParkingLot.class){
                System.out.println(this.name + " свернул с " + p1.getName() + " на " + p2.toString());
            }
        }
    }
    public void FeelPain(int level){
        if(level==10){
            System.out.println("В голову словно вкручивали раскаленную проволоку");
        }
        if ((level < 10) && (level >= 5)){
            System.out.println("Во свсём теле ощущалась сильная, ноющая боль.");
        }
        if ((level > 0) && (level < 5)){
            System.out.println("Голова слегка побаливала, чувствовалось лёгкое недомогание.");
        }
    }
    public void showThoughts(String reason){
        if(emotion2.getLevel() > emotion1.getLevel()){
            System.out.println(emotion2.toString());
            Undernatural undernatural = new Undernatural();
            undernatural.scare(this, 0);
            undernatural.beInThoughts(this, false);
            System.out.println(emotion2.toString());
            System.out.println("Казалось, он " + reason);
            this.FeelPain(10);
        }
    }
}
