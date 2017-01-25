package _2_Observer;

import Util.log;

/**
 * Created by LGH on 2017-01-20.
 */

/**
 *  Info 클래스로 그 기능과
 *  Observer 의 기능을 구현
 */
public class Info implements Observer
{
    private Inventory inventory;    //  생성 시 전달받을 인벤토리

    /**
     *  Info 클래스 생성 시 메인에서 생성 된 Inventory 인스턴스를 전달 받음
     *  Info 인스턴스 안에서 Inventory 에 Info 자기자신을 옵저버로 등록, 해제 하는데 용이하기 위함
     * @param inventory
     */
    public Info (Inventory inventory)
    {
        this.inventory = inventory;
        inventory.addObserver (this);   //  inventory 에 옵저버로 등록함
    }

    /**
     *  inventory 에서 업데이트 발생 시 호출
     * @param title update 동작에 대한 결과 문자열을 반환
     */
    @Override
    public void update (String title)
    {
        log.p (getClass ().getSimpleName (), title);    //  업데이트 알림 시 전달받은 결과 문자열 출력
    }

    /**
     *  자기 자신을 옵저버 목록에서 제거 함
     */
    public void remove()
    {
        inventory.removeObserver (this);    //  inventory 에 등록된 옵저버(자기자신)을 제거 함
    }
}
