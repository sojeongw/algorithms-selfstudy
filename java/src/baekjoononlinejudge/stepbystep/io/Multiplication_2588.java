package baekjoononlinejudge.stepbystep.io;

import java.util.Scanner;

public class Multiplication_2588 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    
        System.out.println(a*(b%100%10));
        System.out.println(a*(b%100/10));
        System.out.println(a*(b/100));
        System.out.println((a*(b/100))*100 + (a*(b%100/10))*10 + a*(b%100%10));
    }
}
