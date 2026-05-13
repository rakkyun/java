import java.util.Scanner;

class q7 {

    void generate(int n){

        int even = 2;
        int fact = 1;

        System.out.println("Series:");

        for(int i = 1; i <= n; i++){

            System.out.print(even + " ");

            fact = fact * i;
            System.out.print(fact + " ");

            even = even + 2;
        }
    }
}

class Question7 {

    public static void main(String[] args) {

        int n;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter limit:");
            n = sc.nextInt();
        }

        q7 obj = new q7();

        obj.generate(n);
    }
}