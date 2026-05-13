import java.util.Scanner;

class ProfanityFilter
{
    void filterText(String text)
    {
        String[] badWords = {"bad", "ugly", "stupid"};

        for (int i = 0; i < badWords.length; i++)
        {
            text = text.replaceAll("(?i)" + badWords[i], "***");
        }

        System.out.println("Filtered text: " + text);
    }
}

class ProfanityMain
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter text: ");

            String text = sc.nextLine();

            ProfanityFilter obj = new ProfanityFilter();

            obj.filterText(text);
        }
    }
}