package _2_Structural._3_Composite;

/**
 * Created by LGH on 2017-04-28.
 */
public class CompositeMain
{
    public CompositeMain ()
    {
        //  폴더 생성
        Folder root = new Folder("root");
        Folder main = new Folder("main");
        Folder home = new Folder("home");

        //  파일 생성
        File intelliJ = new File("IntelliJ");

        File wow = new File("wow");
        File lol = new File("lol");

        //  home 폴더에 파일들을 추가
        home.addComponent (wow);
        home.addComponent (lol);

        //  main 폴더에 home 폴더와 intelliJ 파일을 추가
        main.addComponent (intelliJ);
        main.addComponent (home);

        //  root 폴더에 main 폴더를 추가
        root.addComponent (main);

        print(root);
    }

    private void print(Component component)
    {
        //  현재 component 의 출력 ( 폴더, 파일 상관 없음 )
        System.out.println(component.getClass ().getName () + " : " + component.getName ());

        if(component instanceof Folder)
        {
            //  현재 component 가 Folder 인 경우 폴더내에 존재하는 component 들을 출력
            for(Component c : ((Folder)component).getChild ())
            {
                print(c);
            }
        }
    }
}
