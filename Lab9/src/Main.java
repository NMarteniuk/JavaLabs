import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть слова:");
        String input = scanner.nextLine();

        Thread writeThread = new Thread(new WriteToFile(input));
        Thread readThread = new Thread(new ReadFromFile());

        writeThread.start();

        try {
            writeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        readThread.start();
    }
}