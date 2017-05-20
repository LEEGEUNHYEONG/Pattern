package _3_Behavioral._11_Visitor.Visitor;

import _3_Behavioral._11_Visitor.Computer;
import _3_Behavioral._11_Visitor.Part.Keyboard;
import _3_Behavioral._11_Visitor.Part.Monitor;
import _3_Behavioral._11_Visitor.Part.Mouse;

/**
 * Created by lkh25 on 2017-05-20.
 */

/**
 *  Visitor 인터페이스
 */
public interface ComputerPartVisitor
{
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
