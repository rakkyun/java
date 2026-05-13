import java.util.Scanner;

class q6 {

    void factorial(int n){

        int fact = 1;

        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
}

class Question6 {

    public static void main(String[] args) {

        int n;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            n = sc.nextInt();
        }

        q6 obj = new q6();

        obj.factorial(n);
    }
}