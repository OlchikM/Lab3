package SurroundingWorld;

import Enums.Seasons;

public class Hospital extends EnvironmentObject {
    private String SizeLevel;
    public Hospital(String size){
        super("больница");
        this.SizeLevel = size;
    }
    public String getSizeLevel(){
        return this.SizeLevel;
    }
    @Override
    public String toString(){
        return this.SizeLevel + " " + this.name;
    }
}
