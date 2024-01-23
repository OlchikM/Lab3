package surroundingworld;
public class Restaraunt extends EnvironmentObject {
    public Restaraunt(String cuisine){
        super("ресторанчик");
        this.cuisine = cuisine;
    }
    private String cuisine;
    public String getcuisine(){
        return this.cuisine;
    }
    @Override
    public String toString(){
        return this.cuisine + " " + name;
    }
}
