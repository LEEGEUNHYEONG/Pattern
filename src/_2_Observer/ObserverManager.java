package _2_Observer;

/**
 * Created by LGH on 2017-01-20.
 */

/**
 *  옵저버의 등록, 제거 그리고 통지 기능에 대한 인터페이스 정의
 */
public interface ObserverManager
{
    /**
     *  전달 받은 옵저버 객체를 등록
     * @param o 전달 받은 옵저버 객체
     */
    public void addObserver(Observer o);

    /**
     *  전달 받은 옵저버 객체를 제거
     * @param o 전달 받은 옵저버 객체
     */
    public void removeObserver(Observer o);

    /**
     *  등록되어 있는 옵저버에 통지
     */
    public void notifyObserver();
}
