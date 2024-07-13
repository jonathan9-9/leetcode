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

    public int amountGuests() {
        return guests.size();
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

    public boolean containsGuest(String guest) {
        return guests.contains(guest);
    }

    public void showGuestList() {
        Iterator<String> iterator = guests.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void showPartInformation() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy 'at' hh:mm a");
        String newDate = date.format(formatter);
        System.out.println("Date and time of party: " + newDate);
        System.out.println("Guest List:");
        showGuestList();
    }

    public boolean didPartyOccur() {
        return LocalDateTime.now().isAfter(date);
    }
}
