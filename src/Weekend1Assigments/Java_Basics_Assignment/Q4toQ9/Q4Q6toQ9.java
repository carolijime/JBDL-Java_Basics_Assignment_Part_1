package Weekend1Assigments.Java_Basics_Assignment.Q4toQ9;

import java.util.*;
import java.util.stream.IntStream;

public class Q4Q6toQ9 {

    public static void main (String[] args){
        int[]arr = {1, 2, 3,4, 5, 6, 7, 8, 9, 10};

        IntStream result;

//                Arrays.stream(arr)
//                .filter(x -> x % 2 == 0)
//                .map(x -> x * x)
//                .forEach(System.out::println);
        //.reduce(0, (x1, x2) -> x1 + x2));

        Arrays.stream(arr).map(x -> x*x).forEach(System.out::println);

        //System.out.println(result);

        System.out.println("Q7");
        Random r = new Random();
        IntStream.of(5).map(I -> r.nextInt()).forEach(System.out::println);

//        int[]arr2 = {1, 2, 3,4, 5};
//
//        Arrays.stream(arr2).forEach(x -> {Random rand = new Random(); System.out.println(rand.nextInt(1000));});
//
        List<Integer> numbers = Arrays.asList(10, 2, 30, 4, 5, 60, 7, 80, 9, 10);

        System.out.println("Q8");

        double numResult = numbers.stream()
                                                .map(x -> x*x)
                                                .filter(x -> x<100)
                                                .mapToDouble(d -> d).average().getAsDouble();
                                                //.forEach(System.out::println);

        System.out.println(numResult);

        System.out.println("Q9");

//        int maxResult = numbers.stream()
//                .max(Integer::compare)
//                .orElse(null);
//
//        int minResult = numbers.stream()
//                .min(Integer::compare)
//                .orElse(null);
//
//        System.out.println("Max: " + maxResult + ". Min: " + minResult);







    }

}
