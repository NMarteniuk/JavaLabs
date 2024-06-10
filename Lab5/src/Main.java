import java.io.FileInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Вкажіть ім'я файлу як аргумент командного рядка.");
            return;
        }
        String fileName = args[0];
        String longestWord = "";
        int count = 0;
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             Scanner scanner = new Scanner(fileInputStream)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
                if (word.equals(longestWord)) {
                    count++;
                }
            }
        }
        System.out.println("Найдовше слово: " + longestWord);
        System.out.println("Кількість входжень: " + count);
    }
}