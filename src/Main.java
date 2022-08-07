public class Main {
    public static void main(String[] args) {



        System.out.println("INPUT: ");
        GatherInput gatherInput = new GatherInput();
        System.out.println(gatherInput.getInput());

        RandomWordSelect randomWord = new RandomWordSelect();
        System.out.println(randomWord.getWord());
    }
}