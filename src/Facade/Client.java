package Facade;

public class Client {
    void main() {
        /*
        CPU cpu = new CPU();
        Memory memory = new Memory();
        Disk disk = new Disk();

        cpu.freeze();
        memory.load();
        disk.read();
        cpu.execute();
        */

         /* 👉 Problems:

            Client must know internal steps
            Tight coupling to subsystem
            Hard to change internal

          */

        ComputerFacade computer = new ComputerFacade();
        computer.start();
        /*✅ 1. Hides Complexity

        Client doesn’t care about internal workflow

        ✅ 2. Reduces Coupling

        ✅ 3. Improves Maintainability    */


      /*  ⚠️ When NOT to Use
        If system is already simple
        If you need fine-grained control
       */
    }


}
