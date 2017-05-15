package _3_Behavioral._4_Iterator;

/**
 * Created by LGH on 2017-05-15.
 */

/**
 *  Concrete Aggregate 클래스
 *  Aggregate 인터페이스의 Iterator 를 실제 구현 함
 */
public class Inventory implements Aggregate
{
    //  Item 을 저장할 배열 선언
    private Item[] items;
    //  배열의 마지막 위치를 저장
    private int last = 0;

    public Inventory (int size)
    {
        //  전달받은 사이즈의 배열을 생성
        items = new Item[size];
    }

    /**
     *  Items 배열에서 전달받은 포지션의 Item 정보를 return
     * @param position
     * @return
     */
    public Item getItemAt(int position)
    {
        return items[position];
    }

    /**
     *  Items 배열에 Item 정보를 추가
     *  현재 가리키고 있는 위치에 Item 정보를 추가 한뒤
     *  last 가 가리키는 위치를 +1 시킴
     * @param item
     */
    public void addItem(Item item)
    {
        this.items[last] = item;
        last++;
    }

    /**
     *  현재 Items 배열에 채워진 Item 의 갯수를 return
     * @return
     */
    public int getCount ()
    {
        return last;
    }

    /**
     *  Items 배열을 탐색할 수 있는 Iterator 를 생성하여 return 함
     * @return
     */
    @Override
    public Iterator iterator ()
    {
        return new InventoryIterator (this);
    }
}
