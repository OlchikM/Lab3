package emotions;
import interfaces.Feelingable;
import creatures.*;
import java.util.Objects;
public class Happiness implements Feelingable {
    private String name;
    private int type;
    public Happiness(){
        this.name = "счастье";
        this.level = 5;
        this.type = 3;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, type);
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if ((o == null) || (this.getClass() != o.getClass())) return false;
        return (((Happiness) o).getName().equals(this.name));
    }
    private int level;
    public int getLevel(){
        return this.level;
    }
    public void showEmotion(Person p){ // Depending on the level of happiness, the current state of a person is displayed: he does not feel anything unusual, either he is depressed or he is happy.
        if (this.level == 5){
            System.out.println("Ничего особенного не чувствовалось. Не ощущались приливы радости, но и уныния не было.");
        }
        if (this.level > 5){
            System.out.println("Чувствовалось что-то особенное. Будто все вокруг было очень ярким, красочнымБ необычным... Счастье витало в воздухе.");
        }
        if (this.level < 5){
            System.out.println("Уныние накатывало со страшной силой... Будто все вокруг померкло и резко стало очень-очень холодно, будто бы из мира забрали все счастье...");
        }
    }
    public void setLevel(int level){
        this.level = level;
    }
}
