package homework2;

import java.util.Arrays;

public class ArraysDeepCopy {

	public static void main(String[] args) {
		
		int[][] original = {
				{1,2,3},	
				{4,5,6},	
				{7,8,9},	
		};						
		int[][] copy = deepCopy1(original);
		System.out.println("Original before changing copy" + Arrays.deepToString(original));
		copy[2][0] = 0;
		copy[2][1] = 0;
		copy[2][2] = 0;
		System.out.println("Original after changing copy " + Arrays.deepToString(original));
		System.out.println("Copy is                      " + Arrays.deepToString(copy));	

	}

	private static int[][] deepCopy1(int[][] original) {
		int[][] copy = new int[original.length][];
		
		for (int i = 0; i < copy.length; i++) {
			copy[i] = Arrays.copyOf(original[i], original.length);
		}		
		return copy;		
	}
	
	private static int[][] deepCopy2(int[][] original) {
		int[][] copy = new int[original.length][];
	
		for (int i = 0; i < copy.length; i++) {
			int[] member = new int[original[i].length];
			System.arraycopy(original[i], 0, member, 0, original[i].length);
			copy[i] = member;
		}		
		return copy;		
	}

}
