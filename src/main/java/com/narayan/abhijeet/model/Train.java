package com.narayan.abhijeet.model;

import java.util.LinkedList;
import java.util.List;

public class Train {

	private Station source;
	
	private Station destination;
	
	private List<Coach> coaches = new LinkedList<Coach>();
	
	private List<Station> route = new LinkedList<Station>();
	
	private Boolean[] runsOnDays = new Boolean[7];
	
	public Train(Station source, Station destination, List<Coach> coaches, List<Station> route, Boolean[] runsOnDays) {
		this.source = source;
		this.destination = destination;
		this.coaches = coaches;
		this.route = route;
		this.runsOnDays = runsOnDays;
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

	public List<Coach> getCoaches() {
		return coaches;
	}

	public void setCoaches(List<Coach> coaches) {
		this.coaches = coaches;
	}

	public List<Station> getRoute() {
		return route;
	}

	public void setRoute(List<Station> route) {
		this.route = route;
	}

	public Boolean[] getRunsOnDays() {
		return runsOnDays;
	}

	public void setRunsOnDays(Boolean[] runsOnDays) {
		this.runsOnDays = runsOnDays;
	}
}
