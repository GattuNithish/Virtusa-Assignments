//Write a Java Program to find the duplicate characters in a string.

package exam;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "Nithish";
		  int c = 0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[j]);
		     c++;
		     break;
		    }
		   }
		  }
	}

}
