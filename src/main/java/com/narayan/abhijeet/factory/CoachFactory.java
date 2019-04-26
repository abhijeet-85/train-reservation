package com.narayan.abhijeet.factory;

import java.util.LinkedList;
import java.util.List;

import com.narayan.abhijeet.model.Coach;
import com.narayan.abhijeet.model.CoachClass;

public class CoachFactory {

	private CoachFactory() {}
	
	public static List<Coach> getCoaches(short num, CoachClass coachClass){
		List<Coach> coaches = new LinkedList<Coach>();
		
		for (short i = 1; i <= num; i++) {
			coaches.add(new Coach(i, coachClass, SeatFactory.getSeats(coachClass)));
		}
		return coaches;
	}
}
