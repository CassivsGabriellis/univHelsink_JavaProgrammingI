
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String entry = scanner.nextLine();
            
            if (entry.isEmpty()) {
                break;
            }
            
            String[] wordsToSplit = entry.split("\\s+");
            for (String word: wordsToSplit) {
                if(word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
        
    }
}
