public class Chick implements Animal {
    private String myType;
    private String mySound;

    Chick()
    {
        myType = "chick";
        mySound = "cluck";
    }

    public String getSound()
    {
        return mySound;
    }

    public String getType() {
        return myType;
    }
}
