package Weekend1Assigments.Java_Basics_Assignment.Q10;

public interface IStore {

    Customer insert(Customer customer);

    Customer delete(int id);

    Customer find(int id);

    void print();

}
