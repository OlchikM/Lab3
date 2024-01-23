package things;
public class Meal extends Thing {
    public Meal(String name, int Weight){
        super();
        this.setName(name);
        this.Weight = Weight;
    }
    private int Weight;
    public int getWeight(){
        return this.Weight;
    }
    public void setWeight(int Weight){
        this.Weight = Weight;
    }
}
