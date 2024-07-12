public class BookBorrower {
    private static BookSingleton borrowedBook;
    private boolean haveBook = false;
    public  void borrowBook() {
        borrowedBook = BookSingleton.borrowBook();
        if (borrowedBook != null) {
            haveBook = true;
        } else {
            haveBook = false;
        }
    }
    public String getAuthorAndTitle() {
        if(haveBook && borrowedBook != null) {
            return borrowedBook.getAuthorAndTitle();
        }
        return "I don't have the book";
    }

    public void returnBook(){
        if (borrowedBook != null) {
            borrowedBook.returnBook(borrowedBook);
            haveBook = false;
        }
    }
}
