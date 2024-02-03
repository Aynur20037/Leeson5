package Test1;

public class Book {
    private String title;
    private Status status;

    public Book(String title) {
        this.title = title;
        this.status = Status.AVAILABLE;

    }

    public Status getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
