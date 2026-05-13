import java.util.Scanner;

class StringPermutation
{
    void findPermutation(String str, String ans)
    {
        if (str.length() == 0)
        {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            String left = str.substring(0, i);

            String right = str.substring(i + 1);

            String remaining = left + right;

            findPermutation(remaining, ans + ch);
        }
    }
}

class PermutationMain
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter String: ");
            String str = sc.nextLine();

            StringPermutation obj = new StringPermutation();

            System.out.println("Permutations are:");

            obj.findPermutation(str, "");
        }
    }
}