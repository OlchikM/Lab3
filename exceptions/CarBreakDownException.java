package exceptions;
import creatures.*;
public class CarBreakDownException extends Throwable{
    public CarBreakDownException(String message, Person underTheInfluenceOf){ //This event has a very strong effect on a person's mood
        super(message);
        int f = underTheInfluenceOf.getLevelOfEmotion3();
        underTheInfluenceOf.setLevelOfHappiness(f);
    }
}
