package computerProject;

public class Computer {
    private String cpu;
    private String ram;
    private String graphicsCard;
    private String powerSupply;
    private String hardDisk;
    private String monitor;

    public Computer(String cpu, String ram, String graphicsCard, String powerSupply, String hardDisk, String monitor) {
        this.cpu = cpu;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.powerSupply = powerSupply;
        this.hardDisk = hardDisk;
        this.monitor = monitor;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public boolean doQualityCheck() {
        return (cpu != null && !cpu.isEmpty())
                && (ram != null && !ram.isEmpty())
                && (powerSupply != null && !powerSupply.isEmpty());
    }

    @Override
    public String toString() {
        // StringBuilder class also uses Builder Design Pattern with implementation of java.lang.Appendable interface
        return "Computer specifications:\n CPU = " + cpu +
                ",\n RAM = " + ram +
                ",\n graphicsCard = " + graphicsCard +
                ",\n powerSupply = " + powerSupply +
                ",\n hardDisk = " + hardDisk +
                ",\n monitor = " + monitor;
    }
}
