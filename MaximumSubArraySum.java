package assignments;

public class MaximumSubArraySum {
	
	public static int maxSubArray(int arr[])
	{
		int maxSum=0;
		int currentSum=0;
		for(int i=0;i<arr.length;i++)
		{
			currentSum=currentSum+arr[i];
			if(maxSum<currentSum)
			{
				maxSum=currentSum;
			}
			if(currentSum<0)
			{
				currentSum=0;
			}
		}
		return maxSum;
		
	}
	
	public static void main(String[] args)
	{
		int arr[]= { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println(maxSubArray(arr));
	}

}

