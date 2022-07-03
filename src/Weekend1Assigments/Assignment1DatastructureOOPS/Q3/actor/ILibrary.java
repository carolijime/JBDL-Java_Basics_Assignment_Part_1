package Weekend1Assigments.Assignment1DatastructureOOPS.Q3.actor;

public interface ILibrary {

    boolean requestBorrowing(IReader reader, String bookId);

    boolean returnBook(IReader reader, String bookId);
}
