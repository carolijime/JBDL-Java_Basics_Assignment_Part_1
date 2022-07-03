package Weekend1Assigments.Java_Basics_Assignment.Q10;

import java.util.SortedMap;
import java.util.TreeMap;

public class Store implements IStore{

    private SortedMap<Integer, Customer> sm;

    public Store() {
        this.sm = new TreeMap();
    }

    @Override
    public Customer insert(Customer customer) {
        return sm.put(customer.custId, customer);
    }

    @Override
    public Customer delete(int id) {
        return sm.remove(id);
    }

    @Override
    public Customer find(int id) {
        return sm.get(id);
    }

    @Override
    public void print() {
        sm.forEach((k,v) -> System.out.println(v));
    }
}
