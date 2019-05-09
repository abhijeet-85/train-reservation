package com.narayan.abhijeet.model;

import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;

/*
 * Represents a train
 */
public class Train {

	private int trainNumber;
	
	private Station source;
	
	private Station destination;
	
	private List<Coach> coaches = new LinkedList<Coach>();
	
	private EnumSet<DaysOfWeek> runsOnDays;
	
	private static int trainCount = 0;
	
	public Train(Station source, Station destination, List<Coach> coaches, EnumSet<DaysOfWeek> runsOnDays) {
		this.trainNumber = ++trainCount;
		this.source = source;
		this.destination = destination;
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

	public EnumSet<DaysOfWeek> getRunsOnDays() {
		return runsOnDays;
	}

	public void setRunsOnDays(EnumSet<DaysOfWeek> runsOnDays) {
		this.runsOnDays = runsOnDays;
	}

	@Override
	public String toString() {
		return "Train [trainNumber=" + trainNumber + ", source=" + source + ", destination=" + destination + ", runsOnDays=" + runsOnDays + "]";
	}
}
