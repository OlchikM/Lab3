package Interface;

import Creatures.Person;

public interface PersonFactory {
    public static Person create(){
        Person a = new Person("Unknown");
        return a;
    }
}
