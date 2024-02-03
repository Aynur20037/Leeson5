package Test1;

import Test1.Book;
import Test1.BookMover;
import Test1.FromAvailableStatusMover;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(" Agatha");
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();

        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println("Current status: " + book.getStatus());

        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIVED);
        System.out.println("Current status: " + book.getStatus());

        fromAvailableStatusMover.moveToStatus(book, Status.OVERDUED);
        System.out.println("Current status: " + book.getStatus());

        fromAvailableStatusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println("Current status: " + book.getStatus());

    }
}