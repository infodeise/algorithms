package algorithms_study;

//EqulibriumIndex
//For example, consider the following array A consisting of N = 8 elements:
//
//	  A[0] = -1
//	  A[1] =  3
//	  A[2] = -4
//	  A[3] =  5
//	  A[4] =  1
//	  A[5] = -6
//	  A[6] =  2
//	  A[7] =  1
//	P = 1 is an equilibrium index of this array, because:
//
//	A[0] = -1 = A[2] + A[3] + A[4] + A[5] + A[6] + A[7]
//	P = 3 is an equilibrium index of this array, because:
//
//	A[0] + A[1] + A[2] = -2 = A[4] + A[5] + A[6] + A[7]
//	P = 7 is also an equilibrium index, because:
//
//	A[0] + A[1] + A[2] + A[3] + A[4] + A[5] + A[6] = 0
public class EqulibriumIndex {

	public static void main(String[] args) {
		int[] A = { -1, 3, -4, 5, 1, -6, 2, 1 };
		System.out.println(equilibriumIndex(A));

	}

	public static int equilibriumIndex(int[] A) {
		int sum = 0;
		int sum2 = 0;
		int index = -1;

		for (int i = 0; i < A.length; i++) {
			if (i == 0) {
				sum = Sum(i + 1, A.length, A);
			} else if (i == A.length - 1) {
				sum = Sum(i, A.length - 1, A);
			} else {
				sum = Sum(0, i - 1, A);
				sum2 = Sum(i + 1, A.length, A);
			}

			if (sum == sum2 || (sum + sum2) == 0) {
				return i;
			}
		}

		return index;

	}

	public static int Sum(int positionStart, int positionEnd, int[] vector) {
		int resultSum = 0;
		if (positionStart == positionEnd)
			return vector[positionStart];

		for (int i = positionStart; i < positionEnd; i++) {
			resultSum += vector[i];
		}
		return resultSum;
	}
}