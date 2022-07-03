package Weekend1Assigments.Assignment1DatastructureOOPS.Q1;

import java.util.HashMap;

public class Store implements IStore {

    private HashMap<Person, Integer> hm;

    public Store() {
        this.hm = new HashMap<>();
    }

    public void printAllNodes(Node n){
        printAllNodesRecursive(n);
    }

    public void printAllNodesRecursive(Node n){
        if (n != null) {
            System.out.println(n.person.name);
            printAllNodesRecursive(n.left);
            printAllNodesRecursive(n.right);
        }
    }

    public void insertAllHM(Node n){
        if (n != null) {
            insertHM(n);
            insertAllHM(n.left);
            insertAllHM(n.right);
        }
    }

    public Integer insertHM (Node n){
//        Integer existingHM =  hm.get(n.person);
//        if (existingHM!=null)
//            existingHM++;
//        else
//            existingHM=1;
//        return hm.put(n.person, existingHM);
        return hm.put(n.person, hm.getOrDefault(n.person, 0) + 1);
    }

//    @Override
    public void printHM() {
//        hm.entrySet()
//                .stream().max(Comparator.comparingInt(Map.Entry<Person, Integer>::getValue))
//                .stream().findFirst()
//                .ifPresent(e -> System.out.println("k: " + e.getKey().getName() + ", v: " + e.getValue()));
        hm.entrySet()
                .stream()
                .forEach(e -> System.out.println("k: " + e.getKey().getName() + ", v: " + e.getValue()));
    }

    public HashMap<Person, Integer> findPersonMap(Node n){

        // Write your code here: Tree traversal
        insertAllHM(n);
        return hm;
    }



}
