package things;
public abstract class Thing {
    protected String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public Thing(String name){
        this.name = name;
    }
    public Thing(){}
}
