package surroundingworld;

public abstract class EnvironmentObject {
    protected String name;
    public String getName(){
        return this.name;
    }
    public EnvironmentObject(){

    }
    public EnvironmentObject(String name){
        this.name = name;
    }
}
