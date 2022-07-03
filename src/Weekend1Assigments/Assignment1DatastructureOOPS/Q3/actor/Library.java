package Weekend1Assigments.Assignment1DatastructureOOPS.Q3.actor;

import Weekend1Assigments.Assignment1DatastructureOOPS.Q3.model.Book;
import Weekend1Assigments.Assignment1DatastructureOOPS.Q3.model.ReaderStatus;
import Weekend1Assigments.Assignment1DatastructureOOPS.Q3.model.Status;

import java.util.*;

public class Library implements ILibrary{

    public Map<IReader, ReaderStatus> readers = new HashMap<>();
    public  Set<ILibrarian> librarians = new HashSet<>();
    public Map<String, Book> books = new HashMap<>();

    public boolean requestBorrowing(IReader reader, String bookId) {
        if(readers.getOrDefault(reader, ReaderStatus.BARRED).isAllowedToBorrow()
        && books.containsKey(bookId)
        && books.get(bookId).isBorrowable()) {
            books.get(bookId).status = Status.BORROWED;

            //we could also add a logic to see if we should change the status of the reader to not allowed to borrow
            //after a certain amount of borrows

            return true;
        }

        return false;
    }

    public boolean returnBook(IReader reader, String bookId) {
        books.get(bookId).status = Status.AVAILABLE;

        //we could also add a logic to see if we should change the status of the reader to allowed to borrow
        //after returning a book and being in the permitted amount of books borrowed allowed

        return true;
    }
}
