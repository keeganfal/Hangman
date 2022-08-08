public class Main {
    public static void main(String[] args) {

        int minus = 0;

        RandomWordSelect randomWord = new RandomWordSelect();
        String word = randomWord.getWord();
        System.out.println(word);

        for (int i = 0; i < word.length(); i++){
            System.out.print(" _ ");
        }

        while (minus < 4){

            GatherInput gatherInput = new GatherInput();

            String currentInput = gatherInput.getInput();

            if(word.contains(currentInput)){
                System.out.println("Yes");
                for (int i = 0; i < word.length(); i++){
                    if (word.charAt(i) == currentInput.charAt(0)){
                        System.out.print(word.charAt(i));
                    }
                    else {
                        System.out.print(" _ ");
                    }
                }
            }
            else{
                minus++;
                System.out.println("minus+1");
            }
        }


    }
}