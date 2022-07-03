package Weekend1Assigments.Assignment1DatastructureOOPS.Q3.actor;

import Weekend1Assigments.Assignment1DatastructureOOPS.Q3.model.Book;

public interface ILibrarian {

    boolean punish(IReader reader);

    boolean updateStatus(Book book);

    //also update the status of the reader allowed to borrow/not allowed to borrow
}
