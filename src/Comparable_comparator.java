import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students {

    int age ; String name ;

    Students (int age, String name ) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}









public class Comparable_comparator
{
    public static void main (String args[])
    {

//        Comparator <Integer> com = new Comparator<Integer>() {
//            // Comparitor is a comcept or a interface by which we can
//            // define our own logic for sorting..
//
//            @Override
//            public int compare(Integer i, Integer j) {
//                if (i%10 > j%10)
//                    return 1;
//                else
//                    return -1;
//            }
//        };

        Comparator <Students> st = (Students i, Students j) -> {
//                if (i.name.length() > j.name.length())
//                    return 1;
//                else
//                    return -1;
             return i.name.length()> j.name.length() ?  1 : -1;
            };




//        List <Integer> list = new ArrayList<Integer>();
//        list.add(51);
//        list.add(17);
//        list.add(34);
//        list.add(42);
//        list.add(15);
//        Collections.sort(list,com);
//
//        System.out.println(list);



        List <Students> stud = new ArrayList <Students>();
        stud.add(new Students(21,"Prannav"));
        stud.add(new Students(22,"Mishra"));
        stud.add(new Students(25,"Harsh"));
        stud.add(new Students(27,"Rishiii"));

        Collections.sort(stud,st);

        for (Students i : stud) {
            System.out.println(i);
        }

    }
}
