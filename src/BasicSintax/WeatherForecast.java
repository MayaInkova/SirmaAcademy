package BasicSintax;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // Четене на име на град (String)
        System.out.print("Въведете град: ");
        String city = scanner.nextLine();

        // Четене на температура в градуси (int)
        System.out.print("Въведете температура в градуси: ");
        int degrees = scanner.nextInt();

        // Отпечатване на съобщението във форматиран вид
        System.out.println("Today in " + city + " it is " + degrees + " degrees.");
    }
}
