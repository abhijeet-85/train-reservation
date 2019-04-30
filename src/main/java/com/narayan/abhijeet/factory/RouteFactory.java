package com.narayan.abhijeet.factory;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.narayan.abhijeet.model.Route;
import com.narayan.abhijeet.model.Station;
import com.narayan.abhijeet.model.Train;

public class RouteFactory {

	private RouteFactory() {}
	
	private static short StationCount = (short) Station.values().length;
	
	private static Station[] StationValues = Station.values();
	
	private static Random rnd = new Random();
	
	public static List<Route> getRoutes(short num){
		
		List<Route> routes = new LinkedList<Route>();
		
		for(short i = 1; i <= num; i++) {
			// small route
			List<Station> stations = getStations((short)4);
			List<Train> trains = TrainFactory.getTrains((short)2);
			routes.add(new Route(stations.get(0), stations.get(stations.size() -1),stations, trains));
			
			// small and busy
			stations = getStations((short)5);
			trains = TrainFactory.getTrains((short)10);
			routes.add(new Route(stations.get(0), stations.get(stations.size() -1),stations, trains));
			
			// average route
			stations = getStations((short) 10);
			trains = TrainFactory.getTrains((short)3);
			routes.add(new Route(stations.get(0), stations.get(stations.size() -1),stations, trains));
			
			// average and busy
			stations = getStations((short) 10);
			trains = TrainFactory.getTrains((short)12);
			routes.add(new Route(stations.get(0), stations.get(stations.size() -1),stations, trains));
			
			// long route
			stations = getStations((short) 20);
			trains = TrainFactory.getTrains((short)5);
			routes.add(new Route(stations.get(0), stations.get(stations.size() -1),stations, trains));
			
			// long and busy
			stations = getStations((short) 20);
			trains = TrainFactory.getTrains((short)12);
			routes.add(new Route(stations.get(0), stations.get(stations.size() -1),stations, trains));
		}
		
		return routes;
	}
	
	public static List<Station> getStations(short num){
		List<Station> stations = new LinkedList<Station>();
		
		for(short i = 1; i<= num; i++) {
			stations.add(StationValues[rnd.nextInt(StationCount)]);
		}
		return stations;
	}
}
