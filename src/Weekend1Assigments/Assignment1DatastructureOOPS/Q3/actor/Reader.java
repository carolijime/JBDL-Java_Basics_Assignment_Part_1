package Weekend1Assigments.Assignment1DatastructureOOPS.Q3.actor;

public class Reader implements IReader{

    @Override
    public boolean borrows(String bookId, Library library) {
        return library.requestBorrowing(this, bookId);
    }

    @Override
    public boolean returns(String bookId, Library library) {
        return library.returnBook(this, bookId);
    }
}
