package com.codility.timecomplexity;

import java.util.HashMap;

/**
 * 
 * @author MURAD
 * 
	 * A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
	Your goal is to find that missing element.
	Write a function:
	int solution(int A[], int N);
	that, given a zero-indexed array A, returns the value of the missing element.
	For example, given array A such that:
	  A[0] = 2
	  A[1] = 3
	  A[2] = 1
	  A[3] = 5
	the function should return 4, as it is the missing element.
	Assume that:
	N is an integer within the range [0..100,000];
	the elements of A are all distinct;
	each element of array A is an integer within the range [1..(N + 1)].
	Complexity:
	expected worst-case time complexity is O(N);
	expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
	Elements of input arrays can be modified.
 *
 */
public class PermMissingElement {

	
	public static int solution(int[] A){
		int missingelem = 0;
		int []totElem = new int[A.length];
		for(int i=0;i<A.length;i++){
			int val = A[i];
			//System.out.println(val);
			if(val-1<A.length){
				totElem[val-1]=val;
//				int temp = A[val-1];
//				A[val-1]=val;
//				A[i]=temp;
			}
		}
		for (int i = 0; i < A.length; i++) {
			//System.out.println(totElem[i]);
			if (totElem[i] == 0) {
				missingelem = i + 1;
				break;
			}
		}
		if (missingelem == 0) {
			missingelem = A.length + 1;
		}

		return missingelem;
		
	}
	
	
	public static int solution2(int[] A){
		int missingelem = 0;
		int []totElem = new int[A.length];
		for(int i=0;i<A.length;i++){
			int val = A[i];
			//System.out.println(val);
			if(val-1<A.length){
				totElem[val-1]=val;
//				int temp = A[val-1];
//				A[val-1]=val;
//				A[i]=temp;
			}
		}
		for (int i = 0; i < A.length; i++) {
			//System.out.println(totElem[i]);
			if (totElem[i] == 0) {
				missingelem = i + 1;
				break;
			}
		}
		if (missingelem == 0) {
			missingelem = A.length + 1;
		}

		return missingelem;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] A = {2, 4, 3, 5};
			System.out.println(solution(A));
	}

}
