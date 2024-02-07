class Book 
{
    // Variables to store book information
    int bookId;
    String title;
    String authorName;
    double price;

    // Constructor to initialize book details
    public Book(int bookId, String title, String authorName, double price) {
        this.bookId = bookId;
        this.title = title;
        this.authorName = authorName;
        this.price = price;
    }

    // Method to print book details based on availability
    public void printBookDetails(boolean available) {
        if (available) {
            System.out.println("Book Details (Book ID: " + bookId + "):");
            System.out.println("Title: " + title);
            System.out.println("Author: " + authorName);
            System.out.println("Price: rup" + price);
        } else {
            System.out.println("Book with Book ID " + bookId + " is not available.");
        }
    }

    public static void main(String[] args) {
        // Create a Book object and assign values
        Book myBook = new Book(123, "The Great Gatsby", "F. Scott Fitzgerald", 150);

        // Check if the book is available
        boolean isBookAvailable = true;

        // Print book details based on availability
        myBook.printBookDetails(isBookAvailable);
    }
}
