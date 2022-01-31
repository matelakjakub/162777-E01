package Z2;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Zadanie2
{
    public static <T extends Iterable<E>, E> void wypiszCoDrugi(T iterable)
    {
        boolean coDrugi = true;
        for (E t : iterable)
        {
            if(coDrugi)
            {
                System.out.println(t + ", ");
            }
            coDrugi = !coDrugi;
        }
    }

    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("Pierwszy");
        list.add("Drugi");
        list.add("Trzeci");
        list.add("Czwarty");
        list.add("Piąty");
        Zadanie2.wypiszCoDrugi(list);

        System.out.println("\n");

        Set<Integer> set = new HashSet<Integer>();
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);
        Zadanie2.wypiszCoDrugi(set);


    }
}
