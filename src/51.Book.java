class Book {
    static int totalBooks;
    String title;
    String author;
    int isbn;
    boolean IsBorrowed;

    static {
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    Book(String title, String author, int isbn) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }

    Book(int isbn) {
        this("unknown", "unknown", isbn);

    }

     static int  getTotalBooks() {
        return totalBooks;
    }

    void borrowBooks() {
        if (IsBorrowed) {
            System.out.println("book is already borrowed");
        } else {
            this.IsBorrowed = true;
            System.out.println("enjoy " + this.title);
        }
    }

     void returnBooks() {
        if (IsBorrowed) {
            this.IsBorrowed = false;
            System.out.println("please give us a review");
        } else {
            System.out.println("book is already available");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("design", "ismailBhai", 1);
        Book myBook = new Book(2);
        System.out.println(Book.getTotalBooks());
        designOfThings.borrowBooks();
        myBook.borrowBooks();
        designOfThings.borrowBooks();
        designOfThings.returnBooks();
        designOfThings.returnBooks();

    }

}
