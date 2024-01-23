package surroundingworld;
import creatures.Person;
public class Road extends EnvironmentObject{
    public Road(){
        super("дорога");
    }
    public void beRough(Person p){
        System.out.println("Машину " + p.getName() + " сильно затрясло.");
    }
}
