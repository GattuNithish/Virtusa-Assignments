//Write a Java Program to reverse a string without using String inbuilt function

package exam;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello world";
		  String revString = "";

		  for (int i = str.length() - 1; i >= 0; --i) {
		   revString += str.charAt(i);
		  }

		  System.out.println(revString);

	}

}
