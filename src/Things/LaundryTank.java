package Things;

public class LaundryTank extends Thing{
    private Underclothes underclothes;
    public Underclothes getUnderclothes(){
        return this.underclothes;
    }
    public LaundryTank(String colour, String shape){

        super("Бак для грязного белья");
        this.colour = colour;
        this.shape = shape;
    }
    private String colour;
    private String shape;

    public String getColour(){
        return this.colour;
    }
    public String getShape(){
        return this.shape;
    }
}
