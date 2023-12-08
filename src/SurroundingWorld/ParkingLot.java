package SurroundingWorld;

public class ParkingLot extends EnvironmentObject {
    public ParkingLot(String Fulness, EnvironmentObject owner, EnvironmentObject NearbyObj, String city) {
        super("стоянка");
        this.Fulness = Fulness;
        this.owner = owner;
        this.city = city;
        this.NearbyObject = NearbyObj;
    }

    private String Fulness;

    public String getFulness() {
        return this.Fulness;
    }
    @Override
    public String toString() {
        return this.Fulness + " " + this.name + " у " + this.owner.toString() + " неподалеку от " + this.getcity() +".";
    }

    private String city;
    public String getcity(){
        return this.city;
    }
    private EnvironmentObject owner;

    public EnvironmentObject getOwner() {
        return this.owner;
    }

    private EnvironmentObject NearbyObject;

    public EnvironmentObject getNearbyObject() {
        return this.NearbyObject;
    }
}
