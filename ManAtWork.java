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

}
