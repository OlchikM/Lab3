package surroundingworld;

public class ParkingLot extends EnvironmentObject {
    public ParkingLot(String fulness, EnvironmentObject owner, EnvironmentObject nearbyObj, String city) {
        super("стоянка");
        this.fulness = fulness;
        this.owner = owner;
        this.city = city;
        this.nearbyObject = nearbyObj;
    }

    private String fulness;

    public String getFulness() {
        return this.fulness;
    }
    @Override
    public String toString() {
        return this.fulness + " " + this.name + " у " + this.owner.toString() + " неподалеку от " + this.getcity() +".";
    }

    private String city;
    public String getcity(){
        return this.city;
    }
    private EnvironmentObject owner;

    public EnvironmentObject getOwner() {
        return this.owner;
    }

    private EnvironmentObject nearbyObject;

    public EnvironmentObject getNearbyObject() {
        return this.nearbyObject;
    }
}
