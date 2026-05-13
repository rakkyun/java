import java.util.Arrays;
import java.util.Scanner;

class AnagramCheck
{
    boolean checkAnagram(String s, String t)
    {
        if (s.length() != t.length())
        {
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}

class AnagramMain
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter first string: ");
            String s = sc.nextLine();

            System.out.print("Enter second string: ");
            String t = sc.nextLine();

            AnagramCheck obj = new AnagramCheck();

            boolean result = obj.checkAnagram(s, t);

            if(result)
            {
                System.out.println("Output: true");
            }
            else
            {
                System.out.println("Output: false");
            }
        }
    }
}