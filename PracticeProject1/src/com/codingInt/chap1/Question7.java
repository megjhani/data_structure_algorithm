package com.codingInt.chap1;

import java.util.ArrayList;

import com.codility.utility.UtilClass;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire
 * row and column is set to 0
 * 
 * @author MURAD
 * 
 */
public class Question7 {

	/**
	 * 
	 * @param image
	 * @return 
	 */
	public static int[][] setRowcolToZero(int[][] image){
		ArrayList<Integer> colIndex = new ArrayList<Integer>();
		ArrayList<Integer> rowIndex = new ArrayList<Integer>();
		for(int i = 0;i<image.length;i++){
			for(int j=0;j<image[i].length;j++){
				if(image[i][j]==0){
					if(!colIndex.contains(j)){
						colIndex.add(j);
					}
					if(!rowIndex.contains(i)){
						rowIndex.add(i);
					}
				}
			}
		}
		for(int i = 0;i<image.length;i++){
			for(int j=0;j<image[i].length;j++){
				if(rowIndex.contains(i) || colIndex.contains(j)){
					image[i][j]=0;
				}
			}
		}
		return image;
	}
	private static int[][] setZero(int[][] image, int i, int j) {
		// TODO Auto-generated method stub
		for(int p = 0;p<image[i].length;p++){
			image[i][p]=0;
		}
		for(int p = 0;p<image.length;p++){
			image[p][j]=0;
		}
		return image;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UtilClass util = new UtilClass();
		int[][] image = {{1,0,0,10},{4,5,6,0},{7,8,9,12},{13,14,15,16}};
		util.printMatrix(image);
		setRowcolToZero(image);
		System.out.println("********After settting row col to zero*******");
		util.printMatrix(image);
	}

}
