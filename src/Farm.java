import java.util.ArrayList;

public class Farm{
    private ArrayList<Animal> myFarm = new ArrayList <Animal>();
    public Farm(){
        myFarm.add(new Cow());
        myFarm.add(new Chick());
        myFarm.add(new Pig());
        myFarm.add(new NamedCow("Elise"));
    }
    public void animalSounds(){
        Animal temp;
        for (int i = 0; i < myFarm.size(); i++) {
            temp = myFarm.get(i);
            System.out.println(temp.getType() + " goes " + temp.getSound());
        }
            NamedCow named = (NamedCow) myFarm.get(3);
            System.out.println(named.getName());
    }
}