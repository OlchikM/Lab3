package Creatures;
import Enums.Survivability;
import Enums.Time;
import Interface.*;
import SurroundingWorld.EnvironmentObject;

public class Person extends Creatures {
    public Person() {
    }
    @Override
    public int hashCode(){
        if (this.existence == Survivability.ALIVE){
            int i = 60589541;
            return i;
        }else{
            int i = 60589540;
            return i;
        }
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if ((o == null) || (this.getClass() != o.getClass())) return false;
        return (((Person) o).getName().equals(this.name) && ((Person) o).getExistence().equals(this.existence));
    }

    @Override
    public String toString(){
        return this.name;
    }

    ;

    public Person(String name) {
        this.name = name;
    }


    public static void PublicDrive(Person p1, Person p2, Time e, Person p3, EnvironmentObject where) {
        if (e == Time.YESTERDAY) {
            if (p3.getExistence() == Survivability.DIED) {
                System.out.println("В " + where.toString() + " " + "вчера увезли тело " + p3.getName());
            } else {
                System.out.println("В " + where.toString() + " " + "вчера увезли " + p3.getName());
            }

        }
    }
}
