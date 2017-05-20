package _3_Behavioral._11_Visitor.Part;

import _3_Behavioral._11_Visitor.Visitor.ComputerPartVisitor;

/**
 * Created by lkh25 on 2017-05-20.
 */

/**
 *  Element 인터페이스
 */
public interface ComputerPart
{
    public void accept(ComputerPartVisitor computerPartVisitor);
}
