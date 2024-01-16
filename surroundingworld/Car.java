package surroundingworld;

public class Car extends EnvironmentObject{
    private int  amountOfGasoline; // Varies from 1 to 10
    private int type; // 1-car, 2-lorry, 3-bus.
    public int getType(){
        return this.type;
    }

    public int getAmountOfGasoline() {
        return amountOfGasoline;
    }
    public void setAmountOfGasoline(int amountOfGasoline){
        this.amountOfGasoline = amountOfGasoline;
    }
    public Car(String name, int type){
        super(name);
        this.amountOfGasoline = 10;
        this.type = type;
    }
}
