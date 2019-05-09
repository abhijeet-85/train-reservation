package com.narayan.abhijeet.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.narayan.abhijeet.factory.RouteFactory;
import com.narayan.abhijeet.model.Passenger;
import com.narayan.abhijeet.model.Route;
import com.narayan.abhijeet.model.Station;
import com.narayan.abhijeet.model.Ticket;
import com.narayan.abhijeet.model.Train;

public class TicketBooking {

	private List<Route> routes;
	
	private static TicketBooking instance;
	
	private TicketBooking(){}
	
	public List<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}

	public static TicketBooking getInstance(){
		if(instance == null){
			synchronized(TicketBooking.class){
				if(instance == null){
					instance = new TicketBooking();
				}
			}
		}
		return instance;
	}
	
	/*
	 * Initializes a total of 500*6=3000 routes in the system
	 * each having at max 3 trains running on them
	 */
	public void initialize(){
		System.out.println("Initializing booking counter...");
		long start = System.currentTimeMillis();
		routes = RouteFactory.getRoutes((short)500);
		System.out.println("Initialization took " + (System.currentTimeMillis() - start) + " milliseconds");
	}
	
	public List<Train> findTrain(Station source, Station destination){
		List<Train> trains = new LinkedList<>();
		for(Route r: routes){
			List<Station> stations = r.getSortedStations();
			if(stations.contains(source) && stations.contains(destination)){
				trains.addAll(r.getTrains());
			}else{
				continue;
			}
		}
		return trains;
	}
	
	public static void main(String[] args){
		TicketBooking tb = TicketBooking.getInstance();
		tb.initialize();
		
		Random rnd = new Random();
		Station[] stations = Station.values();
		int stationCount = stations.length;
		
		Station source = stations[rnd.nextInt(stationCount)];
		Station destination = stations[rnd.nextInt(stationCount)];
		
		System.out.println("Finding trains for source: " + source + " and destination: " + destination);
		long start = System.currentTimeMillis();
		List<Train> trains = tb.findTrain(stations[rnd.nextInt(stationCount)], stations[rnd.nextInt(stationCount)]);
		System.out.println("Finding trains took " + (System.currentTimeMillis() - start) + " milliseconds");
		
		for(Train t:trains){
			System.out.println(t);
		}
	}
}
