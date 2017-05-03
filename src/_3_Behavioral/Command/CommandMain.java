package _3_Behavioral.Command;

/**
 * Created by LGH on 2017-05-03.
 */
public class CommandMain
{
    public CommandMain ()
    {
        MapEditor mapEditor = new MapEditor ();

        mapEditor.create ("디바", 1, 1);
        mapEditor.create ("위도우", 500, 200);
        mapEditor.create ("트레이서", 150, 150);
        mapEditor.create ("겐지", 100, 100);
        mapEditor.create("한조", 300, 150);
        mapEditor.delete ("디바", 1, 1);


        mapEditor.undo (6);
        mapEditor.redo (1);

    }
}
