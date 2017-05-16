import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalUnit;

public class Gigasecond<T> {

    private LocalDateTime date;

    public Gigasecond(LocalDate date) {
        this.date = date.atTime(0, 0);
    }

    public Gigasecond(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getDate() {
        return date.plusSeconds(100_000_0000);
    }
}
