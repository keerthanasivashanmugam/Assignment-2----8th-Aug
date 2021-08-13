package week1.day2;

public class MissingElementInAnArray {

	public static void main(String[] args) {
				
	//	int[]  arr1= { 101, 102, 103, 105, 106};
		int[] arr1 = {1,2,3,4,7,6,8};
		//Arrays.sort(arr1);
		int count = arr1[0];
		for (int i=0;i<arr1.length;i++)
		{
		if(count == arr1[i]) {
			
		}else
		{	
		System.out.println("Missing no :" +count);
        break;
		}
		count ++;
		}
	}
}
