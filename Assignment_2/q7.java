import java.util.Scanner;

class UniqueCharacterCheck
{
    boolean checkUnique(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = i + 1; j < str.length(); j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    return false;
                }
            }
        }

        return true;
    }
}

class UniqueCharacterMain
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter a string: ");

            String str = sc.nextLine();

            UniqueCharacterCheck obj = new UniqueCharacterCheck();

            boolean result = obj.checkUnique(str);

            if(result)
            {
                System.out.println("All characters are unique.");
            }
            else
            {
                System.out.println("String contains duplicate characters.");
            }
        }
    }
}