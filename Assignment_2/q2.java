import java.util.Scanner;

class PasswordCheck
{
    int CheckPassword(String str, int n)
    {
        if (n < 4)
        {
            return 0;
        }

        if (Character.isDigit(str.charAt(0)))
        {
            return 0;
        }

        int capital = 0;
        int digit = 0;

        for (int i = 0; i < n; i++)
        {
            char ch = str.charAt(i);

            if (ch == ' ' || ch == '/')
            {
                return 0;
            }

            if (Character.isUpperCase(ch))
            {
                capital = 1;
            }

            if (Character.isDigit(ch))
            {
                digit = 1;
            }
        }

        if (capital == 1 && digit == 1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}

class PasswordCheckerMain
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter Password: ");
            String str = sc.nextLine();

            PasswordCheck obj = new PasswordCheck();

            int result = obj.CheckPassword(str, str.length());

            System.out.println("Output: " + result);
        }
    }
}