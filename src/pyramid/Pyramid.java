/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramid;

/**
 *
 * @author USER
 */
public class Pyramid {
    public static void main(String args[]) {
		for(int i=1;i<25;i++) {
			for(int j=1;j<=i ;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=25-i;k++) {
				System.out.print("* ");
			}	
		System.out.println("");
		}
		for(int i=0;i<25;i++) {
			for(int j=0;j<25-i ;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
		System.out.println("");
		}
    }
}
