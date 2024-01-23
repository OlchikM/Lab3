package surroundingworld;
public class Hospital extends EnvironmentObject {
    private String sizeLevel;
    public Hospital(String size){
        super("больница");
        this.sizeLevel = size;
    }
    public String getSizeLevel(){
        return this.sizeLevel;
    }
    @Override
    public String toString(){
        return this.sizeLevel + " " + this.name;
    }
}
