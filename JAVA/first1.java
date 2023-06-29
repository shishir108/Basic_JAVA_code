//normal calculator

import java.util.Scanner;

class first1{
    public static void main(String[] args) {
        //System.out.print("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number :");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number :");
        int b = sc. nextInt();
        System.out.println("The Sum is :"+(a+b));
        System.out.println("The Sub is :"+(a-b));
        System.out.println("The Multi is :"+(a*b));
        System.out.println("The Div is :"+(a/b));
    }
}