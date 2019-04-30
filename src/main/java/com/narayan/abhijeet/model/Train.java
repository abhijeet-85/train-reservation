package com.narayan.abhijeet.model;

import java.util.LinkedList;
import java.util.List;

public class Train {

	private Station source;
	
	private Station destination;
	
	private List<Coach> coaches = new LinkedList<Coach>();
	
	private Boolean[] runsOnDays = new Boolean[7];
	
	public Train(List<Coach> coaches, Boolean[] runsOnDays) {
		this.coaches = coaches;
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

	public Boolean[] getRunsOnDays() {
		return runsOnDays;
	}

	public void setRunsOnDays(Boolean[] runsOnDays) {
		this.runsOnDays = runsOnDays;
	}
}
