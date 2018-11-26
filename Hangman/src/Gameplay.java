import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;
public class Gameplay {
    private static String thing = Main.fileToString;
    private static String[] words = thing.split(" ");

    private static String word = words[(int) (Math.random() * words.length)];
    private static String wordGuess = new String(new char[word.length()]).replace("\0", "*");
    private static int guessCount = 8;
    private static String[] splitWord = word.split("");
    private static String[] splitGuess = wordGuess.split("");
    private static boolean guessCountChanger = true;


    public static void maingame() {
        thing = Main.fileToString;
        String[] words = thing.split(" ");
        word = words[(int) (Math.random() * words.length)];
        words = thing.split(" ");
        wordGuess = new String(new char[word.length()]).replace("\0", "*");
        guessCount = 8;
        splitWord = word.split("");
        splitGuess = wordGuess.split("");
        guessCountChanger = true;

        Scanner sc = new Scanner(System.in);

        while (guessCount > 0 && wordGuess.contains("*")) {

            System.out.println("You have " +  guessCount + " guesses remaining");
            System.out.println("Guess any letter in this word: " + Arrays.toString(splitGuess));

            String guess = sc.next();

            for(int i = 0; i < word.length(); i++) {
                if(guess.equals(splitWord[i])) {
                    splitGuess[i] = guess;

                    guessCountChanger = false;
                }

            }
            if (guessCountChanger == true){
                guessCount--;
            }

            wordGuess = Arrays.toString(splitGuess);

            guessCountChanger = true;
        }
        System.out.println(wordGuess);
        if (wordGuess.contains("*")){

            System.out.println("You did not win");
        }
        else {
            System.out.println("you won");
        }


    }
}

