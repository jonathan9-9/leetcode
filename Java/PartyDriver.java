import java.time.LocalDateTime;

public class PartyDriver {
    public static void main(String[] args) {
        Party party = new Party(LocalDateTime.of(2024, 07, 10, 17, 9, 45));

        System.out.println("Add guest Mark: " + party.addGuest("Mark"));
        System.out.println("Add Liz: " + party.addGuest("Liz"));
        System.out.println("Add Oliver: " + party.addGuest("Oliver"));
        System.out.println("Add Oliver: " + party.addGuest("Yvette"));
        System.out.println("Add Oliver: " + party.addGuest("Olivia"));
        System.out.println("Add Oliver: " + party.addGuest("May"));

        System.out.println("\n Party Information:");
        party.showPartyInformation();

        System.out.println("I will add a duplicate guest [Liz]: " + party.addGuest("Liz"));

        System.out.println("Removing a guest [Mark]: " + party.removeGuest("Mark"));

        System.out.println("Remove a guest that is not present on the list [Jay]: " + party.removeGuest("Jay"));

        System.out.println("Has the party occurred? " + party.didPartyOccur());
    }

}
