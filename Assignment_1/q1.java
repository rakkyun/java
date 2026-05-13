
class Assignment_1{

    int fibo(){
        int a=0,b=1,c;
        int sum=0;

        System.out.println("Fibonacci Series:");

        for(int i=1;i<=10;i++){
            System.out.print(a+" ");
            sum=sum+a;

            c=a+b;
            a=b;
            b=c;
        }

        return sum;
    }
}

class Assignment_1_1{
    public static void main(String[] a){

        Assignment_1 obj = new Assignment_1();

        int result = obj.fibo();

        System.out.println("\nSum of Fibonacci numbers: "+result);
    }
}