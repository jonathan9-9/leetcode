import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Book book1 = new Book(null, null, 0);
        Book book2 = new Book(null, null, 0);
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book title #one: ");
        String userBookTitle1 = scanner.nextLine();

        System.out.println("Enter author(s) of book #one: ");
        String userBookAuthor1 = scanner.nextLine();

        System.out.println("Enter number of pages of book #one: ");
        int numPagesBook1 = Integer.parseInt(scanner.nextLine());

        System.out.println(book1.isBookLong(numPagesBook1));

        book1.setTitle(userBookTitle1);
        book1.setAuthor(userBookAuthor1);

        System.out.println(book1.toString());

        System.out.println("Enter author(s) of book #two: ");
        String userBookAuthor2 = scanner.nextLine();
        book2.setAuthor(userBookAuthor2);
        int numAuthors = book2.countAuthors(userBookAuthor2);
        System.out.println("Book #two author count: " + numAuthors);

    }
}
