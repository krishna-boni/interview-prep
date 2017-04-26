package com.all.interview;

import java.util.ArrayList;

public class ManAtWork {

	public int getRotationPoint(ArrayList<String> wordList) {

		int i=0;
		long wordListSize = wordList.size();
		if(wordListSize==0){
			return -1;
		}else if(wordListSize==1){
			return 0;
		}
		int firstWordCharValue = (int)(wordList.get(i).charAt(0));
		for(i=1;i<wordListSize;i++){
			int nextWordCharValue = (int)(wordList.get(i).charAt(0));
			if(firstWordCharValue>nextWordCharValue){
				return i;
			}
		}
		return 0;
			
	}
	
	public boolean contains_cycle(){
		Node head = new Node("Tom");
		Node one = new Node("Dick");
		Node two = new Node("Harry");
		Node three = new Node("Jim");
		Node four = new Node("Harley");
		Node five = two;//Comment this line to remove loop
		
		head.next = one;
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;//Change five to null when removing loop 
		
		Node p1 = head, p2 = head.next.next;
		//Runner logic, p1 is slow runner and p2 is fast runner
		while(p2!=null){
			if(p1==p2){
				return true;
			}
			//p1 would never be null, p2 would encounter null before p1
			if(p2.next!=null && p2.next.next!=null){
			p1 = p1.next;
			p2 = p2.next.next;
			}else{
				return false;
			}
		}
		return false;
	}

}
