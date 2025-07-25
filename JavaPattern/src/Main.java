import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Enter the count");
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        Main m=new Main();
//        System.out.println("Pattern 1");
//        m.Pattern1(count);
//        System.out.println("Pattern 2");
//        m.Pattern2(count);
        System.out.println("Pattern 3");
        m.Pattern3(count);
    }

    public void Pattern1(int count){
        //1. for the outer loop focus count the no of lines
        //2. for the outer loop focus on the columns, and convert them somehow to the rows
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

    public void Pattern2(int count){
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

    public void Pattern3(int count){
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
}