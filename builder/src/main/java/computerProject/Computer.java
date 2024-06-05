package computerProject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Computer {
    private String cpu;
    private String ram;
    private String graphicsCard;
    private String powerSupply;
    private String hardDisk;
    private String monitor;
    //for gaming and multimedia
    private String headphone;
    //for office
    private String printer;
    // for multimedia
    private String stylus;


    public Computer(String cpu, String ram, String graphicsCard, String powerSupply, String hardDisk, String monitor, String headphone, String printer, String stylus) {
        this.cpu = cpu;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.powerSupply = powerSupply;
        this.hardDisk = hardDisk;
        this.monitor = monitor;
        this.headphone = headphone;
        this.printer = printer;
        this.stylus = stylus;
    }

    public boolean doQualityCheck() {
        return (cpu != null && !cpu.isEmpty())
                && (ram != null && !ram.isEmpty())
                && (powerSupply != null && !powerSupply.isEmpty());
    }

    @Override
    public String toString() {
        return "=====================" +
                "\nComputer specifications:" +
                "\n CPU = " + cpu +
                ",\n RAM = " + ram +
                ",\n graphicsCard = " + graphicsCard +
                ",\n powerSupply = " + powerSupply +
                ",\n hardDisk = " + hardDisk +
                ",\n monitor = " + monitor+
                ",\n headphone = " + headphone+
                ",\n printer = " + printer+
                ",\n stylus = " + stylus;
    }
}
