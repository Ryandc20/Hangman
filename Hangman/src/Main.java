import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Main {
    public static int difficulty;
    public static String fileToString;
    public static void main(String args[]) {
        String option1;

        String quit = "no";

        logoG();
        Scanner in = new Scanner(System.in);
        while(quit == "no") {
            System.out.println("Choose an option from menu below\n1. Start new game from existing library\n2. Start game from personal library\n3. Create new Library\n4. Quit");
            option1 = in.nextLine();
            switch(option1) {
                case "1":

                    difficultyMenu();
                    readFileAsString();
                    Gameplay.maingame();
                    break;

                case "2":
                    System.out.println("You selected option 2");


                    Gameplay.maingame();
                    break;

                case "3": System.out.println("You selected option 3");
                    textFileCreater.main();
                    break;


                case "4": quit = "yes";
                break;
            }

        }



    }
    public static String readFileAsString() {
        String diffFile = "";
        if (difficulty == 1) {
            diffFile = "Src/easy.txt";
        } else if (difficulty == 2) {
            diffFile = "Src/normal.txt";
        } else if (difficulty == 3) {
            diffFile = "Src/hard.txt";
        } else if (difficulty == 5) {
            diffFile = "Src/CustomDictionary.txt";
        }

        try {
            FileReader fr = new FileReader(diffFile);
            BufferedReader br = new BufferedReader(fr);
            fileToString = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileToString;

    }
    public static void difficultyMenu(){

        Scanner in = new Scanner(System.in);
        System.out.println("What difficulty do u want to play\n1. Easy mode\n2. Normal mode\n3. Hard more");
        do {
            difficulty = 0;
            difficulty = in.nextInt();
            if (difficulty == 1) {
                System.out.println("You have selected easy mode");

            } else if (difficulty == 2) {
                System.out.println("You have selected normal mode");
            } else if (difficulty == 3) {
                System.out.println("You have selected hard mode");

            } else {
                System.out.println("That is not an option");

            }
        }while(difficulty < 1 || difficulty >4);


    }
    public static void logoG() {
        System.out.println("()    ()      ()()      ()     ()    ()))))      ()        ()      ()()        ()     ()");
        System.out.println("()    ()     ()  ()     ())    ()   ()    ()     ()))    ((()     ()  ()       ()))   ()");
        System.out.println("()(())()    ()(())()    ()  () ()   ()           ()  (())  ()    ()(())()      () ()  ()");
        System.out.println("()    ()    ()    ()    ()  (((()   ()  ((((     ()   ()   ()    ()    ()      ()   ((()");
        System.out.println("()    ()    ()    ()    ()     ()     ()))))     ()        ()    ()    ()      ()     ()");
    }

}











