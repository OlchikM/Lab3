package creatures;

public class Undernatural extends Creatures{
    Undernatural(){
        this.name = "сверхъестественное";
    }
    public void scare(Person p, int level){
        if ((0 <= level) && (level < 5)){
            System.out.println(this.name + " не пугало " + p.getName() + "a");
        }
        if (level == 5){
            System.out.println(this.name + "пугало" + p.getName());
        }
        if ((level > 5) && (level < 10)){
            System.out.println(this.name + " ужасало " + p.getName() + "." + p.getName() + " не мог думать ни о чем другом, ужас овладел им.");
        }
    }
    public void beInThoughts(Person p, boolean beornot){
        if (beornot){
            System.out.println("Мысли о чем-то сверхъестественном раздирали его");
        } else{
            System.out.println("Ни о чем таком даже не думалось.");
        }
    }
}
