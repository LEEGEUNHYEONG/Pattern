package _3_Behavioral._7_Observer;

/**
 * Created by LGH on 2017-01-20.
 */

/**
 *  옵저버가 수행할 업데이트 기능에 대한 인터페이스 정의
 */
public interface Observer
{
    /**
     *  update 동작 수행
     * @param title update 동작에 대한 결과 문자열을 반환
     */
    public void update(String title);
}
