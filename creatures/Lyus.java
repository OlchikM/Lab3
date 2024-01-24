package creatures;
import enums.*;
import emotions.*;
import interfaces.Feelingable;
import interfaces.PhysicalMove;
import surroundingworld.*;
import things.*;
import exceptions.*;
public class Lyus extends Person implements PhysicalMove{
    private Wonderment emotion1;
    private Fear emotion2;
    private Happiness emotion3;
    public void changeLevelOfHappiness(int l, String sign) {
        if (sign.equals("-")) {
            int a = this.emotion3.getLevel();
            a -= l;
            this.setLevelOfHappiness(a);
        } else {
            int a = this.emotion3.getLevel();
            a += l;
            this.setLevelOfHappiness(a);
            }
    }
    public Lyus(){
        super("Льюис");
        this.existence = Survivability.ALIVE;
        this.emotion1 = new Wonderment();
        this.emotion2 = new Fear();
        this.emotion3 = new Happiness();
    }
    public void eat(Meal meal) throws NoneEatingException{// When eating food, fatigue increases slightly and satiety increases depending on the severity of the meal.
        if (meal == null){
            throw new NoneEatingException("Пожалуйста, будьте ВНИМАТЕЛЬНЕЕ!!! Герой не может есть пустоту");
        }
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
    public void kiss(Person p1, Person p2){ //After applying this method, the arguments of the method either increase the level of happiness or decrease, depending on the skills of this.
        double rand1 = Math.random()*10;
        double rand2 = Math.random()*10;
        int L1 = p1.getLevelOfEmotion3();
        int L2 = p2.getLevelOfEmotion3();
        if (rand1 >= 5){
            L1 += 2;
        } else{
            L1 -= 2;
        }
        if (rand2 >= 5){
            L2 += 2;
        } else{
            L2 -= 2;
        }
        p1.setLevelOfHappiness(L1);
        p2.setLevelOfHappiness(L2);
        String a1 = p1.name;
        String a2 = p2.name;
        System.out.println(this.name + " поцеловал " + a1 + " и " + a2);
    }
    public void watch(int level, Thing thing) {
        if (thing.getClass() == LaundryTank.class) {
            String namet = thing.getName();
            String colourt = ((LaundryTank) thing).getColour();
            String shapet = ((LaundryTank) thing).getShape();
            if ((level < 5) && (level > 0)) {
                System.out.println(this.name + " мельком взглянул на " + colourt + " " + shapet + " " + namet);
                this.upgradeConcentration(1);
            } else if ((level >= 5) && (level <= 10)){
                System.out.println(this.name + " посмотрел на " + colourt + " " + shapet + " " + namet);
                this.upgradeConcentration(2);
            }
        }
        else {
            System.out.println(this.name + " посмотрел на " + thing.getName() );
            this.downgradeConcentration(1);
            }

    }
    public void watch(int level, EnvironmentObject environmentObject){
        if (level == 5) {
            System.out.println(this.name + " посмотрел" + " " + "на"  + " " + environmentObject.getName());
            this.upgradeConcentration(1);
        }
        if ((level > 5) && (level <= 10)){
            System.out.println(this.name + " уставился на " + environmentObject.getName());
            this.upgradeConcentration(2);
        }
    }
    public void driveACar(int distance, EnvironmentObject p, Car car) throws CarBreakDownException {
        boolean flag = true;
        try {
            int check = car.getAmountOfGasoline();
            if (check <= 3) {
                throw new NotEnoughGasolineException("Ой! Бензина недостаточно!");
            }
        } catch (NotEnoughGasolineException e) {
            System.out.println(e.getMessage());
            flag = false;
        }
        if (flag) {
            if (distance < 0) {
                throw new CarBreakDownException("Ой, машина сломалась!");
            }
            if (distance == 0) {
                System.out.println("Выезжая" + " " + "из" + " " + p.getName());
                ((Garage)p).beFree(car);
            } else if (distance > 0) {
                System.out.println(" " + this.name + " отъехал" + " " + "от" + " " + "домa" + " " + "миль" + " " + "на" + " " + distance);
                int amount = car.getAmountOfGasoline();
                if (distance<=5){
                    amount -= 2;
                    car.setAmountOfGasoline(amount);
                } else{
                    amount -= 3;
                    car.setAmountOfGasoline(amount);
                }
            }
        }
    }

    public void setStatement(Feelingable f, int level, String reason){
        Wonderment example1 = new Wonderment();
        Fear example2 = new Fear();
        Happiness example3 = new Happiness();
        if (f.equals(example1)){
            this.emotion1.setLevel(level);
        }
        if (f.equals(example2)){
            this.emotion2.setLevel(level);
        }
        if (f.equals(example3)){
            this.emotion3.setLevel(level);
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
    public void goAway(){
        System.out.println(this.name + " уже выходил ");
        float level = this.getTiredness();
        level += 3;
        this.setTiredness(level);
    }
    public void driveAway(EnvironmentObject nearbyObject1, EnvironmentObject nearbyObject2, Car car){
        boolean flag = true;
        try {
            int check = car.getAmountOfGasoline();
            if (check <= 3) {
                throw new NotEnoughGasolineException("Ой! Бензина недостаточно!");
            }
        } catch (NotEnoughGasolineException e) {
            System.out.println(e.getMessage());
            flag = false;
        }
        if (flag){
        if (nearbyObject1.getClass() == Road.class) {
            if (nearbyObject2.getClass() == ParkingLot.class) {
                System.out.println(this.name + " свернул с " + nearbyObject1.getName() + " на " + nearbyObject2.toString());
            }
        }
        int a = this.getConcentrationOfAttention();
        a += 1;
        this.setConcentrationOfAttention(a);
        }
    }
    public void FeelPain(int level){
        Pain pain = new Pain();
        pain.influencePerson(level, this);
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
    class Pain{
        int level;
        Pain(){
        }
        void influencePerson(int level, Person p) { //The method describes what happens to a person and reduces a person's level of happiness and concentration. If the pain is above the acceptable limit, that person is dying.
            if ((level < 5) && (level > 0)) {
                System.out.println("Голова слегка побаливала, чувствовалось лёгкое недомогание.");
                p.changeLevelOfHappiness(1, "-");
                this.level = level;
                p.downgradeConcentration(1);
            }
            if ((level >= 5) && (level < 10)){
                System.out.println("Во свсём теле ощущалась сильная, ноющая боль.");
                p.changeLevelOfHappiness(2, "-");
                this.level = level;
                p.downgradeConcentration(2);
            };
            if (level == 10){
                System.out.println("В голову словно вкручивали раскаленную проволоку");
                p.changeLevelOfHappiness(3, "-");
                this.level = level;
                p.downgradeConcentration(3);
            }
            if (level > 10){
                p.setExistence(Survivability.DIED);
                this.level = level;
            }
        }
    }
}
