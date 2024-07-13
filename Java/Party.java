import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;

public class Party {
    private LocalDateTime date;
    private Set<String> guests;

    public Party(LocalDateTime date) {
        this.date = date;
        this.guests = new HashSet<>();
    }

    public List<String> getGuests() {
        return new ArrayList<>(guests);
    }
}
