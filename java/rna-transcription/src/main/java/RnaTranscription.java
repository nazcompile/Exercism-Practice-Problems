import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RnaTranscription {

    private static final Map<String, String> TRANSCRIPTION;

    static {
        TRANSCRIPTION = new HashMap<>();
        TRANSCRIPTION.put("C", "G");
        TRANSCRIPTION.put("G", "C");
        TRANSCRIPTION.put("T", "A");
        TRANSCRIPTION.put("A", "U");
        TRANSCRIPTION.put("", "");
    }

    public String ofDna(String dnaString) {
        return Stream.of(dnaString.split(""))
                     .map(val -> TRANSCRIPTION.get(val))
                     .collect(Collectors.joining());
    }

}