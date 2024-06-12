import java.io.*;
public class WriteToFile implements Runnable {
    private String text;

    public WriteToFile(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
