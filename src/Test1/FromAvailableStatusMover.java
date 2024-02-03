package Test1;

import Test1.Book;
import Test1.BookMover;

public class FromAvailableStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case Status.BORROWED:
            case Status.ARCHIVED:
                super.moveToStatus(book, requestedStatus);
                break;
            default:
                System.out.println("Перевод книги из статуса " + book.getStatus() + " в статус " + requestedStatus + "' невозможен");
        }

    }


}

