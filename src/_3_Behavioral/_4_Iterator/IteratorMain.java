package _3_Behavioral._4_Iterator;

/**
 * Created by LGH on 2017-05-15.
 */
public class IteratorMain
{
    public IteratorMain ()
    {
        //  Inventory 를 생성하며, Inventory 의 크기를 10으로 설정
        Inventory inventory = new Inventory (10);

        //  Inventory 에 아래와 같은 Item 들을 추가 함
        inventory.addItem (new Item("텀블러"));
        inventory.addItem (new Item("지갑"));
        inventory.addItem (new Item("필통"));
        inventory.addItem (new Item("노트북"));
        inventory.addItem (new Item("카메라"));

        //  Inventory 의 Iterator 를 가져 옴
        Iterator iterator = inventory.iterator ();

        Item item;

        //  Iterator 에 다음 항목이 존재하는 경우
        while(iterator.hasNext ())
        {
            //  Iterator 를 통해 다음 항목을 가져 옴
            item = (Item)iterator.next ();
            System.out.println(item.getName ());
        }
    }
}
