public class Book {

    private static final int LONG_BOOK_PAGE_NUMBER = 1000;

    private String bookTitle;
    private String author;
    private int numPages;

    public Book(String bookTitle, String author, int numPages) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.numPages = numPages;
    }

    public void setTitle(String titleOfBook) {
        bookTitle = titleOfBook;
    }

    public void setAuthor(String authorName) {
        author = authorName;
    }

    public void setNumPages(int numBookPages) {
        if (numBookPages < 0) {
            throw new IllegalArgumentException("Only positive numbers are allowed; no letters or symbols allowed.");
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

    public int countAuthors(String strOfAuthors) {
        int count = 0;

        String[] listAuthors = strOfAuthors.split("&");
        for (int i = 0; i < listAuthors.length; i++) {
            if (listAuthors[i] != null) {
                count++;
            }
        }
        return count;
    }

    public boolean isBookLong() {
        return isBookLong(LONG_BOOK_PAGE_NUMBER);
    }

    public String toString() {
        return "The book of " + getBookTitle() + " written by " + getBookAuthors()
                + " is about a tale of when the land of Europe came to ruin after a major battle between two kings"
                + " fighting for power and sovereignty. This battle was ongoing for decades until one power united and killed thousands of people and severely damaged infrastructure";
    }

}
