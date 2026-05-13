import java.util.Scanner;

class LongestWord
{
    String findWord(String sentence)
    {
        String words[] = sentence.split(" ");

        String longest = words[0];

        for(int i = 1; i < words.length; i++)
        {
            if(words[i].length() > longest.length())
            {
                longest = words[i];
            }
        }

        return longest;
    }
}

class LongestWordMain
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter sentence: ");

            String sentence = sc.nextLine();

            LongestWord obj = new LongestWord();

            String result = obj.findWord(sentence);

            System.out.println("Longest Word: " + result);
        }
    }
}