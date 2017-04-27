package com.all.interview;

import java.util.ArrayList;
import java.util.HashSet;

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
			if(p1.next != null && p2.next!=null && p2.next.next!=null){
			p1 = p1.next;
			p2 = p2.next.next;
			}else{
				return false;
			}
		}
		return false;
	}
	
	public String didItReturn(ArrayList<String> droneIds) {
		// TODO Auto-generated method stub
		HashSet<String> lostDroneSet = new HashSet<String>();
		for(String droneId : droneIds){
			//When an element is inserted into a set succesfully it returns true, else a false if the element is already present
			if(lostDroneSet.add(droneId)){
				
			}else{
			//When insertion fails, that means the item is already present, now remove it from the Set
				lostDroneSet.remove(droneId);
			}
		}
		
		//The left over string is the lost drone, this also returns if there are multiple lost drones
		return lostDroneSet.toString();
	}

}
