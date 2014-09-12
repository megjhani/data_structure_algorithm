package com.codingInt.chap2;

import com.codility.utility.LinkedListNode;
import com.codility.utility.UtilMethods;
import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

/**
 * Write code to remove duplicates from an unsorted linked list. FOLLOW UP How
 * would you solve this problem if a temporary buffer is not allowed?
 * 
 * @author MURAD
 * 
 */
public class Question2 {

	public static void removeDuplicate(LinkedListNode linkList){
		LinkedListNode prev = null;
		Hashtable table  = new Hashtable();
		while(linkList !=null){
			if(table.containsKey(linkList.data)){
				prev.next = linkList.next;
			}else{
				table.put(linkList.data, 0);
				prev = linkList;
			}
			linkList = linkList.next;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode head = UtilMethods.randomLinkedList(10, 0, 10);
		System.out.println(head.printForward());
		removeDuplicate(head);
		System.out.println(head.printForward());

	}

}
