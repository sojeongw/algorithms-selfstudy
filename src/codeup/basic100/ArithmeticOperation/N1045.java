package CodeUp.Basic100.ArithmeticOperation;

import java.util.Scanner;

public class N1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc. nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.format("%.02f",(float)a/b);
    }
}
