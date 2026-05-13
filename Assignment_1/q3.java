class q3 {

    void series(){

        int a = 0, b = 1, c;
        int count = 0;

        System.out.println("Fibonacci Prime Numbers:");

        while(count < 8){

            int num = a;
            int flag = 0;

            if(num < 2)
                flag = 1;

            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    flag = 1;
                    break;
                }
            }

            if(flag == 0){
                System.out.print(num + " ");
                count++;
            }

            c = a + b;
            a = b;
            b = c;
        }
    }
}

class AssignmentQ3 {

    public static void main(String[] args) {

        q3 obj = new q3();

        obj.series();
    }
}