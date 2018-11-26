import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class textFileCreater {
    private static String text = "";
    private static String[] list;

    public static void main(){
        System.out.println("Enter one word per input of line then enter quit when you want to exit");

        Scanner scan = new Scanner(System.in);
        list = new String[100];
        int numOfWords = 0;
        while(!text.equals("quit")) {
            System.out.print("Enter Word: ");
            text = scan.nextLine();
            list[numOfWords] = text;
            numOfWords++;

        }



        FileWriter fWriter = null;
        BufferedWriter writer = null;
        try {
            fWriter = new FileWriter("Src/CustomDictionary.txt");
            writer = new BufferedWriter(fWriter);
            for(int i = 0; i < numOfWords - 1; i++) {
                writer.write(list[i] + " ");
            }
            writer.newLine();
            writer.close();
            System.err.println("Your input was saved.");
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }

}