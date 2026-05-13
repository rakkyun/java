import java.util.Scanner;

class q12 {

    void palindrome(int n){

        int temp = n;
        int rev = 0;
        int rem;

        while(n > 0){

            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if(temp == rev)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is Not Palindrome");
    }
}

class Question12 {

    public static void main(String[] args) {

        int n;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter number:");
            n = sc.nextInt();
        }

        q12 obj = new q12();

        obj.palindrome(n);
    }
}