package com.codility.timecomplexity;
import java.lang.Math;
/**
 * 
 * @author MURAD
 *A non-empty zero-indexed array A consisting of N integers is given. Array A represents numbers on a tape.
Any integer P, such that 0 < P < N, splits this tape into two non−empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
For example, consider array A such that:
  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
We can split this tape in four places:
P = 1, difference = |3 − 10| = 7 
P = 2, difference = |4 − 9| = 5 
P = 3, difference = |6 − 7| = 1 
P = 4, difference = |10 − 3| = 7 
Write a function:
class Solution { public int solution(int[] A); }
that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.
For example, given:
  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
the function should return 1, as explained above.
Assume that:
N is an integer within the range [2..100,000];
each element of array A is an integer within the range [−1,000..1,000].
Complexity:
expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
**/





public class TapeEquilibrium {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A = {-67,81,28,-52,-81,44,50,-54,-11,-38,82,-64,30,3,23,-62,-8,-51,13,88,-76,-51,-75,32,74,5,90,-94,-94,96,-22,-96,-16,54,-82,-33,37,9,85,61,78,100,-83,-77,33,-44,-2,-30,19,-37,-56,-22,15,55,59,16,-22,26,-13,-2,-54,20,-35,-46,39,-15,-11,63,-35,70,-74,-55,-49,75,56,100,75,86,17,95,-29,87,-49,-52,7,38,-79,30,-94,-23,90,-43,37,36,9,7,-86,3,-30,-86};
		

		int totalSum = 0;
		int minCount = 0;
		for(int i =0; i<A.length;i++){
			totalSum = totalSum + A[i];
		}
		minCount = Integer.MAX_VALUE ;;
		int rightVal = 0 ;
		int leftVal = 0 ;
		for(int i =0;i<A.length-1;i++){
			 rightVal = totalSum - A[i];
			 leftVal = leftVal + A[i];
			 int diff = Math.abs(rightVal-leftVal);
			 if(diff < minCount){
				 minCount = diff;
			 }			 
			 totalSum = rightVal;
		}
		System.out.println(minCount);
	}

}
