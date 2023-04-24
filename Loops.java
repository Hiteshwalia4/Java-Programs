public class Loops {
    public static void main(String[] args) {
           //Ques 1
//        for (int i=5 ; i>0 ;i--){
//            for(int j=1; j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }

            //Ques2
//          int sum = 0;
//          int i = 0;
//          int n=5;
//          while(i<n){
//              System.out.println(2*i);
//              sum=sum+ (2*i);
//              i+=1;
//          }
//        System.out.println("Sum of first "+ n + " even numbers is: " + sum);

        //Ques3
//        int n =5;
//        for (int i =1;i<=10;i++){
//            System.out.print("5 X " + i + " = " + n*i);
//            System.out.println();
//        }

        //Ques4
//        int n =10;
//        for (int i =10;i>=1;i--){
//            System.out.print("10 X " + i + " = " + n*i);
//            System.out.println();
//        }

        //Ques5 and 6
//        int f = 1;
//        int n=4;
//        int i=1;
//        for(int i= 1;i<=n;i++){
//            f=f*i;
//        }
//        while(i<=n){
//            f=f*i;
//            i++;
//        }
//        System.out.println("Factorial of " + n +  " is:  " + f );


        //Ques7
        int n=5;
        int i=n;
        while(i>0){
            int j=1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            i--;
            System.out.print("\n");
        }

    }
}
