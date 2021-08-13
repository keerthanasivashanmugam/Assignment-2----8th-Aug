package week1.day2;

public class FindTypes {
	
	public static void main(String[] args) {
		
				String test = "$$ Welcome to 2nd Class of Automation $$";

				
				int  letter = 0, num = 0, specialChar = 0;

				
				
					String[] test1 = test.split(" ");
					
					for (int i=0;i<test1.length;i++ ) {
						for(int j=test1[i].length()-1;j>=0;j--)
						{
						if(Character.isLetter(test1[i].charAt(j)))
						{
							letter++;
						}else if(Character.isDigit(test1[i].charAt(j)))
						{
							num++;
						}
						else
						{
							specialChar++;
						}
					}
					}
					
				System.out.println("letter: " + letter);
				System.out.println("space: " + (test1.length-1));
				System.out.println("number: " + num);
				System.out.println("specialCharcter: " + specialChar);
				
	}

}
