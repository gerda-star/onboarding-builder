package computerProject.builders;

import computerProject.Computer;


public class GamingComputerBuilder implements IComputerBuilder {

    private final Computer computer = new Computer();

    public GamingComputerBuilder() {
        super();
    }

    @Override
    public IComputerBuilder addCPU() {
        System.out.println("... Assembling the CPU");
        this.computer.setCpu("CPU for gaming");
        return this;
    }

    @Override
    public IComputerBuilder addRAM() {
        System.out.println("... Assembling the RAM");
        this.computer.setRam("RAM for gaming");
        return this;
    }

    @Override
    public IComputerBuilder addGraphicsCard() {
        System.out.println("... Assembling the Graphics Card");
        this.computer.setGraphicsCard("Graphics Card for gaming");
        return this;
    }

    @Override
    public IComputerBuilder addPowerSupply() {
        System.out.println("... Assembling the Power Supply");
        this.computer.setPowerSupply("Power Supply for gaming");
        return this;
    }

    @Override
    public IComputerBuilder addHardDisk() {
        System.out.println("... Assembling the Hard Disk");
        this.computer.setHardDisk("Hard Disk for gaming");
        return this;
    }

    @Override
    public IComputerBuilder addMonitor() {
        System.out.println("... Assembling the Monitor");
        this.computer.setMonitor("Monitor for gaming");
        return this;
    }

    @Override
    public IComputerBuilder addHeadphone() {
        System.out.println("... Assembling the Headphone");
        this.computer.setHeadphone("Headphone for gaming");
        return this;
    }

    @Override
    public IComputerBuilder addPrinter() {
        return this;
    }

    @Override
    public IComputerBuilder addStylus() {
        return this;
    }

    @Override
    public Computer build() {
        if (computer.doQualityCheck()) {
            System.out.println("Computer for gaming is assembled!");
            return computer;
        } else {
            System.out.println("Computer assembly is incomplete!");
        }
        return null;
    }

}
