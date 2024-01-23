package creatures;
import enums.*;
public abstract class Creatures {
    protected String name;
    protected Survivability existence;
    public void setExistence(Survivability e){
        this.existence = e;
    }
    public String getName(){
        return this.name;
    }
    public Survivability getExistence(){
        return this.existence;
    }
}
