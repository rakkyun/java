import java.util.Scanner;

class q13 {

    void armstrong(int n){

        int temp = n;
        int sum = 0;
        int rem;

        while(n > 0){

            rem = n % 10;

            sum = sum + (rem * rem * rem);

            n = n / 10;
        }

        if(sum == temp)
            System.out.println("Number is Armstrong");
        else
            System.out.println("Number is Not Armstrong");
    }
}

class Question13 {

    public static void main(String[] args) {

        int n;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter number:");
            n = sc.nextInt();
        }

        q13 obj = new q13();

        obj.armstrong(n);
    }
}