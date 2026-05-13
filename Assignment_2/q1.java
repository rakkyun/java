import java.util.Scanner;

class LongestPrefix
{
    String findPrefix(String[] strs)
    {
        if (strs.length == 0)
        {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++)
        {
            while (strs[i].indexOf(prefix) != 0)
            {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty())
                {
                    return "";
                }
            }
        }

        return prefix;
    }
}

class LongestCommonPrefixMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] strs = new String[n];

        System.out.println("Enter strings:");

        for (int i = 0; i < n; i++)
        {
            strs[i] = sc.nextLine();
        }

        LongestPrefix obj = new LongestPrefix();

        String result = obj.findPrefix(strs);

        System.out.println("Longest Common Prefix: " + result);

        sc.close();
    }
}