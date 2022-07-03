package Weekend1Assigments.Assignment1DatastructureOOPS.Q1;

import java.util.HashMap;

public interface IStore {

    HashMap<Person, Integer> findPersonMap(Node n);

    void printAllNodes(Node n);

    //void printAllNodesRecursive(Node n);

    //Integer insertHM (Node n);

    void insertAllHM(Node n);

    void printHM();

}
