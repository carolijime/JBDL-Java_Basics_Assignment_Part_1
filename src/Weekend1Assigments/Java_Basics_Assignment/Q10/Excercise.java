package Weekend1Assigments.Java_Basics_Assignment.Q10;


public class Excercise {

    public static void main(String[] args){

        IStore store = new Store();

        store.insert(new Customer(4, "Karan", "male", 25));
        store.insert(new Customer(1, "Ram", "male", 20));
        store.insert(new Customer(3, "Kiran", "female", 30));
        store.insert(new Customer(2, "Rashmi", "female", 40));

        store.print();

        System.out.println("");

        store.delete(3);

        store.print();

        System.out.println("");

        System.out.println(store.find(2));

        System.out.println("");

        store.insert(new Customer(7, "Ravi", "male", 37));
        store.insert(new Customer(3, "Kiran2", "female", 32));

        store.print();

        System.out.println("");

//        SortedMap<Integer, Customer> sm = new TreeMap();
//
//        Arrays.asList(
//           new Customer(1, "Ram", "male", 20),
//           new Customer(2, "Rashmi", "female", 40),
//           new Customer(3, "Kiran", "female", 30),
//           new Customer(4, "Karan", "male", 25)
//       )
//        .stream()
//        .collect(Collectors.toMap(c -> c.custId, Function.identity()))
//        .forEach((key, value) -> System.out.println("Key : "+ key + " value : " + value));
//
//        //Set s = sm.entrySet();
//
////        sm.forEach((key, value) -> System.out.println("Key : " + key + " value : " + value.gender + value.name));
//
//        Iterator i = sm.entrySet().iterator();
//
//        while(i.hasNext()){
//            Map.Entry<Integer, Customer> m = (Map.Entry)i.next();
//
//            int key = m.getKey();
//            Customer value = m.getValue();
//
////            String value = (String)m.getValue();
////
//            System.out.println("Key : "+ key
//                    + " value : " + value.gender);
//
////            System.out.println("Key : "+ key);
//        }

    }



}
