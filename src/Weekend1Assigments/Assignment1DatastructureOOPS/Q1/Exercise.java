package Weekend1Assigments.Assignment1DatastructureOOPS.Q1;

public class Exercise {

    public static void main(String[] args) {

        //Q1.

        Person p1 = new Person(34, "Caro", 111);
        Person p2 = new Person(35, "Seba", 199);
        Person p3 = new Person(33, "Pancho", 166);
        Person p4 = new Person(33, "Pancho", 156);


        Node root = new Node();
        root.person = p1;
        root.left = new Node();
        root.left.person = p1;
        root.right = new Node();
        root.right.person = p2;

        root.right.left = new Node();
        root.right.left.person = p3;

        root.right.right = new Node();
        root.right.right.person = p4;


        IStore store = new Store();

        //store.printAllNodes(root);

        //store.insertAllHM(root);

        store.findPersonMap(root);

        store.printHM();




    }
}
