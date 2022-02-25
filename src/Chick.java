import java.math.*;

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

        double x = 2*Math.random();
        if (x >= 1){
            mySound = "cheep";
        }
        return mySound;
    }

    public String getType() {
        return myType;
    }
}
