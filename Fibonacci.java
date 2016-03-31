/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Praktikum
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	System.out.print("Masukkan deret fibonacci : ");
	int n = s.nextInt();
	for(int i=1;i<=n;i++)
            System.out.print(fibo(i) + " ");
            System.out.println();
    }

    private static int fibo(int n){
        int f;
        if(n==1 || n==2)
	f=1;
	else
	f = fibo(n-1) + fibo(n-2);
	return f;
    }
}
