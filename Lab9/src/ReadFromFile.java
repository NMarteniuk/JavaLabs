import java.io.*;
public class ReadFromFile implements Runnable{
    @Override
    public void run() {
        try {
            File file = new File("file.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
