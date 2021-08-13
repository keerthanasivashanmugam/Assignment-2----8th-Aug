package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr1 = {3,2,11,4,6,7};	
		int[] arr2 = {1,2,8,4,9,7};
		System.out.println("The Missing elements are");
		for (int i=0; i<arr1.length;i++)
		{
			for(int j=arr1.length -1; j>=0;j--)
			{
				if (arr1[i] == arr2[j])
					System.out.println (arr1[i]);
			}
		}

	}
}
