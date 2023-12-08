package Things;

public class Underclothes extends Thing{
    private String LevelOfCleanliness;
    public Underclothes(String LevelOfCleanliness){
        super("белье");
        this.LevelOfCleanliness = LevelOfCleanliness;
    }
    public String getLevelOfCleanliness(){
        return this.LevelOfCleanliness;
    }
}
