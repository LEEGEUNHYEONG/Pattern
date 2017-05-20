package _3_Behavioral._11_Visitor;

import _3_Behavioral._11_Visitor.Part.ComputerPart;
import _3_Behavioral._11_Visitor.Visitor.ComputerPartBootVisitor;
import _3_Behavioral._11_Visitor.Visitor.ComputerPartDisplayVisitor;

/**
 * Created by LGH on 2017-05-19.
 */
public class VisitorMain
{
    public VisitorMain()
    {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartBootVisitor());
        System.out.println();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
