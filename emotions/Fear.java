package emotions;
import creatures.*;
import interfaces.Feelingable;
import java.util.Objects;
public class Fear implements Feelingable {
    private String name;
    private int type;
    public String getName(){
        return this.name;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, type);
    }
    public Fear(){
        this.name = "страх";
        this.type = 1;
    }
    public boolean equals(Object o){
        if (this == o) return true;
        if ((o == null) || (this.getClass() != o.getClass())) return false;
        return (((Fear) o).getName().equals(this.name));
    }
    private int levelOfFear;
    public int getLevel(){
        return this.levelOfFear;
    }
    public void setLevel(int s){
        this.levelOfFear = s;
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
        if (this.levelOfFear == 10){
            Shudder shudder = new Shudder();
            shudder.shake(p);
        }
    }
    @Override
    public String toString(){
        return "Было страшно.";
    }
}
