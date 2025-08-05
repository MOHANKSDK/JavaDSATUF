import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Enter the count");
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        Main m=new Main();
        System.out.println("Pattern 1");
        m.pattern1(count);
        System.out.println("Pattern 2");
        m.pattern2(count);
        System.out.println("Pattern 3");
        m.pattern3(count);
        System.out.println("Pattern 4");
        m.pattern4(count);
        System.out.println("Pattern 5");
        m.pattern5(count);
        System.out.println("Pattern 6");
        m.pattern6(count);
        System.out.println("Pattern 7");
        m.pattern7(count);
        System.out.println("Pattern 8");
        m.pattern8(count);
        System.out.println("Pattern 9");
        m.pattern9(count);
    }

    public void pattern1(int count){
        //1. for the outer loop focus count the no of lines
        //2. for the inner loop focus on the columns, and convert them somehow to the rows
        //3. print them inside the outer for loop
        //4. observe symmetry [Optional]


        //Expected Pattern
        //****
        //****
        //****
        //****

        System.out.println("Entered the Pattern1 method");
        for(int i=0;i<count;i++){
            for(int j=0;j<count;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void pattern2(int count){
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *

        for(int i=0;i<count;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void pattern3(int count){
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5

        for(int i=1;i<=count;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    public void pattern4(int count){
        //1
        //2 2
        //3 3 3
        //4 4 4 4
        //5 5 5 5 5


        for(int i=1;i<=count;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }

    public void pattern5(int count){
        // * * * * *
        //* * * *
        //* * *
        //* *
        //*

        for(int i=0;i<count;i++){
            for(int j=0;j<count-i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }


//        for(int i=1;i<=count;i++){
//            for(int j=0;j<count-i+1;j++){
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
    }

    public void pattern6(int count){
        //1 2 3 4 5
        //1 2 3 4
        //1 2 3
        //1 2
        //1

//        for(int i=1;i<=count;i++){
//            for(int j=1;j<=count-i+1;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println("");
//        }

        for(int i=0;i<count;i++){
            for(int j=0;j<count-i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println("");
        }
    }

    public void pattern7(int count){
        //        *
        //      * * *
        //    * * * * *
        //  * * * * * * *
        //* * * * * * * * *


        //[4 space,1 star,4 space]
        //[3 space,3 star,3 space]
        //[2 space,5 star,2 space]
        //[1 space,7 star,1 space]
        //[0 space,9 star,0 space]

        //For space [count-i-1]
        //For star [2*i+1]

        for(int i=0;i<count;i++){
            //space
            for(int j=0;j<count-i-1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            //space
            for(int j=0;j<count-i-1;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }

    }

    public void pattern8(int count){

        //* * * * * * * * *
        //  * * * * * * *
        //    * * * * *
        //      * * *
        //        *

        //[0 space,9 star,0 space]
        //[1 space,7 star,1 space]
        //[2 space,5 star,2 space]
        //[3 space,3 star,3 space]
        //[4 space,1 star,4 space]

//        for(int i=0;i<count;i++){
//            //spaces
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            //stars
//            for(int j=0;j<2*count-(2*i+1);j++){
//                System.out.print("*");
//            }
//            //spaces
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }


        for(int i=1;i<=count;i++){
            //spaces
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*(count-i)+1;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public void pattern9(int count){

        //        *
        //      * * *
        //    * * * * *
        //  * * * * * * *
        //* * * * * * * * *
        //* * * * * * * * *
        //  * * * * * * *
        //    * * * * *
        //      * * *
        //        *

        for(int i=0;i<count;i++){
            //space
            for(int j=0;j<count-i-1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            //space
            for(int j=0;j<count-i-1;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }

        for(int i=0;i<count;i++){
           //spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<2*count-(2*i+1);j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }

    }



}




