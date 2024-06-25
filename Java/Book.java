public class Book {

    private String bookTitle;
    private String author;
    private int numPages;

    public Book(String bookTitle, String author, int numPages) {
        bookTitle = "The Lost Land of the Future";
        author = "Sam & Jin & Mark";
        numPages = 724;
    }

    public void setTitle(String titleOfBook) {
        bookTitle = titleOfBook;
    }

    public void setAuthor(String authorName) {
        author = authorName;
    }

    public void setNumPages(int numBookPages) {
        if (numBookPages < 0) {
            throw new IllegalArgumentException("Only numbers are allowed; no letters or symbols allowed.");
        } else {
            numPages = numBookPages;
        }
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthors() {
        return author;
    }

    public int getBookNumPages() {
        return numPages;
    }

    public boolean isBookLong(int numPages) {
        boolean isCurrentBookLong = false;
        if (numPages > 750) {
            isCurrentBookLong = true;
        } else {
            return isCurrentBookLong;
        }
        return isCurrentBookLong;
    }

    public String toString(String str) {
        return "The book of " + getBookTitle() + " written by " + getBookAuthors()
                + " is about a tale of when the land of Europe came to ruin after a major battle between two kings "
                + " fighting for power and sovereignty. This battle was ongoing for decades until one power united and killed thousands of people and severely damages infrastructure";
    }

}
