/**
 * Erin Bevec
 * APCS Period 6
 * Interface HW
 */
import java.util.ArrayList;
public class DecimalFormatter
{
	public String format(int num) 
	{
		String number = "";
		number += num;
		for(int i = number.length()- 1; i >= 0; i--) 
		{
			if ((number.charAt(i) + 1) % 3 == 0) 
			{
				number = number.substring(0,i) + "." + number.substring(i+1, number.length() - 1);
			}
		}
		return number;
	}
}
