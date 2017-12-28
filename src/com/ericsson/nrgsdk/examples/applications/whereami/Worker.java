package com.ericsson.nrgsdk.examples.applications.whereami;

import java.time.LocalDateTime;
import java.util.Date;

public class Worker extends Thread
{
	private String numer;
	private Date startedWorkAt;
	private Date endedWorkAt;
	
	private LocationProcessor itsLocationProcessor;
	
	public String getNumer() 
	{
		return numer;
	}

	public Worker(String numer, LocationProcessor aLocationProcessor)
	{
		this.numer = numer;
		itsLocationProcessor = aLocationProcessor;
	}

	public long getCurrentWorkTime(){
		
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
