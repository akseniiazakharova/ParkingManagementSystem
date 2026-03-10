package Rechnen;


public class rechnen {

	public static void main(String[] args) {
		Integer nums[] = {-5, 0, 3, 5, 9, 12};
		int links = 0;
		int rechts = nums.length -1;
		int target = 9;
	
	
		while (links<=rechts) {
			int mitte = links + ((rechts-links)/2);
			if (nums[mitte] == target) {
				System.out.println(mitte);
				return;
				
			} 
			if (nums[mitte] > target) {
				rechts = mitte - 1;
				
			}else {
				links = mitte + 1;
			}
				
			
			
		}
		System.out.println("-1");
		
		
		
		
		

	}

}
