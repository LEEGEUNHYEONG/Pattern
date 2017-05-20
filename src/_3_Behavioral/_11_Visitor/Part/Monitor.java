package _3_Behavioral._11_Visitor.Part;

import _3_Behavioral._11_Visitor.Visitor.ComputerPartVisitor;

/**
 * Created by lkh25 on 2017-05-20.
 */

/**
 *  Concrete Element 클래스
 */
public class Monitor implements ComputerPart
{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor)
    {
        computerPartVisitor.visit(this);
    }
}
