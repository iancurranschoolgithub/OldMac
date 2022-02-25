import java.math.*;

public class Chick implements Animal {
    private String myType;
    private String mySound;

    public String determineSounds()
    {
        String chickSounds;
        double x = 2*Math.random();
        if (x >= 1){
            chickSounds = "cheep";
        }
        else chickSounds = "cluck";
        return chickSounds;
    }

    Chick()
    {
        myType = "chick";
        mySound = determineSounds();
    }

    public String getSound()
    {
        return mySound;
    }

    public String getType() {
        return myType;
    }
}
