import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int minus = 0;

        RandomWordSelect randomWord = new RandomWordSelect();
        String word = randomWord.getWord();
        System.out.println(word);

        ArrayList<String> createdWord = new ArrayList<>();
        for (int i = 0; i < word.length(); i++){
            createdWord.add("_");
        }
        System.out.println(createdWord);

        while (minus < 4){

            GatherInput gatherInput = new GatherInput();

            String currentInput = gatherInput.getInput();

            if(word.contains(currentInput)){
                System.out.println("Yes");
                for (int i = 0; i < word.length(); i++){
                    if (word.charAt(i) == currentInput.charAt(0)){
                        createdWord.set(i, Character.toString(word.charAt(i)));
                    }
                }
            }
            else{
                minus++;
                System.out.println("minus+1");
            }
            System.out.println(createdWord);
        }
    }
}