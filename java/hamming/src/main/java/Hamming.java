import java.util.stream.IntStream;

public class Hamming {

    private String firstStrand;
    private String secondStrand;

    public Hamming(String firstStrand, String secondStrand) {
        this.firstStrand = firstStrand;
        this.secondStrand = secondStrand;
        validateInput();
    }

    public int getHammingDistance() {
        return Math.toIntExact(
                IntStream.range(0, firstStrand.length())
                        .filter(index -> firstStrand.charAt(index) != secondStrand.charAt(index))
                        .count());
    }

    private void validateInput() {
        if (firstStrand.length() != secondStrand.length()) throw new IllegalArgumentException();
    }

}
