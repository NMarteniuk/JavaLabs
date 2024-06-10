import java.util.Scanner;

public class RemoveVowels
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введiть речення: ");
        String s = scanner.nextLine();
        String result = s.replaceAll("[аеєиіїоуюяАЕЄИІЇОУЮЯ]", "");
        System.out.println("Речення після видалення голосних літер:");
        System.out.println(result);
        System.out.println("Доповнення до лабораторної роботи:");
        removeFileExtension();
    }
    public static void removeFileExtension()
    {
        String filePath = "C:\\Users\\Nazar\\Documents\\lab3.java";
        int lastDoubleLineIndex = filePath.lastIndexOf('\\');
        int dotIndex = filePath.lastIndexOf('.');
        String name = filePath.substring(lastDoubleLineIndex + 1, dotIndex);
        String extension = filePath.substring(dotIndex + 1);

        System.out.println("Ім'я файлу: " + name);
        System.out.println("Розширення файлу: " + extension);
    }
}
