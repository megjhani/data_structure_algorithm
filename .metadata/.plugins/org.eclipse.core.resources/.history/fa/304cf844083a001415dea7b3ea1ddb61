package com.codingInt.chap1;

import com.codility.utility.UtilClass;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is
 * 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
 * place?
 * 
 * @author MURAD
 * 
 */
public class Question6 {

	public static int[][] roatebyNienty(int[][] image){
		for(int i = 0;i<image.length;i++){
			for(int j=i;j<image[i].length;j++){
				int temp = image[i][j];
				image[i][j]=image[j][i];
				image[j][i]=temp;
			}
		}
		//printMatrix(image);
		return image;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UtilClass util = new UtilClass();
		int[][] image = {{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}};
		util.printMatrix(image);
		roatebyNienty(image);
		System.out.println("After");
		util.printMatrix(image);
	}

}
