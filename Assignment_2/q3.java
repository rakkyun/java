import java.util.ArrayList;
import java.util.Scanner;

class PhoneCombination
{
    String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    void findCombinations(String digits, int index, String current,
                          ArrayList<String> result)
    {
        if (index == digits.length())
        {
            result.add(current);
            return;
        }

        int digit = digits.charAt(index) - '0';

        String letters = map[digit];

        for (int i = 0; i < letters.length(); i++)
        {
            findCombinations(digits,
                    index + 1,
                    current + letters.charAt(i),
                    result);
        }
    }
}

class PhoneCombinationMain
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter digits (2-9): ");
            String digits = sc.nextLine();

            ArrayList<String> result = new ArrayList<>();

            PhoneCombination obj = new PhoneCombination();

            if (digits.length() != 0)
            {
                obj.findCombinations(digits, 0, "", result);
            }

            System.out.println("Possible Combinations: " + result);
        }
    }
}