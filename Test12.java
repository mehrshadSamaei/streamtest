import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        Integer integer = list.stream().filter(e -> e > 5).findFirst().orElse(3);
        System.out.println(integer);

        List<Integer> num = new ArrayList<>();
        for(int i = 1 ; i <= 3 ; i++){
            num.add(i);
        }
        System.out.println(num);
        Map<Boolean, List<Integer>> collect =
                num.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        Integer reduce = num.stream().reduce(10,Integer :: sum);
        System.out.println(reduce);

    }
}
