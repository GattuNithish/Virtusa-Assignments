//create Java programs to check if the given number is an Armstrong number or not

package exam;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 370, originalNum, remainder, result = 0;
        originalNum = num;
        while (originalNum != 0)
        {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }   
        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");

	}

}
