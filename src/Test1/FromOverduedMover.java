package Test1;

import Test1.Book;
import Test1.BookMover;

public class FromOverduedMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case Status.AVAILABLE:
            case Status.ARCHIVED:
                super.moveToStatus(book, requestedStatus);
            default:
                System.out.println("Перевод книги из статуса 'OVERDUED' в статус " + requestedStatus + " невозможен");
        }

    }
}
