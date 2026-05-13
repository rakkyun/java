import java.util.Scanner;

class q14 {

    void table(int n){

        System.out.println("Multiplication Table:");

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}

class Question14 {

    public static void main(String[] args) {

        int n;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number:");
            n = sc.nextInt();
        }

        q14 obj = new q14();

        obj.table(n);
    }
}