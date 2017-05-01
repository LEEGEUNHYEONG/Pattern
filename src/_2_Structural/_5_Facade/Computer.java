package _2_Structural._5_Facade;

import _2_Structural._5_Facade.Hardware.Cpu;
import _2_Structural._5_Facade.Hardware.Disk;
import _2_Structural._5_Facade.Hardware.Memory;

/**
 * Created by LGH on 2017-05-01.
 */

/**
 *  Facade 패턴을 이용한 클래스
 *  Cpu, Disk, Memory 의 각 하위 시스템들의 동작을 통합한 메소드 들을 제공
 */
public class Computer
{
    private Cpu cpu;
    private Disk disk;
    private Memory memory;

    public Computer ()
    {
        cpu = new Cpu ();
        disk = new Disk ();
        memory = new Memory ();
    }

    /**
     *  cpu, disk, memory 각 시스템들의 시작을 호출하는 통합 메소드
     */
    public void booting()
    {
        cpu.start ();
        disk.readDisk ();
        memory.readMemory ();
    }

    /**
     *  cpu, disk, memory 각 시스템들의 종료를 호출하는 통합 메소드
     */
    public void terminate()
    {
        disk.saveDisk ();
        memory.clearMemory ();
        cpu.stop ();
    }
}
