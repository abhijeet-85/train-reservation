package com.narayan.abhijeet.factory;

import java.util.LinkedList;
import java.util.List;

import com.narayan.abhijeet.model.Coach;
import com.narayan.abhijeet.model.CoachClass;
import com.narayan.abhijeet.utils.Constants;

public class CoachFactory {

	private CoachFactory() {}
	
	public static List<Coach> getCoaches(short num, CoachClass coachClass){
		List<Coach> coaches = new LinkedList<Coach>();
		
		for (short i = 1; i <= num; i++) {
			if(CoachClass.AC1.equals(coachClass) || CoachClass.AC2.equals(coachClass)){
				coaches.add(new Coach(i, coachClass, new boolean[Constants.MAX_SEATS_IN_AC1_OR_AC2]));
			}else{
				coaches.add(new Coach(i, coachClass, new boolean[Constants.MAX_SEATS_IN_GENERAL_OR_AC3_OR_AC2]));
			}
			
		}
		return coaches;
	}
}
