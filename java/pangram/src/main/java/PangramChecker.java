public class PangramChecker {

    public boolean isPangram(String input) {
        boolean result = false;
        if (input != "") {
            result = input.toUpperCase().chars()
                          .filter(chars -> chars >= 'A' && chars <= 'Z')
                          .distinct().count() == 26;
        }
        return result;
    }
}
