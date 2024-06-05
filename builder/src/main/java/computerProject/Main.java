package computerProject;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager();
        ComputerBuilder builder = manager.selectConfiguration();
        ComputerDirector director = new ComputerDirector(builder);
        Computer computer = director.manufactureComputer();
        System.out.println(computer);
    }
}
