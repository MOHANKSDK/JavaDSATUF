import java.util.*;

import static java.lang.Math.min;
import static java.lang.Math.sqrt;

public class NumberProgram {
    public static void main(String[]args){
        System.out.println("Hello");
        System.out.println("Enter the count");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reverseNumber(n);
        countofDigit(n);
        palindromeProblem(n);
        armstrongProblem(n);
        printAllDivisor(n);
        primeNumber(n);
        gcd(9,12);
        fibonacciSeries(n);
    }

    public static void reverseNumber(int n){
        int rev=0;
        while(n>0){
            int last=n%10;
            rev=(rev*10)+last;
            n=n/10;
        }
        System.out.println("Reverse of a number>>>"+rev);
    }

    public static void countofDigit(int n){
        int count=0;
        while(n>0){
            int last=n%10;
            count=count+1;
            n=n/10;
        }
        System.out.println("Count of digits>>>>>"+count);
    }

    public static void palindromeProblem(int n){
        int rev=0;
        int duplicateN=n;
        while(n>0){
            int last=n%10;
            rev=(rev*10)+last;
            n=n/10;
        }
        if(rev==duplicateN){
            System.out.println("It is palindrome>>>>"+rev);
        }

        else {
            System.out.println("Not a palindrome>>>>"+rev);
        }
    }

    public static void armstrongProblem(int n){
        //1634=1^4+6^4+3^4+4^4=1634
        //Get the count power
        int tempnum=n;
        int count=0;
        int sum=0;
        while(tempnum>0){
            int last=tempnum%10;
            count=count+1;
            tempnum=tempnum/10;
        }
        tempnum=n;
        //Product of the number
        while(tempnum>0){
            int last=tempnum%10;
            //System.out.println("Total Count>>>>>"+count);
            int product=1;
            for(int i=0;i<count;i++){
                product*=last;
            }
            //System.out.println("Total Product>>>>>"+product);
            tempnum=tempnum/10;
            sum=sum+product;
            //System.out.println("Total sum>>>>>"+sum);
        }
        if(sum==n){
            System.out.println("Armstrong number is>>>>>"+sum);
        }
        else {
            System.out.println("It is not armstrong number>>>>"+sum);
        }
    }

    public static void printAllDivisor(int n){
//        int count=0;
//        for(int i=1;i<n;i++){
//            if(n%i==0){
//                System.out.println("Divisible numbers are>>>>"+i);
//                count+=1;
//            }
//        }
//        System.out.println(count);
        List a =new ArrayList();
        //print all divisor
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                a.add(i);
                System.out.println("a after n%i>>>>>"+a);
                if(((n/i)!=i)){
                    a.add(n/i);
                    System.out.println("a after n/i!=i>>>>>"+a);
                }
            }
        }
        Collections.sort(a);
        System.out.println("Divisors of "+ n + "are:" + a);
    }

    public static void primeNumber(int n){
        int count=0;
//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                count+=1;
//            }
//        }
//        if(count==2){
//            System.out.println("Prime Number>>>"+n);
//        }
//        else {
//            System.out.println("Not a prime number>>>>"+n);
//        }
        //print all divisor
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count+=1;
                if(((n/i)!=i)){
                    count+=1;
                }
            }
        }
        if(count==2){
            System.out.println("Prime Number>>>"+n);
        }
        else{
            System.out.println("Not a prime number>>>>"+n);
        }
    }

    public static void gcd(int n1,int n2){
        int gcd=1;
//        for(int i=1;i<=n1;i++){
//            if(n1%i==0 && n2%i==0){
//                gcd=i;
//            }
//        }
//        for(int i=1;i<=min(n1,n2);i++){
//            if(n1%i==0 && n2%i==0){
//                gcd=i;
//            }
//        }

        for(int i=min(n1,n2);i>=1;i--){
            if(n1%i==0 && n2%i==0){
                System.out.println(i);
                break;
            }
        }
        //o(logn)
//        for(int i=1;i<=min(n1,n2);i++){
//            while(n1>0 && n2>0){
//                if(n1>n2){
//                    n1=n1%n2;
//                }
//                else{
//                    n2=n2%n1;
//                }
//            }
//            if(n1==0){
//                System.out.println(n2+"is gcd");
//            }
//            else{
//                System.out.println(n1+"is gcd");
//            }
//        }
        //System.out.println(gcd);
    }

    public static void fibonacciSeries(int count){
        int n1=0,n2=1;
        for(int i=0;i<count;i++){
            System.out.print(n1+" ");
            int n3=n2+n1;
            n1=n2;
            n2=n3;

        }

    }



}

