package _2_Structural._3_Composite;

/**
 * Created by LGH on 2017-04-28.
 */

/**
 *  객체들의 기본 상태를 가지는 추상 클래스
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
