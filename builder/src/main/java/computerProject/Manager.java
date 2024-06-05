package computerProject;

import computerProject.configurations.GamingComputerBuilder;
import computerProject.configurations.MultimediaComputerBuilder;
import computerProject.configurations.OfficeComputerBuilder;

import java.util.Scanner;

public class Manager {

    private ComputerBuilder builder;

    public Manager() {
    }

    public ComputerBuilder selectConfiguration() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input configuration (Gaming, Office, Multimedia)");
        String configuration = in.nextLine().toLowerCase();
        in.close();
        return setTheBuilder(configuration);
    }

    public ComputerBuilder setTheBuilder(String configuration) {
        switch (configuration) {
            case "gaming":
                System.out.println("==== Your choice: Gaming Computer ====");
                builder = new GamingComputerBuilder();
                break;
            case "office":
                System.out.println("==== Your choice: Office Computer ====");
                builder = new OfficeComputerBuilder();
                break;
            case "multimedia":
                System.out.println("==== Your choice: Multimedia Computer ====");
                builder = new MultimediaComputerBuilder();
                break;
            default:
                System.out.println("!!! The selected configuration is missing !!!");
        }
        return builder;
    }

}
