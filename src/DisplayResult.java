public class DisplayResult {

    public static void generateHangman(int livesRemaining){
        if(livesRemaining == 4){
            System.out.println("    _______ \n");
            System.out.println("    |      \n");
            System.out.println("    |      \n");
            System.out.println("    |      \n");
            System.out.println("    |      \n");
            System.out.println("    |      \n");
            System.out.println("    |      \n");
            System.out.println("____|____\n");
        }
        else if (livesRemaining == 3){
            System.out.println("    _______ \n");
            System.out.println("    |      |\n");
            System.out.println("    |      |\n");
            System.out.println("    |      O\n");
            System.out.println("    |      \n");
            System.out.println("    |      \n");
            System.out.println("    |      \n");
            System.out.println("____|____\n");
        }
        else if (livesRemaining == 2){
            System.out.println("    _______ \n");
            System.out.println("    |      |\n");
            System.out.println("    |      |\n");
            System.out.println("    |      O\n");
            System.out.println("    |      |\n");
            System.out.println("    |     / \n");
            System.out.println("    |      \n");
            System.out.println("____|____\n");
        }
    }
}
