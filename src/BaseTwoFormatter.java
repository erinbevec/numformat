/**
 * Erin Bevec
 * APCS Period 6
 * Interface HW
 */
public class BaseTwoFormatter 
{
	public String format(int num) 
	{
		String binary = "";
		int remainder;
		while (num != 0)
		{
			remainder = num % 2;
			num = num / 2;
			binary += remainder;
		}
		return binary;
	}
}
