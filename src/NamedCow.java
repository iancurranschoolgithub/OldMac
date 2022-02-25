

public class NamedCow implements Animal {
    private String myType;
    private String mySound;
    private String myName;
    
    NamedCow()
    {
        myName = "Elise";
        myType = "cow";
        mySound = "moo";
    }
    
    /*public String setName()
    {
        String name = "";

        return name;
    } */

    public String getName()
    {
        return myName;
    }

    public String getSound()
    {
        return mySound;
    }

    public String getType() {
        return myType;
    }
}
