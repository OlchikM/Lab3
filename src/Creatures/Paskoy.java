package Creatures;

import Enums.Survivability;
import Interface.PhysicalMove;
import Things.*;

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
