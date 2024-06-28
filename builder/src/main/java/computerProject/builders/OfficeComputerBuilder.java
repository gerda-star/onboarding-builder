package computerProject.builders;

import computerProject.Computer;

public class OfficeComputerBuilder implements IComputerBuilder {


    private final Computer computer = new Computer();

    public OfficeComputerBuilder() {
        super();
    }

    @Override
    public IComputerBuilder addCPU() {
        System.out.println("... Assembling the CPU");
        this.computer.setCpu("CPU for office work");
        return this;
    }

    @Override
    public IComputerBuilder addRAM() {
        System.out.println("... Assembling the RAM");
        this.computer.setRam("RAM for office work");
        return this;
    }

    @Override
    public IComputerBuilder addGraphicsCard() {
        System.out.println("... Assembling the Graphics Card");
        this.computer.setGraphicsCard("Graphics Card for office work");
        return this;
    }

    @Override
    public IComputerBuilder addPowerSupply() {
        System.out.println("... Assembling the Power Supply");
        this.computer.setPowerSupply("Power Supply for office work");
        return this;
    }

    @Override
    public IComputerBuilder addHardDisk() {
        System.out.println("... Assembling the Hard Disk");
        this.computer.setHardDisk("Hard Disk for office work");
        return this;
    }

    @Override
    public IComputerBuilder addMonitor() {
        System.out.println("... Assembling the Monitor");
        this.computer.setMonitor("Monitor for office work");
        return this;
    }

    @Override
    public IComputerBuilder addHeadphone() {
        return this;
    }

    @Override
    public IComputerBuilder addPrinter() {
        System.out.println("... Assembling the Printer");
        this.computer.setPrinter("Printer for office work");
        return this;
    }

    @Override
    public IComputerBuilder addStylus() {
        return this;
    }

    @Override
    public Computer build() {
        if (computer.doQualityCheck()) {
            System.out.println("Computer for office work is assembled! ");
            return computer;
        } else {
            System.out.println("Computer assembly is incomplete!");
        }
        return null;
    }

}
