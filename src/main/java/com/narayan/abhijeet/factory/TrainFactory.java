package com.narayan.abhijeet.factory;

import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.narayan.abhijeet.model.Coach;
import com.narayan.abhijeet.model.CoachClass;
import com.narayan.abhijeet.model.DaysOfWeek;
import com.narayan.abhijeet.model.Station;
import com.narayan.abhijeet.model.Train;
import com.narayan.abhijeet.utils.Constants;

public class TrainFactory {

	private TrainFactory() {}
	
	private static Random rnd = new Random();
	
	public static List<Train> getTrains(Station source, Station destination, short num){
		
		// combination 1: general 5, sleeper 10, ac3 5 ac2 2 ac1 1
		// combination 2: general 5, sleeper 2
		// combination 3: ac3 10, ac2 5
		
		List<Train> trains = new LinkedList<Train>();
		
		for(short i = 1; i <= num ; i++) {
			List<Coach> coaches = new LinkedList<Coach>();
			switch(rnd.nextInt(Constants.COACH_COMBINATIONS)) {
			case 0:
				coaches.addAll(CoachFactory.getCoaches((short)5, CoachClass.GENERAL));
				coaches.addAll(CoachFactory.getCoaches((short)10, CoachClass.SLEEPER));
				coaches.addAll(CoachFactory.getCoaches((short)5, CoachClass.AC3));
				coaches.addAll(CoachFactory.getCoaches((short)2, CoachClass.AC2));
				coaches.addAll(CoachFactory.getCoaches((short)1, CoachClass.AC1));
				EnumSet<DaysOfWeek> runsOn = EnumSet.of(DaysOfWeek.TUE, DaysOfWeek.WED, DaysOfWeek.FRI, DaysOfWeek.SAT, DaysOfWeek.SUN);
				trains.add(new Train(source, destination, coaches, runsOn));
				break;
			case 1:
				coaches.addAll(CoachFactory.getCoaches((short)5, CoachClass.GENERAL));
				coaches.addAll(CoachFactory.getCoaches((short)2, CoachClass.SLEEPER));
				EnumSet<DaysOfWeek> runsOn1 = EnumSet.of(DaysOfWeek.TUE, DaysOfWeek.WED, DaysOfWeek.FRI, DaysOfWeek.SAT);
				trains.add(new Train(source, destination, coaches, runsOn1));
				break;
			case 2:
				coaches.addAll(CoachFactory.getCoaches((short)10, CoachClass.AC3));
				coaches.addAll(CoachFactory.getCoaches((short)5, CoachClass.AC2));
				EnumSet<DaysOfWeek> runsOn2 = EnumSet.of(DaysOfWeek.MON, DaysOfWeek.THU);
				trains.add(new Train(source, destination, coaches, runsOn2));
				break;
			}
			
		}	
		return trains;
	}
}
