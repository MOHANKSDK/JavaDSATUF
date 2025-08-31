import java.util.Collections;
import java.util.Scanner;

public class Recursion {
    public static void main(String[]args){
        Recursion r=new Recursion();
        System.out.println("Enter total number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        r.recursionName(1,n);
        r.recursionNumber(1,n);
        r.recursionreverseNumber(n,n);
        r.recursionByBackTrack(n,n);
        r.recursionreverseBackTrack(1,n);
        r.recursionFirstNnumber(n,0);
        System.out.println(r.recursionFirstNnumberFunctional(n));
        r.recursionFirstProductNumber(n,1);
        System.out.println(r.recursionFirstProductFunctioanl(n));
        int[] arr = {1, 2, 3, 4, 5,6};
        swapArrayRecursion(arr, 0, arr.length);
        // Print reversed array
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println(reversePalindrome(0,"11211"));
        // print first 10 Fibonacci numbers
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
        allDivisorRecursion(1,n);



    }
    int count=0;
    public void recursion1(){
        if(count==4){
            return; //Base Condition
        }
        System.out.println("Method Recursion1>>"+count);
        count++;
        recursion1();
    }

    //Print Name
    public void recursionName(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("DSA");
        recursionName(i+1,n);
    }

    public void recursionNumber(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        recursionNumber(i+1,n);
    }
    public void recursionreverseNumber(int i,int n){
//        if(n<i){
//            return;
//        }
//        System.out.println(n);
//        recursionBacktrackNumber(i,n-1);

        if(i<1){
            return;
        }
        System.out.println(i);
        recursionreverseNumber(i-1,n);
    }

    public void recursionByBackTrack(int i,int n){
        if(i<1){
            return;
        }
        recursionByBackTrack(i-1,n);
        System.out.println(i);
    }

    public void recursionreverseBackTrack(int i,int n){
        if(n<i){
            return;
        }
        recursionreverseBackTrack(i+1,n);
        System.out.println(i);
    }

    //Sum of first n number using recursion
    //N=3 1+2+3=6
    //Parameterised Method
    public void recursionFirstNnumber(int i,int n){
        if(i<1){
            System.out.println(n);
            return;
        }
        recursionFirstNnumber(i-1,n+i);
    }

    //functional method
    public int recursionFirstNnumberFunctional(int n){
        if(n==0){
            return 0;
        }
        return n+recursionFirstNnumberFunctional(n-1);
    }

    //Product of first n number using recursion
    //N=3 1*2*3=6
    //Parameterised Method

    public void recursionFirstProductNumber(int i,int n){
        if(i<1){
            System.out.println(n);
            return;
        }
        recursionFirstProductNumber(i-1,n*i);
    }

    //functional method

    public int recursionFirstProductFunctioanl(int n){
        if(n<1){
            return 1;
        }
        return n*recursionFirstProductFunctioanl(n-1);
    }





    //Reverse Array using recursion
    // [1,2,3,4,2]-->[2,4,3,2,1]
    public static void swapArrayRecursion(int arr[],int i,int n){
        if(i>=n/2){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        swapArrayRecursion(arr,i+1,n);
    }

    //check if the string is palindrome
    public static boolean reversePalindrome(int i,String s){
        if(i>=s.length()-1/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-1-i)){
            return false;
        }
        return reversePalindrome(i+1,s);
    }


    //Fibonacci Series using Recursion

    public static int fibonacciRecursion(int n){
        if(n<=1){
            return n;
        }
        return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);
    }

    public static void allDivisorRecursion(int i,int n){
        if(i*i>n){
            return;
        }
        if(n%i==0){
            System.out.println(i+" ");
            if(n/i!=i){
                System.out.println(n/i+" ");
            }
        }
        allDivisorRecursion(i+1,n);
    }



}
