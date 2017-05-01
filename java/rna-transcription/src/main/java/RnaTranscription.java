import java.util.HashMap;
import java.util.Map;

public class RnaTranscription {

    private static final Map<String, String> TRANSCRIPTION;

    static {
        TRANSCRIPTION = new HashMap<>();
        TRANSCRIPTION.put("C", "G");
        TRANSCRIPTION.put("G", "C");
        TRANSCRIPTION.put("T", "A");
        TRANSCRIPTION.put("A", "U");

    }

    public String ofDna(String dnaString) {
        return dnaString.equals("") ? "" : TRANSCRIPTION.get(dnaString);
    }

}