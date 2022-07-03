package Weekend1Assigments.Java_Basics_Assignment.Q1toQ3;

import java.util.*;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        //System.out.println("hello");
        return age == person.age && Objects.equals(name, person.name);
    }

    /*@Override
    public int hashCode() {
        return Objects.hash(age, name);
    }*/

    /*@Override
    public int hashCode() {
        return Objects.hash(age);
    }*/

    /*@Override
    public int hashCode() {
        Random rand = new Random();
        return rand.nextInt(1000);  // rand.nextInt() finds a random number
    }*/


    public static void main(String[] args){
        Person p1 = new Person(34,"Caro");
        Person p2 = new Person(35, "Seba");
        Person p3 = new Person(34,"Caro");

        System.out.println("p1.equals(p3): " + p1.equals(p3));

        System.out.println(p1.hashCode() + " " + p2.hashCode() + " " + p3.hashCode());

        HashMap<Person, Integer> map1 = new HashMap<>();

        map1.put(p1, 0);
        map1.put(p2, 0);
        map1.put(p3, 0);

        //Same as map1
        HashMap<Person, Integer> map2 = new HashMap<>();

        map2.put(p3, 0);
        map2.put(p1, 0);
        map2.put(p2, 0);

        //Different from map1
        HashMap<Person, Integer> map3 = new HashMap<>();

        map3.put(p1, 0);
        map3.put(p2, 0);
        map3.put(p3, 0);
        map3.put(new Person(30,"Marce"), 0);

        System.out.println(map1.equals(map2));  //true
        System.out.println(map1.equals(map3));  //false

    }
}
