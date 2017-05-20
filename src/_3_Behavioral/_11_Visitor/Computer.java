package _3_Behavioral._11_Visitor;

import _3_Behavioral._11_Visitor.Part.ComputerPart;
import _3_Behavioral._11_Visitor.Part.Keyboard;
import _3_Behavioral._11_Visitor.Part.Monitor;
import _3_Behavioral._11_Visitor.Part.Mouse;
import _3_Behavioral._11_Visitor.Visitor.ComputerPartVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lkh25 on 2017-05-20.
 */
public class Computer implements ComputerPart
{
    private List<ComputerPart> computerParts;

    public Computer()
    {
        computerParts = new ArrayList<>();
        computerParts.add(new Mouse());
        computerParts.add(new Keyboard());
        computerParts.add(new Monitor());
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor)
    {
        for( ComputerPart computerPart : computerParts)
        {
            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
