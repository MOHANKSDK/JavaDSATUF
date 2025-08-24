import java.util.Scanner;

import static java.util.Collections.min;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Enter the count");
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        Main m=new Main();
//        System.out.println("Pattern 1");
//        m.pattern1(count);
//        System.out.println("Pattern 2");
//        m.pattern2(count);
//        System.out.println("Pattern 3");
//        m.pattern3(count);
//        System.out.println("Pattern 4");
//        m.pattern4(count);
//        System.out.println("Pattern 5");
//        m.pattern5(count);
//        System.out.println("Pattern 6");
//        m.pattern6(count);
//        System.out.println("Pattern 7");
//        m.pattern7(count);
//        System.out.println("Pattern 8");
//        m.pattern8(count);
//        System.out.println("Pattern 9");
//        m.pattern9(count);
//        System.out.println("Pattern 10");
//        m.pattern10(count);
//        System.out.println("Pattern 11");
//        m.pattern11(count);
//        System.out.println("Pattern 12");
//        m.pattern12(count);
//        System.out.println("Pattern 13");
//        m.pattern13(count);
//        System.out.println("Pattern 14");
//        m.pattern14(count);
//        System.out.println("Pattern 15");
//        m.pattern15(count);
//        System.out.println("Pattern 16");
//        m.pattern16(count);
//        System.out.println("Pattern 17");
//        m.pattern17(count);
//        System.out.println("Pattern 18");
//        m.pattern18(count);
//        System.out.println("Pattern 19");
//        m.pattern19(count);
//        System.out.println("Pattern 20");
//        m.pattern20(count);
        System.out.println("Pattern z");
        m.patternZ(count);
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
    public void pattern10(int count){
        //1             1
        //1 2         2 1
        //1 2 3     3 2 1
        //1 2 3 4 4 3 2 1

        for(int i=1;i<=count;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //spaces
            for(int j=1;j<=(2*count)-(2*i);j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("");

        }

    }

    public void pattern11(int count){
        int num=1;
        for(int i=1;i<=count;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+ " ");
                num=num+1;
            }
            System.out.println("");
        }
    }

    public void pattern12(int count){
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E

        for(int i=1;i<=count;i++){
            for(char ch='A';ch<='A'+i-1;ch++){
                System.out.print(ch+" ");
            }
            System.out.println("");
        }
    }

    public void pattern13(int count){
//        A B C D E
//        A B C D
//        A B C
//        A B
//        A
        for(int i=count;i>=1;i--){
            for(char ch='A';ch<='A'+i-1;ch++){
                System.out.print(ch+" ");
            }
            System.out.println("");
        }
    }

    public void pattern14(int count){
        for(int i=1;i<=count;i++){
            char ch=(char)('A'+i-1);
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");

            }
            System.out.println("");
        }
    }


    public void pattern15(int count){
//        A
//       ABA
//      ABCBA
//     ABCDCBA
//    ABCDEDCBA
        for(int i=1;i<=count;i++){
            //spaces
            for(int j=1;j<=count-i;j++){
                System.out.print(" ");
            }
            char ch='A';
            //alphabets
            for(int j=1;j<=2*i-1;j++){
                System.out.print(ch);
                if(j<=(2*i-1)/2){
                    ch++;
                }else {
                    ch--;
                }

            }
            //spaces
            for(int j=1;j<=count-i;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public void pattern16(int count){
//        E
//        D E
//        C D E
//        B C D E
//        A B C D E
        char ch=(char)('A'+count-1);
      for(int i=1;i<=count;i++){
          //alphabet
          for(char j=(char)(ch-i+1);j<=ch;j++){
              System.out.print(j+" ");
          }
          System.out.println("");
      }

    }
    public void pattern17(int count){
        for(int i=1;i<=count;i++){
            //stars
            for(int j=count;j>=i;j--){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*i-2;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=count;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=1;i<=count;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=(2*count)-(2*i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }


    }

    public void pattern18(int count){
//    *        *
//    **      **
//    ***    ***
//    ****  ****
//    **********
//    ****  ****
//    ***    ***
//    **      **
//    *        *

        for(int i=1;i<=count;i++){
//            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
//            //spaces
            for(int j=1;j<=(2*count)-(2*i);j++){
                System.out.print(" ");
            }
//            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = count - 1; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 1; j <= (2 * count) - (2 * i); j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern19(int count){
//        ****
//        *  *
//        *  *
//        ****

        for(int i=1;i<=count;i++){
            for(int j=1;j<=count;j++){
                if(i==1 || j==1 || i==count || j==count){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public void pattern20(int count){
//        5 5 5 5 5 5 5 5 5
//        5 4 4 4 4 4 4 4 5
//        5 4 3 3 3 3 3 4 5
//        5 4 3 2 2 2 3 4 5
//        5 4 3 2 1 2 3 4 5
//        5 4 3 2 2 2 3 4 5
//        5 4 3 3 3 3 3 4 5
//        5 4 4 4 4 4 4 4 5
//        5 5 5 5 5 5 5 5 5

        for(int i=1;i<=2*count-1;i++){
            for(int j=1;j<=2*count-1;j++){
                int top=i-1;
                int left=j-1;
                int bottom=2*count-i-1;
                int right=2*count-j-1;
                //System.out.print(count-Math.min(Math.min(top,bottom),Math.min(left,right)));
                //OR
                int minDist = top;
                if (left < minDist) minDist = left;
                if (bottom < minDist) minDist = bottom;
                if (right < minDist) minDist = right;

                System.out.print((count - minDist) + " ");
            }
            System.out.println("");
        }

    }

    public void patternZ(int count){
//        for (int i = 0; i < count; i++) {
//            for (int j = 0; j < count; j++) {
//                // First row or last row
//                if (i == 0 || i == count - 1) {
//                    System.out.print("*");
//                }
//                // Diagonal (i + j == count - 1)
//                else if (i + j == count - 1) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        for(int i=0;i<count;i++){
            if(i==0 || i==count-1){
                for(int j=0;j<count;j++){
                    System.out.print("*");
                }
            }
            else{
                int pos=count-1-i;
                for(int j=0;j<count;j++){
                    if(j==pos){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }



}






