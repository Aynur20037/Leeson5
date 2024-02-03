package Test1;

import Test1.Book;

public class BookMover {
    public void moveToStatus(Book book, Status requestedStatus) {
        System.out.println(" Moving status...");
        book.setStatus(requestedStatus);

    }
}
