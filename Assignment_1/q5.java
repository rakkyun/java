import java.util.Scanner;

class q5 {

    void gen(int n){

        int a = 0, b = 1, c;
        int neg = -1;

        System.out.println("Series:");

        for(int i = 1; i <= n; i++){

            System.out.print(a + " ");
            System.out.print(neg + " ");

            c = a + b;
            a = b;
            b = c;

            neg = neg - 3;
        }
    }
}

class Question5 {

    public static void main(String[] args) {

        int n;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter limit:");
            n = sc.nextInt();
        }

        q5 obj = new q5();

        obj.gen(n);
    }
}