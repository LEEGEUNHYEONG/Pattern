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
public class ComputerPartBootVisitor implements ComputerPartVisitor
{
    @Override
    public void visit(Computer computer)
    {
        System.out.println("Booting Computer");
    }

    @Override
    public void visit(Mouse mouse)
    {
        System.out.println("Booting Mouse");
    }

    @Override
    public void visit(Keyboard keyboard)
    {
        System.out.println("Booting Keyboard");
    }

    @Override
    public void visit(Monitor monitor)
    {
        System.out.println("Booting Monitor");
    }
}
