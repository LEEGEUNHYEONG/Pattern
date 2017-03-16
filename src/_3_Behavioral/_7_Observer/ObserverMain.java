package _3_Behavioral._7_Observer;

import Util.log;

/**
 * Created by LGH on 2017-01-20.
 */
public class ObserverMain
{
    public ObserverMain ()
    {
        //  아이템을 관리하는 Inventory 클래스를 생성
        Inventory inventory = new Inventory ();
        //  head 아이템을 착용 but 업데이트 알람을 받을 곳이 없어 출력하지는 않음
        inventory.setItem ("head");

        //  Info 인스턴스를 생성하며 inventory 인스턴스를 전달 받아 자기 자신을 옵저버로 등록함
        Info info = new Info (inventory);
        //  Status 인스턴스를 생성하며 inventory 인스턴스를 전달 받으며 자기자신을 옵저버로 등록함
        Status status = new Status (inventory);

        //  neck 아이템을 착용하며 등록된 옵저버들에게 착용 알람이 전달
        inventory.setItem ("neck");
        log.p ("");

        //  ring 아이템의 착용 해제를 요청하며 그 결과에 대한 알람이 발생
        //  but ring 이라는 아이템이 없으므로 에러 발생 함
        inventory.removeItem ("ring");
        log.p ("");

        //  neck 아이템을 착용하지만 이미 착용한 neck 아이템이 있으므로 에러 발생 함
        inventory.setItem ("neck");
        log.p ("");

        //  status 인스턴스를 inventory 에 등록된 옵저버에서 제거함
        //  inventory 에서 옵저버에 update 알람 동작을 확인해 보기 위함
        status.remove ();

        //  ring 아이템을 착용하며 등록된 옵저버들에게 착용 알람이 전달
        //  위에서 status 인스턴스를 옵저버에서 제거하였으므로 info 인스턴스에서만 결과가 출력 됨
        inventory.setItem ("ring");
        log.p ("");

        //  다시 status 인스턴스를 생성하며, inventory 에 옵저버로 등록 함
        status = new Status (inventory);

        //  ring 아이템을 착용하며 등록된 옵저버들에게 착용 알람이 전달
        //  status 를 옵저버로 등록하였으므로 info 와 status 모두에 weapon 착용 결과가 출력 됨
        inventory.setItem ("weapon");
    }
}
