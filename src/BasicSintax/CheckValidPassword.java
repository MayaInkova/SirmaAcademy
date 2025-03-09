package BasicSintax;

public class CheckValidPassword {
    public static void main(String[] args) {
        System.out.println(isValidPassword("Abc123!"));       // false (липсва спец. символ)
        System.out.println(isValidPassword("Strong@Pass1")); // true (валидна парола)
        System.out.println(isValidPassword("weakpass"));      // false (няма цифра, главна буква и спец. символ)
        System.out.println(isValidPassword("Hello1234"));     // false (липсва спец. символ)
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false; // Дължината е под 8 символа
        }

        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        String specialCharacters = "!@#$%^&*()";

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (specialCharacters.contains(String.valueOf(ch))) {
                hasSpecialChar = true;
            }
        }

        return hasUpperCase && hasDigit && hasSpecialChar;
    }
}


