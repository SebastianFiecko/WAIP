package com.ericsson.nrgsdk.examples.applications.whereami;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class Worker extends Thread
{
	private String numer;
	private String name;
	private LocalDate startedWorkAt;
	private LocalDate endedWorkAt;
	private int hoursPerDay = 8;
	private long pauseLength = 15;
	
	private LocationProcessor itsLocationProcessor;
	
	public String getNumer() 
	{
		return numer;
	}

	public Worker(String numer, String name, int hoursPerDay, LocationProcessor aLocationProcessor)
	{
		this.numer = numer;
		this.name = name;
		this.hoursPerDay = hoursPerDay;
		itsLocationProcessor = aLocationProcessor;
	}

	public long getCurrentWorkTime(){
		return ChronoUnit.HOURS.between(startedWorkAt,LocalDate.now());
	}

	public void setStartedWorkAt(LocalDate date){
		this.startedWorkAt = date;
	}

	public LocalDate getStartedWorkAt(){
		return startedWorkAt;
	}

	public LocalDate getEndedWorkAt(){
		return endedWorkAt;
	}

	public void setEndedWorkAt(LocalDate date){
		this.endedWorkAt = date;
	}

	public int getHoursPerDay(){
		return hoursPerDay;
	}

	public String getWorkerName(){
		return this.name;
	}

	public long getPauseLength(){
		return this.pauseLength;
	}

	public void checkLocalization() {
		itsLocationProcessor.requestLocation(numer);
	}
	
	public void run()
	{
		while (true)
		{
			System.out.println("Pracownik o numerze " + numer + " sprawdza swoja lokalizacje");
			itsLocationProcessor.requestLocation(numer);
			try
			{
				Thread.sleep(20000);
			}
			catch (IllegalArgumentException e)
			{
				System.out.println("IllegalArgumentException" + e.getMessage());
			}
			catch (InterruptedException e)
			{
				System.out.println("InterruptedException" + e.getMessage());
			}
		}
	}
}
