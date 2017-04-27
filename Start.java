package com.all.interview;

import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManAtWork manAtWork = new ManAtWork();
		ArrayList<String> wordList = new ArrayList<String>();
		wordList.add("accompany");
		wordList.add("boarding");
		wordList.add("complimentary");
		wordList.add("enclosed");
		wordList.add("lounge");
		wordList.add("membership");
		wordList.add("priority");
		wordList.add("refreshments");
		wordList.add("sincerely");
		wordList.add("tier");
		
		 int rotationPoint = manAtWork.getRotationPoint(wordList);
		 if(rotationPoint==-1){
			 System.out.println("Invalid list");
		 }else{
		 System.out.println(wordList.get(rotationPoint)+" at "+rotationPoint+" is the rotation point");
		 }
		 //Linked List
		 boolean hasCycle = manAtWork.contains_cycle();
		 System.out.println("Contais loop "+hasCycle);
		 
		//Drone return code
		 ArrayList<String> droneIds = new ArrayList<String>();
		 droneIds.add("12344");
		 droneIds.add("12344");
		 droneIds.add("12362");
		 droneIds.add("12363");
		 droneIds.add("12348");
		 droneIds.add("12348");
		 droneIds.add("12350");
		 droneIds.add("12350");
		 droneIds.add("12351");
		 droneIds.add("12351");
		 droneIds.add("12352");
		 droneIds.add("12352");
		 droneIds.add("12359");
		 droneIds.add("12362");
		 droneIds.add("12363");
		 String amazonStolenDrone = manAtWork.didItReturn(droneIds);
		 System.out.println(amazonStolenDrone + "is the stolen drone");
	}

}

