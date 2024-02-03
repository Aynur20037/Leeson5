package Test1;

import Test1.Book;
import Test1.BookMover;

public class FromBorrowedMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case Status.ARCHIVED:
            case Status.AVAILABLE:
            case Status.OVERDUED:
                super.moveToStatus(book, requestedStatus);
                break;
            default:
                System.out.println("Перевод книги из статуса 'BORROW' в статус " + requestedStatus + " невозможен");
        }
    }
}
