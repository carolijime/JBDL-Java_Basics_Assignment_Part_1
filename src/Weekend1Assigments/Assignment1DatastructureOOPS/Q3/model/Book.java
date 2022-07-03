package Weekend1Assigments.Assignment1DatastructureOOPS.Q3.model;

public class Book {

    String id;
    public Status status;
    Metadata metadata;

    public boolean isBorrowable() {
        return status == Status.AVAILABLE;
    }
}
