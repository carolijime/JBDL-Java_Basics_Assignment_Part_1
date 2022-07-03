package Weekend1Assigments.Assignment1DatastructureOOPS.Q3.actor;

public interface IReader {

    boolean borrows(String bookId, Library library);

    boolean returns(String bookId, Library library);

}