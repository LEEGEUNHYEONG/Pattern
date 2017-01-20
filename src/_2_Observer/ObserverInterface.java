package _2_Observer;

/**
 * Created by LGH on 2017-01-20.
 */
public interface ObserverInterface
{
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
