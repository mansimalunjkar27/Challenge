import java.util.*;
public class Firstproblem {
	static int findLengthOfShortestSubarray(int arr[],int N)
	{
	  int minlength = Integer.MAX_VALUE;
	 
	  int left = 0;
	  int right = N - 1;
	  while (left < right &&
	         arr[left + 1] >= arr[left])
	  {
	    left++;
	  }
	  if (left == N - 1)
	    return 0;
	  while (right > left &&
	         arr[right - 1] <= arr[right])
	  {
	    right--;
	  }
	 
	  minlength = Math.min(N - left - 1,right);
	  int j = right;
	  for (int i = 0; i < left + 1; i++)
	  {
	    if (arr[i] <= arr[j])
	    {
	      
	      minlength = Math.min(minlength,
	                           j - i - 1);
	    }
	    else if (j < N - 1)
	    {
	      j++;
	    }
	    else
	    {
	      break;
	    }
	  }
	 
	  
	  return minlength;
	}
	public static void main(String[] args)
	{
	  int arr[] = {1};
	  int N = arr.length;
	  System.out.print(
	         (findLengthOfShortestSubarray(arr, N)));
	}
}

