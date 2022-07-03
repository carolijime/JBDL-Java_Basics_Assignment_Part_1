package Weekend1Assigments.Assignment2Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Person {

    private int age;
    private String name;
    private String country;

    public Person(int age, String name, String country) {
        this.age = age;
        this.name = name;
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return name;

    }

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person(20, "John", "USA"),
                new Person(35, "Sam", "Italy"),
                new Person(15, "JA", "England"),
                new Person(30, "Robert", "Italy"),
                new Person(20, "James", "Ireland"),
                new Person(25, "Peter", "USA"),
                new Person(5, "Jessica", "Norway"),
                new Person(40, "Roger", "Netherlands"),
                new Person(50, "Jim", "USA")
        );

//        people.sort(Comparator.comparingInt(Person::getAge).reversed());
//
//        people.sort(Comparator.comparingInt(Person::getAge));
//
//        System.out.println(people);

        //people.stream().forEach(System.out::println);

        //people.stream().forEach(x-> System.out.println(x.age));

        //Q1. Print the avg age of all the people
        //System.out.println(people.stream().map(x->x.age).mapToDouble(d -> d).average().getAsDouble());

        //Q2. Create a list of all the people who are either greater than 20 or contain any vowel in their name (uppercase or lowercase)
        //people.stream().filter(x->x.age>20||x.name.toLowerCase().contains("a")||x.name.toLowerCase().contains("e")||x.name.toLowerCase().contains("i")||x.name.toLowerCase().contains("o")||x.name.toLowerCase().contains("u")).forEach(System.out::println);

        //Q3. Create a list of people, sorted in ascending order on the basis of age, if age is the same then sort in descending order of name

//        Comparator<Person> comparator = Comparator.comparing(person -> person.age);
//        comparator = comparator.thenComparing(Comparator.comparing(person -> person.name, Comparator.reverseOrder()));
//
//        people.stream().sorted(comparator).forEach(x->System.out.println(x.age + " " + x.name));

        //Q4. Create a map from this people list where the key is country name and value is count which means a map will tell how many people live in a particular country
//        Map<String, Long> countPerCountry = people.stream().collect(
//                Collectors.groupingBy(Person::getCountry, Collectors.counting()));
//
//        System.out.println(countPerCountry);

        //Q5. Create a map which stores avg age of people per country (key should be country and value should be average age i.e, double)

//        Map<String, Double> avgAgePerCountry = people.stream().collect(
//                Collectors.groupingBy(Person::getCountry, Collectors.averagingDouble(Person::getAge)));
//
//        System.out.println(avgAgePerCountry);

        //Q6. Print the oldest person in every country
//
//        Map<String, Optional<Person>> oldestPerCountry = people.stream().collect(
//                Collectors.groupingBy(Person::getCountry, Collectors.maxBy(Comparator.comparingInt(Person::getAge))));
//
//        System.out.println(oldestPerCountry);

        //Q7. Print the country with most people

//        System.out.println(
//                people.stream().collect(
//        Collectors.groupingBy(Person::getCountry, Collectors.counting())).entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).findFirst()
//        );

        //Q8. Create a list of 20 random integers in the range 0 - 1000 using Java 8 streams
        int[]arr2 = {1, 2, 3,4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        IntStream list = Arrays.stream(arr2).map(x -> new Random().nextInt(1000));
        list.forEach(System.out::println);

        Random r = new Random();
        List<Integer> rands = IntStream.of(20).mapToObj(i -> r.nextInt(1000)).collect(Collectors.toList());
        rands.forEach(System.out::println);

        IntStream.of(20).forEach(i -> System.out.println(r.nextInt(1000)));
    }

}

