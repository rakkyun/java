class second{

    int prime(){

        System.out.println("Prime numbers from 1 to 1000:");

        for(int i=2;i<=1000;i++){
            int flag=0;

            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }

            if(flag==0){
                System.out.print(i+" ");
            }
        }

        return 0;
    }
}

class upDemo{
    public static void main(String[] a){

        second obj = new second();

        obj.prime();
    }
}
