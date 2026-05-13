import java.util.Scanner;

class q10 {

    void alphabets(){

        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(ch + " ");
        }
    }
}

class Question10 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Displaying Alphabets A to Z:");
        }

        q10 obj = new q10();

        obj.alphabets();
    }
}