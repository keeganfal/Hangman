public class DisplayResult {

    public static void generateHangman(int livesRemaining){
        if(livesRemaining == 4){
            System.out.println("    _______");
            System.out.println("    |      ");
            System.out.println("    |      ");
            System.out.println("    |      ");
            System.out.println("    |      ");
            System.out.println("    |      ");
            System.out.println("    |      ");
            System.out.println("____|____");
        }
        else if (livesRemaining == 3){
            System.out.println("    _______ ");
            System.out.println("    |      |");
            System.out.println("    |      O");
            System.out.println("    |      ");
            System.out.println("    |      ");
            System.out.println("    |      ");
            System.out.println("    |      ");
            System.out.println("____|____");
        }
        else if (livesRemaining == 2){
            System.out.println("    _______ ");
            System.out.println("    |      |");
            System.out.println("    |      O");
            System.out.println("    |      |");
            System.out.println("    |     / \\");
            System.out.println("    |      ");
            System.out.println("    |      ");
            System.out.println("____|____");
        }
        else if (livesRemaining == 1){
            System.out.println("    _______ ");
            System.out.println("    |      |");
            System.out.println("    |      O");
            System.out.println("    |      |");
            System.out.println("    |     / \\");
            System.out.println("    |      |");
            System.out.println("    |       ");
            System.out.println("____|____");
        }
        else if (livesRemaining == 0){
            System.out.println("    _______ ");
            System.out.println("    |      |");
            System.out.println("    |      O");
            System.out.println("    |      |");
            System.out.println("    |     / \\");
            System.out.println("    |      |");
            System.out.println("    |     / \\");
            System.out.println("____|____");
            System.out.println();
            System.out.println("GAME OVER");
        }
    }
}
