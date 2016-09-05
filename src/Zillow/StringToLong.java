package Zillow;

/**
 * Created by nhunt on 9/5/2016.
 */
public class StringToLong
{
    public static void main(String a[])
    {
        System.out.println(StringToLong("-34"));
    }

    public static long StringToLong(String number)
    {
        long finalVal = 0;
        long mult = 1;

        if (number.charAt(0) == '-')
        {
            mult = -1;
            number = number.substring(1);
        }

        for (int i = 0; i < number.length(); i++)
        {
            char c = number.charAt(i);

            if (c >= 48 && c <= 57)
            {
                finalVal = (finalVal * 10) + Character.getNumericValue(c);
            }
            else
            {
                return -1;
            }
        }

        return finalVal * mult;
    }
}
