import surroundingworld.EnvironmentObject;
public abstract class World {
    public static void beOk(){
        System.out.println("Все было нормально.");
    }
    public static void beOk(EnvironmentObject p){
        String where = p.getName();
        System.out.println("На " +  where + " все было нормально");
    }
}
