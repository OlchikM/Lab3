package things;

public class Underclothes extends Thing{
    private String levelOfCleanliness;
    public Underclothes(String LevelOfCleanliness){
        super("белье");
        this.levelOfCleanliness = LevelOfCleanliness;
    }
    public String getLevelOfCleanliness(){
        return this.levelOfCleanliness;
    }
}
