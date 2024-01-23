package things;
import properties.*;
public class LaundryTank extends Thing{
    private Underclothes underclothes;
    public Underclothes getUnderclothes(){
        return this.underclothes;
    }
    public LaundryTank(Colour colour, Shape shape){
        super("Бак для грязного белья");
        this.colour = colour;
        this.shape = shape;
    }
    private Colour colour;
    private Shape shape;
    public String getColour(){
        return this.colour.getName();
    }
    public String getShape(){
        return this.shape.getName();
    }
}
