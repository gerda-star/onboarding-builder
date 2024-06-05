package computerProject.configurations;

import computerProject.Computer;
import computerProject.ComputerBuilder;

public class OfficeComputerBuilder implements ComputerBuilder {
    private String cpu;
    private String ram;
    private String graphicsCard;
    private String powerSupply;
    private String hardDisk;
    private String monitor;

    public OfficeComputerBuilder() {
        super();
    }

    @Override
    public ComputerBuilder addCPU() {
        System.out.println("... Assembling the CPU");
        this.cpu = "CPU for office work";
        return this;
    }

    @Override
    public ComputerBuilder addRAM() {
        System.out.println("... Assembling the RAM");
        this.ram = "RAM for office work";
        return this;
    }

    @Override
    public ComputerBuilder addGraphicsCard() {
        System.out.println("... Assembling the Graphics Card");
        this.graphicsCard = "Graphics Card for office work";
        return this;
    }

    @Override
    public ComputerBuilder addPowerSupply() {
        System.out.println("... Assembling the Power Supply");
        this.powerSupply = "Power Supply for office work";
        return this;
    }

    @Override
    public ComputerBuilder addHardDisk() {
        System.out.println("... Assembling the Hard Disk");
        this.hardDisk = "Hard Disk for office work";
        return this;
    }

    @Override
    public ComputerBuilder addMonitor() {
        System.out.println("... Assembling the Monitor");
        this.monitor = "Monitor for office work";
        return this;
    }

    @Override
    public Computer build() {
        Computer computer = new Computer(cpu, ram, graphicsCard, powerSupply, hardDisk, monitor);
        if (computer.doQualityCheck()) {
            System.out.println("Computer for office work is assembled!");
            return computer;
        } else {
            System.out.println("Computer assembly is incomplete!");
        }
        return null;
    }

}
