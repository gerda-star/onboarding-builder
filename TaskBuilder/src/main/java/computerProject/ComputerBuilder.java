package computerProject;

public interface ComputerBuilder {

    public ComputerBuilder addCPU();

    public ComputerBuilder addRAM();

    public ComputerBuilder addGraphicsCard();

    public ComputerBuilder addPowerSupply();

    public ComputerBuilder addHardDisk();

    public ComputerBuilder addMonitor();

    public ComputerBuilder addHeadphone();

    public ComputerBuilder addPrinter();

    public ComputerBuilder addStylus();

    public Computer build();

}
