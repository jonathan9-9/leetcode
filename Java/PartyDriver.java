import java.time.LocalDateTime;

public class PartyDriver {
    public static void main(String[] args) {
        Party party = new Party(LocalDateTime.of(2024, 07, 10, 17, 9, 45));

        System.out.println("Add guest Mark: " + party.addGuest("Mark"));
    }
}
