import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamsP
{
    public static void main(String ar[])
    {
        List<Integer> x = Arrays.asList(4, 5, 6, 8, 5, 2, 1);

        Stream<Integer> s1 = x.stream();
        Stream<Integer> s2 = s1.filter(n-> n%2==0);
        Stream<Integer> s3 = s2.map(n-> n*n);
        Stream<Integer> s4 = s3.distinct();
        s4.forEach(n-> System.out.println(n));

        /*
        
        */







      // s4. forEach(n-> System.out.println(n));
        }
}

