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
    }
}
