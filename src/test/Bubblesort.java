package test;

public class Bubblesort 
{
	public void bubblesort(int[] array)
	{
		int tmp;
		
		for (int i = 1; i < array.length; i++)
		{
			for (int j = 0; j < array.length - i; j++)
			{
				if (array[j] > array[j + 1])
				{
					tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
	}

}
