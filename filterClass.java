import java.util.*;
import java.util.stream.Collectors;

public class filterClass {
    static void main(String[] args) {
        List<Integer> number=Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> even=number.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(even);
        //check filter
//        List<String> result=names.stream()
//                .filter(s->s.length())
    }
}
