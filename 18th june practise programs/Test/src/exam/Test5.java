//Reverse words of a sentence

package exam;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated 
String s[] = "This is the program for reversing words in a string".split(" ");
String ans = "";
for (int i = s.length - 1; i >= 0; i--)
{
ans += s[i] + " ";
}
System.out.println("Reversed String: " + ans.substring(0,ans.length() - 1));

	}

}
