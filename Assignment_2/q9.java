import java.util.Scanner;

class TitleCaseConvert
{
    String convertTitleCase(String sentence)
    {
        String words[] = sentence.split(" ");

        String result = "";

        for(int i = 0; i < words.length; i++)
        {
            String word = words[i];

            char first = Character.toUpperCase(word.charAt(0));

            String remaining = word.substring(1).toLowerCase();

            result = result + first + remaining + " ";
        }

        return result;
    }
}

class TitleCaseMain
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter sentence: ");

            String sentence = sc.nextLine();

            TitleCaseConvert obj = new TitleCaseConvert();

            String output = obj.convertTitleCase(sentence);

            System.out.println("Title Case: " + output);
        }
    }
}