package _3_Behavioral._6_Memento;

/**
 * Created by LGH on 2017-05-17.
 */

/**
 *  Originator 역할
 *  내부 상태를 가지는 객체
 */
public class Originator
{
    private String name = getClass ().getSimpleName ();
    private String state;

    /**
     *  현재 상태를 설정하는 메소드
     * @param state
     */
    public void set(String state)
    {
        System.out.println(name + " save state "  + state);
        this.state = state;
    }

    /**
     *  Memento 클래스를 통해 현재 상태를 저장한 객체를 return 하는 메소드
     * @return
     */
    public Memento saveToMemento()
    {
        System.out.println(name + " save Memento");
        return new Memento(state);
    }

    /**
     *  현재 상태를 전달받은 Memento 객체에 저장된 상태로 복구하는 메소드
     * @param memento
     */
    public void restoreFromMemento(Memento memento)
    {
        state = memento.getSavedState();
        System.out.println(name + " restore from Memento : " + state);
    }

    /**
     *  내부 상태를 저장하는 객체
     */
    public static class Memento
    {
        private final String state;

        public Memento(String state)
        {
            this.state = state;
        }
        public String getSavedState()
        {
            return state;
        }
    }
}
