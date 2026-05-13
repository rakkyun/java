import java.util.Scanner;

class q11 {

    void power(int base, int exp){

        int result = 1;

        for(int i = 1; i <= exp; i++){
            result = result * base;
        }

        System.out.println("Result = " + result);
    }
}

class Question11 {

    public static void main(String[] args) {

        int base, exp;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter base number:");
            base = sc.nextInt();

            System.out.println("Enter exponent:");
            exp = sc.nextInt();
        }

        q11 obj = new q11();

        obj.power(base, exp);
    }
}