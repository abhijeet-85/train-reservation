package com.narayan.abhijeet.service;

import java.util.LinkedList;
import java.util.List;

import com.narayan.abhijeet.factory.RouteFactory;
import com.narayan.abhijeet.model.Passenger;
import com.narayan.abhijeet.model.Route;
import com.narayan.abhijeet.model.Station;
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

	public TicketBooking getInstace(){
		if(instance == null){
			synchronized(TicketBooking.class){
				if(instance == null){
					instance = new TicketBooking();
				}
			}
		}
		return instance;
	}
	
	public void initialize(){
		routes = RouteFactory.getRoutes((short)500);
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
}
