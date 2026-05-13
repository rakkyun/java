import java.util.Scanner;

class q8 {

    void GCD(int a, int b){

        int gcd = 1;
        int min;

        if(a < b)
            min = a;
        else
            min = b;

        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }

        System.out.println("GCD = " + gcd);
    }
}

class Question8 {

    public static void main(String[] args) {

        int x, y;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter first number:");
            x = sc.nextInt();

            System.out.println("Enter second number:");
            y = sc.nextInt();
        }

        q8 obj = new q8();

        obj.GCD(x, y);
    }
}