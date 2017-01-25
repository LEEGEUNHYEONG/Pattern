package _2_Observer;

import java.util.ArrayList;

import Util.log;

/**
 * Created by LGH on 2017-01-20.
 */

/**
 *  Inventory 클래스로서 그 기능과 ObserverManager 의 기능을 구현 한다
 */
public class Inventory implements ObserverManager
{
    //  Inventory 클래스에서 등록되는 옵저버들을 관리하기 위한 리스트
    private ArrayList<Observer> observerArrayList;


    public Inventory ()
    {
        observerArrayList = new ArrayList<> ();
    }

    /**
     *  Main 에서 전달되는 옵저버 객체를 리스트에 등록 함
     * @param o 전달 받은 옵저버 객체
     */
    @Override
    public void addObserver (Observer o)
    {
        observerArrayList.add (o);
    }

    /**
     *  Main 에서 전달되는 옵저버 객체를 리스트에서 제거함
     * @param o 전달 받은 옵저버 객체
     */
    @Override
    public void removeObserver (Observer o)
    {
        observerArrayList.remove (o);
    }

    /**
     *  리스트에 등록되어 있는 옵저버 객체들에 업데이트를 알림
     */
    @Override
    public void notifyObserver ()
    {
        for(Observer o : observerArrayList)
        {
            o.update ("equip : " + getItem ()); //  현재 아이템 리스트를 요청
        }
    }


    /**
     *  추가 사항
     */

    //  착용되는 아이템을 관리하기 위한 리스트
    private ArrayList<String> itemList = new ArrayList<> ();

    /**
     *  아이템 착용을 요청
     * @param name  추가할 아이템 이름
     */
    public void setItem(String name)
    {
        //  아이템 리스트에 전달받은 아이템이 이미 존재한다면 착용 실패 출력
        if(itemList.contains (name))
        {
            log.p (getClass ().getSimpleName (), "\t" + name + " : 착용 실패 : 이미 존재");
        }
        else
        {
            //  리스트에 해당 아이템을 추가 하며 등록된 옵저버들에 업데이트를 알림
            itemList.add (name);
            notifyObserver ();
        }

    }

    /**
     *  아이템 제거를 요청
     * @param name  해제할 아이템 이름
     */
    public void removeItem(String name)
    {
        //  아이템 리스트에 전달받은 아이템이 존재한다면
        //  해당 아이템을 리스트에서 삭제 하며 옵저버들에게 업데이트를 알림
        if(itemList.contains (name))
        {
            log.p (getClass ().getSimpleName (), "\t" + name + " : 삭제");
            itemList.remove (name);
            notifyObserver ();
        }
        else
        {
            //  아이템 리스트에 전달받은 아이템이 없을 경우 해제 실패 출력
            log.p (getClass ().getSimpleName (), "\t" + name + " : " + "해제 실패 : 존재하지 않는 아이템");
        }
    }

    /**
     *  아이템의 리스트를 요청
     * @return  아이템 리스트
     */
    public ArrayList<String> getItem()
    {
        return itemList;
    }
}
