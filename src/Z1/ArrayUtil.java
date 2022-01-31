package Z1;

import java.time.LocalTime;

public class ArrayUtil
{

    public static <T extends Comparable>void jestPalindromem (T[] tab)
    {
        boolean palindrom = true;
        for(int i = 0; i < tab.length/2; i++)
        {
                if(!tab[i].equals(tab[tab.length - 1 - i]))
                {
                    palindrom = false;
                    break;
                }
        }
        if (palindrom)
        {
            System.out.println("Podany argument jest palindromem");
        }
        else
        {
            System.out.println("Podany argument nie jest palindromem");
        }
    }

    public static void main(String[] args)
    {
        Integer[] posortowneLiczbyNiePalindrom = {1,2,3,3,99,100};
        ArrayUtil.jestPalindromem(posortowneLiczbyNiePalindrom);
        Integer[] niePosortowneLiczbyPalindrom = {1,2,3,99,3,2,1};
        ArrayUtil.jestPalindromem(niePosortowneLiczbyPalindrom);

        LocalTime[] posortowaneDatyNiePalindrom = {
                LocalTime.of(10, 11),
                LocalTime.of(12, 11),
                LocalTime.of(14, 11),
                LocalTime.of(16, 11)
        };
        ArrayUtil.jestPalindromem(posortowaneDatyNiePalindrom);

        LocalTime[] niePosortowaneDatyPalindrom = {
                LocalTime.of(10, 11),
                LocalTime.of(12, 11),
                LocalTime.of(12, 11),
                LocalTime.of(10, 11)
        };
        ArrayUtil.jestPalindromem(niePosortowaneDatyPalindrom);
    }
}
