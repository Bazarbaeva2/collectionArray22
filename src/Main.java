import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,20,25,30,35,40,45,50,55,60,65,70,80,90,100);

        numbers.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
        int i = 100;
        numbers.stream()
                .filter(integer -> 100==0)
                .forEach(System.out::println);

    }

}


