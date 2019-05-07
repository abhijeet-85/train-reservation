package com.narayan.abhijeet.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Route {

	private Station source;
	
	private Station destination;
	
	private List<Station> stations = new LinkedList<Station>();
	
	private List<Train> trains = new LinkedList<Train>();
	
	private List<Station> sortedStations = new LinkedList<Station>();

	public Route(Station source, Station destination, List<Station> stations, Set<Station> sortedStations, List<Train> trains) {
		this.source = source;
		this.destination = destination;
		this.stations= stations;
		this.sortedStations = new LinkedList<>(sortedStations);
		this.trains = trains;
	}
	
	public Station getSource() {
		return source;
	}

	public void setSource(Station source) {
		this.source = source;
	}

	public Station getDestination() {
		return destination;
	}

	public void setDestination(Station destination) {
		this.destination = destination;
	}

	public List<Station> getStations() {
		return stations;
	}

	public void setStations(List<Station> stations) {
		this.stations = stations;
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}

	public List<Station> getSortedStations() {
		return sortedStations;
	}

	public void setSortedStations(List<Station> sortedStations) {
		this.sortedStations = sortedStations;
	}
	
	
}
