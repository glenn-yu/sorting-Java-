import java.util.Arrays;

/**
 * 
 */

/**
 * <PRE>
 * 1. FileName    : BubbleSort.java
 * 2. Package     : 
 * 3. Comment     :
 * 4. Author      : Yong
 * 5. Create Date : 2020. 6. 16. 오전 11:32:54
 * </PRE>
 */
public class BubbleSort {
	
	public BubbleSort(int[] numbers) 
	{
		boolean numbersSwitched;
		
		do {
			numbersSwitched = false;
			for( int i=0; i < numbers.length - 1; i++)
			{
				System.out.println("Key1 : " + numbers[i+1] + " | Key2 : " + numbers[i] + " > list : " + Arrays.toString(numbers));
				if(numbers[i+1] < numbers[i])
				{
					int temp = numbers[i+1];
					numbers[i+1] = numbers[i];
					numbers[i] = temp;
					numbersSwitched = true;
				}
			}
		} while (numbersSwitched);
	}
}
