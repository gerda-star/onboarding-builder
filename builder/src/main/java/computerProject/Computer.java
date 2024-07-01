package computerProject;

import lombok.Getter;
import lombok.Setter;

/**
 * Класс конечного продукта
 */
@Getter
@Setter
public class Computer {
    /**
     * Поле процессор - обязательное
     */
    private String cpu;
    /**
     * Поле оперативная память - обязательное
     */
    private String ram;
    /**
     * Поле видеокарта
     */
    private String graphicsCard;
    /**
     * Поле блок питания - обязательное
     */
    private String powerSupply;
    /**
     * Поле жесткий диск
     */
    private String hardDisk;
    /**
     * Поле монитор
     */
    private String monitor;
    /**
     * Поле гарнитура - только для игрового компьютера, компьютера для работы с мультимедиа
     */
    private String headphone;
    /**
     * Поле принтер - только для офисного компьютера
     */
    private String printer;
    /**
     * Поле стилус - только для компьютера для работы с мультимедиа
     */
    private String stylus;

    public Computer() {
    }

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
                ",\n monitor = " + monitor +
                ",\n headphone = " + headphone +
                ",\n printer = " + printer +
                ",\n stylus = " + stylus;
    }
}
