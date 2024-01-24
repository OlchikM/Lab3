package creatures;
import emotions.Fear;
import emotions.Happiness;
import emotions.Wonderment;
import enums.Survivability;
import enums.Time;
import exceptions.NotEnoughGasolineException;
import surroundingworld.*;
import java.util.Objects;
public class Person extends Creatures {
    protected int satiety; //The satiety scale is from 1 to 10. if a person is in a normal state and healthy, satiety is 5, if hungry - less than 5, if overeated - more than 5.
    protected float tiredness; //The scale of human fatigue. In a normal state (more often in the morning or afternoon), when a person is healthy, the score is 5, in the late afternoon it is more than 5. if a person is ill - 8 or 9, after hard work it increases, on holidays or holidays about 2 or 3.
    public float getTiredness(){
        return this.tiredness;
    }
    private int concentrationOfAttention;
    public int getConcentrationOfAttention(){
        return this.concentrationOfAttention;
    }
    public void changeConcentration(int level, String sign){
        if (sign.equals("-")) {
            this.concentrationOfAttention -= level;
        } else {
            this.concentrationOfAttention += level;
        }
    }
    protected Wonderment emotion1;
    protected Fear emotion2;
    protected Happiness emotion3;
    public void setTiredness(float Tiredness){
        this.tiredness = Tiredness;
    }
    public int getSatiety(){
        return this.satiety;
    }
    public void setSatiety(int Satiety){
        this.satiety = Satiety;
    }
    public int getLevelOfEmotion3(){
        return this.emotion3.getLevel();
    }
    public void setLevelOfHappiness(int L){
        this.emotion3.setLevel(L);
    }
    public void changeLevelOfHappiness(int delta, String sign) {
        if (sign.equals("-")) {
            int a = this.emotion3.getLevel();
            a -= delta;
            this.setLevelOfHappiness(a);
        } else {
            int a = this.emotion3.getLevel();
            a += delta;
            this.setLevelOfHappiness(a);
        }
    }
    public Person() {
        this.satiety = 5;
        this.tiredness = 5;
        Wonderment wonderment  = new Wonderment();
        this.emotion1 = wonderment;
        Fear fear = new Fear();
        this.emotion2 = fear;
        Happiness happiness;
        happiness = new Happiness();
        this.emotion3 = happiness;
        this.concentrationOfAttention = 5; // Concentration of attention is a parameter that changes when a person is focused on something or feels pain.
    }
    @Override
    public int hashCode(){
        return Objects.hash(existence, name);
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
    };
    public Person(String name) {
        this.name = name;
        this.satiety = 5;
        this.tiredness = 5;
        this.concentrationOfAttention = 5;
        this.emotion3 = new Happiness();
        this.emotion2 = new Fear();
        this.emotion1 = new Wonderment();
    }
    public static void publicDrive(Person person1, Person person2, Time day, Person p3, EnvironmentObject where, Car car, Garage garage) {
        boolean flag = true;
        try {
            int check = car.getAmountOfGasoline();
            if (check <= 3) {
                throw new NotEnoughGasolineException("Ой! Бензина недостаточно!");
            }
        } catch (NotEnoughGasolineException e) {
            System.out.printf(e.getMessage());
            flag = false;
        }
        if (flag){
        if (day == Time.YESTERDAY) {
            if (p3.getExistence() == Survivability.DIED) {
                System.out.println("В " + where.toString() + " " + "вчера увезли тело " + p3.getName());
                garage.beFree(car);
            } else {
                System.out.println("В " + where.toString() + " " + "вчера увезли " + p3.getName());
                int a = garage.getOccupancy() - car.getType();
                garage.beFree(car);
            }
        }
        int amount = car.getAmountOfGasoline();
        amount -= 2;
        car.setAmountOfGasoline(amount);
        }
    }
    public void setConcentrationOfAttention(int concentrationOfAttention){
        this.concentrationOfAttention = concentrationOfAttention;
    }
}
