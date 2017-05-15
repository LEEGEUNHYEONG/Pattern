package _3_Behavioral._4_Iterator;

/**
 * Created by LGH on 2017-05-15.
 */

/**
 *  Concrete Iterator 클래스
 *  Iterator 의 정의된 기능을 구현 하는 클래스
 */
public class InventoryIterator implements Iterator
{
    private Inventory inventory;
    private int index = 0;

    private Item item;

    public InventoryIterator (Inventory inventory)
    {
        this.inventory = inventory;
    }

    /**
     *  Index 와 Inventory 의 마지막 위치를 비교하여
     *  다음 항목의 존재 여부를 return
     * @return
     */
    @Override
    public boolean hasNext ()
    {
        if(index < inventory.getCount ())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     *  현재 위치의 항목을 Inventory 에서 가져오며
     *  탐색이 이루어 졌으므로 index 의 위치를 +1 시킨 뒤 가져온 Item 을 return
     *
     * @return
     */
    @Override
    public Object next ()
    {
        item = inventory.getItemAt (index);
        index++;
        return item;
    }
}
