//Java program to print the following patterns

package exam;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int z=1;
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--) {
				System.out.print(" ");
			}
		for(int k=0;k<z;k++) {
			System.out.print(z-i);
		}
		z+=2;
		System.out.println();
		}

	}

}
