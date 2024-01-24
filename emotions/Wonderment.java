package emotions;
import creatures.Person;
import interfaces.Feelingable;
import java.util.Objects;
public class Wonderment implements Feelingable {
    private final String name;
    private final int type;
    public Wonderment(){
        this.name = "удивление";
        this.type = 3;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, type);
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return this.name;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if ((o == null) || (this.getClass() != o.getClass())) return false;
        return (((Wonderment) o).getName().equals(this.name));
    }
    private int levelOfWonderment = 0;
    public int getLevel(){
        return this.levelOfWonderment;
    }
    @Override
    public void showEmotion(Person p) {
        if (this.levelOfWonderment < 5){
            System.out.println(p.getName() + " даже бровью не повёл");
        }
    }
    public void setLevel(int s){
        this.levelOfWonderment = s;
    }
}
