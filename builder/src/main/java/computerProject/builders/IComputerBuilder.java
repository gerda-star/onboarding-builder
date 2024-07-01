package computerProject.builders;

import computerProject.Computer;

public interface IComputerBuilder {


    IComputerBuilder addCPU();

    IComputerBuilder addRAM();

    IComputerBuilder addGraphicsCard();

    IComputerBuilder addPowerSupply();

    IComputerBuilder addHardDisk();

    IComputerBuilder addMonitor();

    IComputerBuilder addHeadphone();

    IComputerBuilder addPrinter();

    IComputerBuilder addStylus();

    Computer build();

}
