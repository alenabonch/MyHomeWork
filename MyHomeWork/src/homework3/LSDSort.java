package homework3;

import java.util.Arrays;
import java.util.Random;

public class LSDSort {

	private static final int MAX = 1000000;

	public static void main(String[] args) {
		
		int[] data = generate();
		
        //Quick sort
        long start = System.currentTimeMillis();
        Arrays.sort(data);
        long stop = System.currentTimeMillis();
        System.out.println("(Quick Sort) Elapsed = " + (stop - start) + " ms");
        
        data = generate();
        
        //LSD sort
        start = System.currentTimeMillis();
        myLSDSort(data);

        stop = System.currentTimeMillis();

        System.out.println("(LSD sort)   Elapsed = " + (stop - start) + " ms");
//        System.out.println(Arrays.toString(data));
    
	}
	
	private static void myLSDSort(int[] a) {
        int R = 256;            // 1 byte can be from 0 to 255
        int W = 4;              // 32-bits integer is 4-bytes sequence
        int mask = R-1;         // 11111111 (0xFF)
        int N = a.length;
        int[] aux = new int[N];


        for (int d = 0; d < W; d++) {

            int[] count = new int[R+1];

            // count frequencies
            for (int i = 0; i < N; i++) {
                int tmp = (a[i] >> 8*d) & mask;
                count[tmp + 1]++;
            }

            // compute cumulates which specify destinations
            for (int r = 0; r < R; r++) {
                count[r + 1] += count[r];
            }
            
            // move items
            for (int i = 0; i < N; i++) {
                int tmp = (a[i] >> 8*d) & mask;
                aux[count[tmp]++] = a[i];
            }

            //copy back into original array
            for (int i = 0; i < N; i++) {
                a[i] = aux[i];
            }
        }
    }

	private static int[] generate() {
		int[] data = new int[MAX];
		
		Random random = new Random();
		
		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(MAX); // 0 - 999999
		}
		
		return data;
	}
	
}
