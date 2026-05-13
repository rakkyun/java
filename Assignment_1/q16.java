import java.util.Scanner;

class q16 {

    void perfect(int n){

        int sum = 0;

        for(int i = 1; i < n; i++){

            if(n % i == 0){
                sum = sum + i;
            }
        }

        if(sum == n)
            System.out.println("Number is Perfect");
        else
            System.out.println("Number is Not Perfect");
    }
}

class Question16 {

    public static void main(String[] args) {

        int n;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number:");
            n = sc.nextInt();
        }

        q16 obj = new q16();

        obj.perfect(n);
    }
}