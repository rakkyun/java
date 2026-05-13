import java.util.Scanner;

class q15 {

    void reverse(int n){

        int rev = 0;
        int rem;

        while(n > 0){

            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        System.out.println("Reversed Number = " + rev);
    }
}

class Question15 {

    public static void main(String[] args) {

        int n;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number:");
            n = sc.nextInt();
        }

        q15 obj = new q15();

        obj.reverse(n);
    }
}