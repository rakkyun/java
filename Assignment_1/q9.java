import java.util.Scanner;

class q9 {

    void calculate(int n){

        double sum = 0;
        int fact = 1;

        for(int i = 1; i <= n; i++){

            fact = fact * i;

            sum = sum + (1.0 / fact);
        }

        System.out.println("Sum of series = " + sum);
    }
}

class Question9 {

    public static void main(String[] args) {

        int n;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter number of terms:");
            n = sc.nextInt();
        }

        q9 obj = new q9();

        obj.calculate(n);
    }
}