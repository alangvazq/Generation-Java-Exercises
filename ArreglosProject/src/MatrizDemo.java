import java.util.Arrays;

public class MatrizDemo {

	public static void main(String[] args) {
		int matriz[][] = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14},
		};
		
		
		for (int ren = 0; ren < matriz.length; ren++) {
			for (int col = 0; col < matriz[ren].length; col++) {
				System.out.print(matriz[ren][col]+", ");
			}
			System.out.println();
		}
		
		int[] nums = new int[5];
		nums[0]=1;
		nums[1]=20;
		nums[2]=14;
		nums[3]=8;
		nums[4]=84;
		
		//nums = new int[6];
		//nums[5]=1;
		
		for (int n : nums) {
			System.out.println(n);
		}
		
		nums = Arrays.copyOf(nums, 6);
		nums[5]=99;
		
		for (int n : nums) {
			System.out.println(n);
		}
			
		}

	}
