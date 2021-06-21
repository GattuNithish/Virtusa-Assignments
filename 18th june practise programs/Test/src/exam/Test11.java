//Write a Java Program to remove all white spaces from a string.

package exam;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="R e mo ve whi te spa c es";  
		
		System.out.println(str);
         
        str = str.replaceAll("\\s+", "");  
          
        System.out.println("String after removing all the white spaces : " + str);

	}

}
