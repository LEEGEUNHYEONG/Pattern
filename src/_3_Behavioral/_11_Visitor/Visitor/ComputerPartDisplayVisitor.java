package _3_Behavioral._11_Visitor.Visitor;

import _3_Behavioral._11_Visitor.Computer;
import _3_Behavioral._11_Visitor.Part.Keyboard;
import _3_Behavioral._11_Visitor.Part.Monitor;
import _3_Behavioral._11_Visitor.Part.Mouse;

/**
 * Created by lkh25 on 2017-05-20.
 */

/**
 *  Concrete Visitor 클래스
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor
{
    @Override
    public void visit(Computer computer)
    {
        System.out.println("Displaying Computer");
    }

    @Override
    public void visit(Mouse mouse)
    {
        System.out.println("Displaying Mouse");
    }

    @Override
    public void visit(Keyboard keyboard)
    {
        System.out.println("Displaying Keyboard");
    }

    @Override
    public void visit(Monitor monitor)
    {
        System.out.println("Displaying Monitor");
    }
}
