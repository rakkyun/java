import java.util.Scanner;

class DomainExtract
{
    String getDomain(String url)
    {
        url = url.replace("https://", "");
        url = url.replace("http://", "");
        url = url.replace("www.", "");

        int slashIndex = url.indexOf("/");

        if(slashIndex != -1)
        {
            url = url.substring(0, slashIndex);
        }

        return url;
    }
}

class DomainMain
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter URL: ");

            String url = sc.nextLine();

            DomainExtract obj = new DomainExtract();

            String result = obj.getDomain(url);

            System.out.println("Domain: " + result);
        }
    }
}