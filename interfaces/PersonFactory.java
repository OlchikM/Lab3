package interfaces;
import creatures.Person;
public interface PersonFactory {
    public static Person create(){
        return new Person("Unknown");
    }
}
