package com.narayan.abhijeet.factory;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.narayan.abhijeet.model.Coach;
import com.narayan.abhijeet.model.CoachClass;
import com.narayan.abhijeet.model.Train;

public class TrainFactory {

	private TrainFactory() {}
	
	private static Random rnd = new Random();
	
	public static List<Train> getTrains(short num){
		
		//new Train(source, destination, coaches, runsOnDays)
		// general 1-5 sleeper 5-10
		// ac3 1-3
		// combination 1: general 5, sleeper 10, ac3 5 ac2 2 ac1 1
		// combination 2: general 5, sleeper 2
		// combination 3: ac3 10, ac2 5
		
		List<Train> trains = new LinkedList<Train>();
		
		for(short i = 1; i <= num ; i++) {
			List<Coach> coaches = new LinkedList<Coach>();
			switch(rnd.nextInt(3)) {
			case 0:
				coaches.addAll(CoachFactory.getCoaches((short)5, CoachClass.GENERAL));
				coaches.addAll(CoachFactory.getCoaches((short)10, CoachClass.SLEEPER));
				coaches.addAll(CoachFactory.getCoaches((short)5, CoachClass.AC3));
				coaches.addAll(CoachFactory.getCoaches((short)2, CoachClass.AC2));
				coaches.addAll(CoachFactory.getCoaches((short)1, CoachClass.AC1));
				Boolean[] runsOn = {false, true, true, false, true, true, true};
				trains.add(new Train(coaches, runsOn));
				break;
			case 1:
				coaches.addAll(CoachFactory.getCoaches((short)5, CoachClass.GENERAL));
				coaches.addAll(CoachFactory.getCoaches((short)2, CoachClass.SLEEPER));
				Boolean[] runsOn1 = {false, true, true, false, true, true, true};
				trains.add(new Train(coaches, runsOn1));
				break;
			case 2:
				coaches.addAll(CoachFactory.getCoaches((short)10, CoachClass.AC3));
				coaches.addAll(CoachFactory.getCoaches((short)5, CoachClass.AC2));
				Boolean[] runsOn2 = {false, true, true, false, true, true, true};
				trains.add(new Train(coaches, runsOn2));
				break;
			}
			
		}	
		return trains;
	}
}
