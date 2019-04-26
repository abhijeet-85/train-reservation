package com.narayan.abhijeet.factory;

import java.util.LinkedList;
import java.util.List;

import com.narayan.abhijeet.model.Berth;
import com.narayan.abhijeet.model.Coach;
import com.narayan.abhijeet.model.CoachClass;
import com.narayan.abhijeet.model.Seat;

public class SeatFactory {

	private SeatFactory() {}
	
	public static List<Seat> getSeats(CoachClass coachClass){
		
		List<Seat> seats = new LinkedList<Seat>();
		
		
		if (CoachClass.GENERAL.equals(coachClass) || CoachClass.SLEEPER.equals(coachClass) || CoachClass.AC3.equals(coachClass)) {
			for (short seatNo = 1; seatNo <= 72; seatNo++) {
				switch (seatNo % 8) {
				case 1:
				case 4:
					seats.add(new Seat(seatNo, Berth.LOWER));
					break;
				case 2:
				case 5:
					seats.add(new Seat(seatNo, Berth.MIDDLE));
					break;
				case 3:
				case 6:
					seats.add(new Seat(seatNo, Berth.UPPER));
					break;
				case 7:
					seats.add(new Seat(seatNo, Berth.SIDE_LOWER));
					break;
				case 0:
					seats.add(new Seat(seatNo, Berth.SIDE_UPPER));
					break;
				}
			} 
		}else if(CoachClass.AC2.equals(coachClass) || CoachClass.AC1.equals(coachClass)) {
			for (short seatNo = 1; seatNo <= 54; seatNo++) {
				switch (seatNo % 6) {
				case 1:
				case 3:
					seats.add(new Seat(seatNo, Berth.LOWER));
					break;
				case 2:
				case 4:
					seats.add(new Seat(seatNo, Berth.UPPER));
					break;
				case 5:
					seats.add(new Seat(seatNo, Berth.SIDE_LOWER));
					break;
				case 0:
					seats.add(new Seat(seatNo, Berth.SIDE_UPPER));
					break;
				}
			} 
		}
		return seats;
	}
}
