import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParaStream
{
    public static void main(String rj[])
    {
        List<Integer> list = new ArrayList<>(10000);

        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
           list.add (rand.nextInt(100));
        }

//        int sum = list.stream()
//                .map(i-> i*2)
//                .reduce(0 , (a,b) -> a+b);
//        System.out.println(sum);


        long start = System.currentTimeMillis();
        int sum2= list.stream()
                .map(i-> {
                    try{
                        Thread.sleep(1);
                    } catch (Exception e) {}
                    return i * 2;
                })
                .mapToInt(i-> i)
                .sum();
        long end = System.currentTimeMillis();
        System.out.println(sum2);
        System.out.println("Time taken is:- "+(end-start));


        long start1 = System.currentTimeMillis();
        int sum3= list.parallelStream()// responsible for making threads...
                .map(i-> {
                    try{
                        Thread.sleep(1);
                    } catch (Exception e) {}
                    return i * 2;
                })
                .mapToInt(i-> i)
                .sum();
        long end1 = System.currentTimeMillis();
        System.out.println(sum3);
        System.out.println("Time taken is:- "+(end1-start1));


    }
}
