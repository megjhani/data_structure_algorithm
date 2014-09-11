package com.codility;

import com.codility.Tree;

// you can also use imports, for example:
// import java.math.*;
public class TreeHeight {

	public int solution(Tree T) {
		// write your code in Java SE 7
		return calcHeight(T) - 1;
	}

	public int calcHeight(Tree T) {
		Tree left = T.l;
		Tree right = T.r;
		int leftHeight = 1;
		int rightHeight = 1;
		if (left != null) {
			leftHeight += calcHeight(left);
		}
		if (right != null) {
			rightHeight += calcHeight(right);
		}
		if (leftHeight > rightHeight) {
			return leftHeight;
		}
		return rightHeight;
	}
}