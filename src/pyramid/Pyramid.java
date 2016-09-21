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
/*public class Pyramid {
    public static void main(String args[]) {
		int i,j,k;
		int n=25;
		for(i = 0;i<n;i++) {
			if(i%2 != 1) {
			for(j=0;j<i;j++) {
				if(j%2 != 1){
				System.out.print(" ");
			}}
			for(k=0;k<n-i;k++){
				System.out.print("*");
			}
			}
			System.out.println("");
		}
		for(i = 1;i<n;i++) {
			if(i%2 !=1) {
			for(j=1;j<n-i;j++) {
				if(j%2 != 1) {
				System.out.print(" ");
			}}
			for(k=0;k<=i;k++){
				System.out.print("*");
			}}
			System.out.println("");
		}
    }
}
*/
/*public class Pyramid {
    public static void main(String args[]) {
		int i,k;
		int n=25;
                    for(i = 0;i<n;i++) {
                            for(k=0;k<n-i;k++){
                                    if(k<i)
                                        System.out.print(" ");
                                    else
                                        System.out.print("*");
                            }
                            
                           
			System.out.println("");
                     
                    }
                     
                    }
    }

*/
public class Pyramid {
    public static void main(String args[]) {
        int i,j, n=25, s=1;
        for(i=1;i<=25;i++){
            for(j=1;j<s;j++) {
                System.out.print(" ");
            }
            for(j=1;j<=n;j++)  {
                System.out.print("*");    
            }
            
            System.out.println();
            if(i<=12){
                n = n-2;
                s = s+1;
            }
            else{
                n = n+2;
                s = s-1;
            }
        }
    }
}
                    
		
    

