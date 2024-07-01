package computerProject;

import computerProject.builders.IComputerBuilder;

public class ComputerDirector {

    private final IComputerBuilder builder;

    public ComputerDirector(IComputerBuilder builder) {
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("the builder is not specified");
        }
    }

    public Computer manufactureComputer() {
        return builder.addCPU()
                .addRAM()
                .addGraphicsCard()
                .addPowerSupply()
                .addHardDisk()
                .addMonitor()
                .addHeadphone()
                .addPrinter()
                .addStylus()
                .build();
    }
}
