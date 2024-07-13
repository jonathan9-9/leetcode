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

    public LocalDateTime getDate() {
        return date;
    }

    public boolean addGuest(String guest) {
        return guests.add(guest);
    }

    public boolean removeGuest(String guest) {
        Iterator<String> iterator = guests.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(guest)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
