public class PangramChecker {

    static final int TOTAL_NUM_OF_ALPHABETS = 26;

    public boolean isPangram(String input) {
        boolean result = false;
        if (input != "") {
            result = input.toUpperCase().chars()
                          .filter(chars -> chars >= 'A' && chars <= 'Z')
                          .distinct().count() == TOTAL_NUM_OF_ALPHABETS;
        }
        return result;
    }
}
