package _2_Observer;

import java.util.ArrayList;

import Util.log;

/**
 * Created by LGH on 2017-01-20.
 */
public class Inventory implements ObserverInterface
{
    private ArrayList<Observer> observerArrayList;

    public Inventory ()
    {
        observerArrayList = new ArrayList<> ();
    }

    @Override
    public void addObserver (Observer o)
    {
        observerArrayList.add (o);
    }

    @Override
    public void removeObserver (Observer o)
    {
        observerArrayList.remove (o);
    }

    @Override
    public void notifyObserver ()
    {
        for(Observer o : observerArrayList)
        {
            o.update ("notify !!! : " + getItem ());
        }
    }

    //private String item;
    private ArrayList<String> itemList = new ArrayList<> ();

    public void setItem(String name)
    {
        if(itemList.contains (name))
        {
            log.p (getClass ().getSimpleName (), "\t" + name + " : 이미 존재");
        }
        else
        {
            itemList.add (name);
            notifyObserver ();
        }

    }

    public void removeItem(String name)
    {
        if(itemList.contains (name))
        {
            log.p (getClass ().getSimpleName (), "\t" + name + " : 삭제");
            itemList.remove (name);
            notifyObserver ();

        }
        else
        {
            log.p (getClass ().getSimpleName (), "\t" + name + " : " + "존재하지 않는 아이템");
        }
    }

    public ArrayList<String> getItem()
    {
        return itemList;
    }


}
