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
        int a=0,b=0,hasil=1,hasil_jumlah=0;
        Scanner s = new Scanner(System.in);
	System.out.print("Masukkan deret fibonacci : ");
	int n = s.nextInt();
	for(int i=1;i<=n;i++){
            a=b;
            b=hasil;
            hasil_jumlah=hasil_jumlah+hasil;
            hasil=a+b;
        }
        System.out.println(hasil_jumlah);
    }
}
