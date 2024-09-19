package model;

public class Utils {

    public static boolean isOnlyNumbers(String str) {
        return str.matches("[0-9]+");
    }

    public static boolean isOnlyLetters(String str) {
        return str.matches("[a-zA-Z]+");
    }

    public static boolean isValidEmail(String email) {
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
    }

    // MM/DD/YYYY
    public static boolean isValidBirthDate(String date) {
        String[] dateParts = date.split("/");
        if (dateParts.length != 3) {
            return false;
        }
        if (dateParts[0].length() == 0 || dateParts[1].length() == 0 || dateParts[2].length() == 0) {
            return false;
        }
        if (!Utils.isOnlyNumbers(dateParts[0]) || !Utils.isOnlyNumbers(dateParts[1]) || !Utils.isOnlyNumbers(dateParts[2])) {
            return false;
        }

        int month = 1;
        int day = 1;
        int year = 1900;
        try {
            month = Integer.parseInt(dateParts[0]);
            day = Integer.parseInt(dateParts[1]);
            year = Integer.parseInt(dateParts[2]);
        } catch (NumberFormatException e) {
            return false;
        }
        
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month < 1 || month > 12) {
            return false;
        }
        if (year < 1900 || year > 2025) {
            return false;
        }
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            daysInMonth[1] = 29;
        }
        if (day < 1 || day > daysInMonth[month - 1]) {
            return false;
        }
        return true;
    }

}
