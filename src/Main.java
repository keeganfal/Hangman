import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int livesRemaning = 4;

        RandomWordSelect randomWord = new RandomWordSelect();
        String word = randomWord.getWord();
        System.out.println(word);

        DisplayResult displayResult = new DisplayResult();


        ArrayList<String> createdWord = new ArrayList<>();
        for (int i = 0; i < word.length(); i++){
            createdWord.add("_");
        }
        System.out.println(createdWord);
        System.out.println("Lives remaining: " + livesRemaning);

        while (livesRemaning > 0){
            GatherInput gatherInput = new GatherInput();
            String currentInput = gatherInput.getInput();

            if(word.contains(currentInput)){
                System.out.println("You guessed correct!");
                for (int i = 0; i < word.length(); i++){
                    if (word.charAt(i) == currentInput.charAt(0)){
                        createdWord.set(i, Character.toString(word.charAt(i)));
                    }
                }
            }
            else{
                livesRemaning--;
            }
            System.out.println(createdWord);

            System.out.println("Lives remaining: " + livesRemaning);
            DisplayResult.generateHangman(livesRemaning);
            System.out.println();
        }
        System.out.println("GAME OVER");
    }
}