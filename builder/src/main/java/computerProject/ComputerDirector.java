package computerProject;

public class ComputerDirector {

    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
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
