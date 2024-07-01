package computerProject;

import computerProject.builders.GamingComputerBuilder;
import computerProject.builders.IComputerBuilder;
import computerProject.builders.MultimediaComputerBuilder;
import computerProject.builders.OfficeComputerBuilder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        IComputerBuilder builder = selectConfiguration();
        ComputerDirector director = new ComputerDirector(builder);
        Computer computer = director.manufactureComputer();
        System.out.println(computer);
    }

    public static IComputerBuilder selectConfiguration() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input configuration (Gaming, Office, Multimedia)");
        String configuration = in.nextLine().toLowerCase();
        in.close();
        return setTheBuilder(configuration);
    }

    public static IComputerBuilder setTheBuilder(String configuration) {
        switch (configuration) {
            case "gaming":
                System.out.println("==== Your choice: Gaming Computer ====");
                return new GamingComputerBuilder();
            case "office":
                System.out.println("==== Your choice: Office Computer ====");
                return new OfficeComputerBuilder();
            case "multimedia":
                System.out.println("==== Your choice: Multimedia Computer ====");
                return new MultimediaComputerBuilder();
            default:
                System.out.println("!!! The selected configuration is missing !!!");
                return null;
        }

    }
}
