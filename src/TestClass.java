
public class TestClass 
{

	public static void main(String[] args) 
	{
		DefaultFormatter formatter = new DefaultFormatter();
		System.out.println(formatter.format(20000000));
		
		BaseTwoFormatter format = new BaseTwoFormatter();
		System.out.println(format.format(40340));

	}
	

}
