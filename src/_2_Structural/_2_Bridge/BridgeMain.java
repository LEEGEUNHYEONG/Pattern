package _2_Structural._2_Bridge;

/**
 * Created by LGH on 2017-04-27.
 */
public class BridgeMain
{
    public BridgeMain ()
    {
        Controller s = new Controller (new GalaxyS ());
        Controller note = new Controller (new GalaxyNote ());

        s.turnOn ();
        note.turnOn ();

        System.out.println();

        note.turnOff ();
        s.turnOff ();
    }
}
