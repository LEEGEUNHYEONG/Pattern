package _2_Structural._3_Composite;

/**
 * Created by LGH on 2017-04-28.
 */
public abstract class Component
{
    private String name;

    public Component (String name)
    {
        this.name = name;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }
}
