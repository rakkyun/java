import java.util.Scanner;

class q4 {

    void gene(int n){

        int a = 0, b = 1, c;
        int power = 2;

        System.out.println("Series:");

        for(int i = 1; i <= n; i++){

            System.out.print(a + " ");
            System.out.print(power + " ");

            c = a + b;
            a = b;
            b = c;

            power = power * 2;
        }
    }
}

class Question4 {

    public static void main(String[] args) {

        int n;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter limit: ");
            n = sc.nextInt();
        }

        q4 obj = new q4();

        obj.gene(n);
    }
}