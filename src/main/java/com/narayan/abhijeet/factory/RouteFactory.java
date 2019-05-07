package com.narayan.abhijeet.factory;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import com.narayan.abhijeet.model.Route;
import com.narayan.abhijeet.model.Station;
import com.narayan.abhijeet.model.Train;
import com.narayan.abhijeet.model.Tuple;

public class RouteFactory {

	private RouteFactory() {}
	
	private static short StationCount = (short) Station.values().length;
	
	private static Station[] StationValues = Station.values();
	
	private static Random rnd = new Random();
	
	public static List<Route> getRoutes(short num){
		
		List<Route> routes = new LinkedList<Route>();
		
		for(short i = 1; i <= num; i++) {
			// small route
			Tuple<List<Station>, Set<Station>> tuple = getStations((short)4);
			List<Station> stations = tuple.getT();
			Set<Station> sortedStations = tuple.getV();
			
			List<Train> trains = TrainFactory.getTrains((short)2);
			routes.add(new Route(stations.get(0), stations.get(stations.size() -1), stations, sortedStations,trains));
			
			// small and busy
			tuple = getStations((short)5);
			stations = tuple.getT();
			sortedStations = tuple.getV();
			trains = TrainFactory.getTrains((short)10);
			routes.add(new Route(stations.get(0), stations.get(stations.size() -1),stations, sortedStations, trains));
			
			// average route
			tuple= getStations((short) 10);
			stations = tuple.getT();
			sortedStations = tuple.getV();
			trains = TrainFactory.getTrains((short)3);
			routes.add(new Route(stations.get(0), stations.get(stations.size() -1),stations, sortedStations, trains));
			
			// average and busy
			tuple = getStations((short) 10);
			stations = tuple.getT();
			sortedStations = tuple.getV();
			trains = TrainFactory.getTrains((short)12);
			routes.add(new Route(stations.get(0), stations.get(stations.size() -1),stations, sortedStations, trains));
			
			// long route
			tuple = getStations((short) 20);
			stations = tuple.getT();
			sortedStations = tuple.getV();
			trains = TrainFactory.getTrains((short)5);
			routes.add(new Route(stations.get(0), stations.get(stations.size() -1),stations, sortedStations, trains));
			
			// long and busy
			tuple = getStations((short) 20);
			stations = tuple.getT();
			sortedStations = tuple.getV();
			trains = TrainFactory.getTrains((short)12);
			routes.add(new Route(stations.get(0), stations.get(stations.size() -1),stations, sortedStations, trains));
		}
		
		return routes;
	}
	
	@SuppressWarnings("unchecked")
	public static Tuple<List<Station>, Set<Station>> getStations(short num){
		
		List<Station> stations = new LinkedList<>();
		Set<Station> sortedStations = new TreeSet<>();
		
		for(short i = 1; i<= num; i++){
			
			Station tmp = StationValues[rnd.nextInt(StationCount)];
			stations.add(tmp);
			sortedStations.add(tmp);
		}
		return new Tuple(stations,sortedStations);
	}
}
