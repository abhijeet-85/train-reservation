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
import com.narayan.abhijeet.utils.Constants;

public class RouteFactory {

	private RouteFactory() {}
	
	private static short StationCount = (short) Station.values().length;
	
	private static Station[] StationValues = Station.values();
	
	private static Random rnd = new Random();
	
	public static List<Route> getRoutes(short num){
		
		List<Route> routes = new LinkedList<Route>();
		
		for(short i = 1; i <= num; i++) {
			// small route
			short stationCount = 4;
			Tuple<List<Station>, Set<Station>> tuple = getStations(stationCount);
			List<Station> stations = tuple.getT();
			Set<Station> sortedStations = tuple.getV();
			
			Station source = stations.get(0);
			Station destination = stations.get(stationCount -1);
			short trainCount = (short) rnd.nextInt(Constants.COACH_COMBINATIONS);
			List<Train> trains = TrainFactory.getTrains(source, destination, trainCount);
			routes.add(new Route(source, destination, stations, sortedStations,trains));
			
			// small and busy
			stationCount = 5;
			tuple = getStations(stationCount);
			stations = tuple.getT();
			sortedStations = tuple.getV();
			
			source = stations.get(0);
			destination = stations.get(stationCount -1);
			trainCount = (short) rnd.nextInt(Constants.COACH_COMBINATIONS);
			trains = TrainFactory.getTrains(source, destination, trainCount);
			routes.add(new Route(source, destination,stations, sortedStations, trains));
			
			// average route
			stationCount = 10;
			tuple= getStations(stationCount);
			stations = tuple.getT();
			sortedStations = tuple.getV();
			source = stations.get(0);
			destination = stations.get(stationCount -1);
			trainCount = (short) rnd.nextInt(Constants.COACH_COMBINATIONS);
			trains = TrainFactory.getTrains(source, destination, trainCount);
			routes.add(new Route(source, destination,stations, sortedStations, trains));
			
			// average and busy
			stationCount = 10;
			tuple = getStations(stationCount);
			stations = tuple.getT();
			sortedStations = tuple.getV();
			source = stations.get(0);
			destination = stations.get(stationCount -1);
			trainCount = (short) rnd.nextInt(Constants.COACH_COMBINATIONS);
			trains = TrainFactory.getTrains(source, destination,trainCount);
			routes.add(new Route(source, destination,stations, sortedStations, trains));
			
			// long route
			stationCount = 20;
			tuple = getStations(stationCount);
			stations = tuple.getT();
			sortedStations = tuple.getV();
			source = stations.get(0);
			destination = stations.get(stationCount -1);
			trainCount = (short) rnd.nextInt(Constants.COACH_COMBINATIONS);
			trains = TrainFactory.getTrains(source, destination, trainCount);
			routes.add(new Route(source, destination,stations, sortedStations, trains));
			
			// long and busy
			stationCount = 20;
			tuple = getStations(stationCount);
			stations = tuple.getT();
			sortedStations = tuple.getV();
			source = stations.get(0);
			destination = stations.get(stationCount -1);
			trainCount = (short) rnd.nextInt(Constants.COACH_COMBINATIONS);
			trains = TrainFactory.getTrains(source, destination, trainCount);
			routes.add(new Route(source, destination,stations, sortedStations, trains));
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
