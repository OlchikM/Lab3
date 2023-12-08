package SurroundingWorld;

import Creatures.Person;

public class Road extends EnvironmentObject{
    public Road(){
        super("дорога");
    }
    public void berough(Person p){
        System.out.println("Машину " + p.getName() + " сильно затрясло.");
    }
}
