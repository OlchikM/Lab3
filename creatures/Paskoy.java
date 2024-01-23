package creatures;
import enums.Survivability;
import interfaces.PhysicalMove;
import things.*;
public class Paskoy extends Person implements PhysicalMove {
    public Paskoy(){
        super("Вику Паскоу");
        this.setExistence(Survivability.DIED);
    }
    @Override
    public void eat(Meal meal) {
        if (this.existence == Survivability.DIED) {
            System.out.println(this.name + " уже никогда не сможет отведать " + meal.getName());
        } else{
            System.out.println(this.name + " съела " + meal.getName());
            String a = meal.getName();
            int parametr = meal.getWeight();
            this.tiredness += 0.5F;
            if (parametr >= 15){
                this.satiety += 3;
            }
            if ((parametr < 15) && (parametr >= 7)){
                this.satiety += 2;
            }
            if (parametr < 7){
                this.satiety += 1;
            }
            System.out.println(this.name +" съел "+a);
        }
    }
    @Override
    public void watch(int level, Thing thing) {
        if (this.existence == Survivability.DIED) {
            System.out.println(this.name + " уже никогда не сможет ни на что взглянуть ");
        }else{
            System.out.println(this.name + " посмотрела на " + thing.getName());
        }
        }
    }
