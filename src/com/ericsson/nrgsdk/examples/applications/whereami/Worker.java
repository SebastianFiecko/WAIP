package com.ericsson.nrgsdk.examples.applications.whereami;

import java.time.LocalDateTime;
import java.util.Date;

public class Worker extends Thread
{
	private String numer;
	private String name;
	private Date startedWorkAt;
	private Date endedWorkAt;
	private int hoursPerDay = 8;
	
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
		Date currentTime = new Date();
		return currentTime.getTime() - startedWorkAt.getTime();
	}

	public void setStartedWorkAt(Date date){
		this.startedWorkAt = date;
	}

	public Date getStartedWorkAt(){
		return startedWorkAt;
	}

	public Date getEndedWorkAt(){
		return endedWorkAt;
	}

	public void setEndedWorkAt(Date date){
		this.endedWorkAt = date;
	}

	public int getHoursPerDay(){
		return hoursPerDay;
	}

	public String getWorkerName(){
		return this.name;
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
