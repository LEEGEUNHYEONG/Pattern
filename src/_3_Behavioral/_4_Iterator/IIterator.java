package _3_Behavioral._4_Iterator;

/**
 * Created by LGH on 2017-05-15.
 */

/**
 *  IIterator 의 기능을 정의
 */
public interface IIterator
{
    //  다음 항목이 존재하는지 여부를 return
    public boolean hasNext();

    //  다음 항목의 객체를 return
    public Object next();
}
