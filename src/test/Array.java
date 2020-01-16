package test;

public class Array 
{
	public static void main (String[] args)
	{
		int tester = 0;
		while(tester == 0)
		{
			for(int i = 0; i < 10; i++)
			{
				System.out.print(i + ",");
				
			}
			tester = (int) (Math.random ()*2);
			System.out.println();
		}
	}

}
