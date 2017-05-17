package _3_Behavioral._6_Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LGH on 2017-05-16.
 */
public class MementoMain
{
    /**
     *  Caretaker 역할을 수행
     *  Originator 가 되돌아갈 수 있도록 하는 객체
     */
    public MementoMain ()
    {
        //  Originator 의 상태를 저장하기 위한 리스트
        List<Originator.Memento> saveStates = new ArrayList<Originator.Memento> ();

        Originator originator = new Originator ();

        originator.set ("Stair 1");
        saveStates.add (originator.saveToMemento ());
        originator.set ("Stair 2");
        saveStates.add (originator.saveToMemento ());
        originator.set ("Stair 3");
        saveStates.add (originator.saveToMemento ());
        originator.set ("Stair 4");

        //  리스트에서 마지막으로 저장된 상태를 가져옴
        originator.restoreFromMemento (saveStates.get (saveStates.size ()-1));
        saveStates.remove (saveStates.size ()-1);

        originator.restoreFromMemento (saveStates.get (saveStates.size ()-1));
        saveStates.remove (saveStates.size ()-1);


    }
}
