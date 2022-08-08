import java.util.Scanner;

public class GatherInput {

    public String getInput() {

        System.out.println("INPUT: ");
        Scanner scanner = new Scanner( System.in );
        return scanner.nextLine();
    }
}
