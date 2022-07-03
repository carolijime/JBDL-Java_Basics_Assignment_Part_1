package Weekend1Assigments.Assignment1DatastructureOOPS.Q2;

import Weekend1Assigments.Assignment2Streams.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(3, "John", "USA"),
                new Person(5, "JA", "England"),
                new Person(4, "Sam", "Italy"),
                new Person(2, "Sam", "Italy"),
                new Person(2, "Robert", "Italy")
        );

        System.out.println(findMinimumOperationSum(people));

    }

    public static int findMinimumOperationSum(List<Person> personList){
        // write your code here

        //convert it to a list with just age
        List<Integer> list = personList.stream().map(Person::getAge).collect(Collectors.toList());

        if(list.size()==1){
            return list.get(0);
        }

        int sum=0;
        while(list.size()>1){

            list.sort(Comparator.comparingInt(x->x));

            int newElement = list.remove(0) + list.remove(0);

            list.add(newElement);

            sum+=newElement;

        }

        //System.out.println(Collections.min(list));


        return sum;
    }

}
