package Strings;

public class PascalCaseSplitter {

    public static String razdeliPascalCase(String vhod) {
        // Разделяме входния низ на всяка главна буква, която следва малка буква
        String[] dumi = vhod.split("(?=[A-Z])");

        // Обединяваме думите със запетая и интервал и връщаме резултата
        return String.join(", ", dumi);
    }

    public static void main(String[] args) {
        // Примерен вход в PascalCase формат
        String vhod = "TovaEPrimerZaPascalCase";

        // Извеждаме резултата от разделянето
        System.out.println(razdeliPascalCase(vhod));
    }
}
