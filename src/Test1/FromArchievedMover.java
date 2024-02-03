package Test1;

import Test1.Book;
import Test1.BookMover;

public class FromArchievedMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case Status.AVAILABLE:
                super.moveToStatus(book, requestedStatus);
            default:
                System.out.println("Перевод книги из статуса 'ARCHIEVED' в статус " + requestedStatus + " невозможен");
        }
    }
}
