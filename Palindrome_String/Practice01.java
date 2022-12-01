public class Practice01 
{
	public static void main(String[]args)
	{
		String NAME = "RADAR";
		String REV = "";
		
		for(int i=NAME.length()-1; i>=0; i--)
		{
			REV = REV+NAME.charAt(i);
		}
		
		if(NAME.equals(REV))
		{
			System.out.println(" Given String "+NAME+" is Palindrome");
		}
		else
		{
			System.out.println(" Given String "+NAME+" is not Palindrome");
		}
		
		
		
		
	}
	

}
