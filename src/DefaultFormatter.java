/**
 * Erin Bevec
 * APCS Period 6
 * Interface HW
 */

public class DefaultFormatter 
{
		public String format(int num) 
		{
			String number = "";
			number += num;
			for(int i = number.length()- 1; i >= 0; i--) 
			{
				if (i % 3 == 0) 
				{
					number = number.substring(0,i + 1) + "," + number.substring(i+1, number.length());
				}

			}
			if(number.charAt(number.length() - 1) == ',')
			{
				number = number.substring(0,number.length() - 1);
			}
				
			return number;
		}
}
