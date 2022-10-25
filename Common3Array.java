package jeni;

import java.util.Arrays;

public class Common3Array {

	public static void main(String[] args) {
		int[] A = { 2, 10, 8, 4, 6, 9 };
		int[] B = { 8, 4, 11, 1, 2 };
		int[] C = { 6, 14, 8, 2, 4, 11 };
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				for (int k = 0; k < C.length; k++) {
					if (A[i] == B[j] && B[j] == C[k] && C[k] == A[i])
						System.out.println("Common array is:"+A[i]);

				}
			}

		}
	}

}
