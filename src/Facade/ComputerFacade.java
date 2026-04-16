package Facade;

 class ComputerFacade {

     private CPU cpu = new CPU();
     private Memory memory = new Memory();
     private Disk disk = new Disk();

     public void start() {
         cpu.freeze();
         memory.load();
         disk.read();
         cpu.execute();
     }
}
