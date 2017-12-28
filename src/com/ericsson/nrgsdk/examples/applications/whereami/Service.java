package com.ericsson.nrgsdk.examples.applications.whereami;

import java.util.ArrayList;

import com.ericsson.nrgsdk.examples.applications.whereami.Configuration;
import com.ericsson.nrgsdk.examples.applications.whereami.Feature;

public class Service 
{
	private Feature parent;
	private ArrayList<Worker> usersOfService;
	
	public Service(Feature parent)
	{
		this.parent = parent;
		
		usersOfService = new ArrayList<Worker>();
	}
	
	public boolean addWorker(Worker worker)
	{
		if (!usersOfService.contains(worker))
		{
			usersOfService.add(worker);
			System.out.println("Dodano u�ytkownika o numerze " + worker.getNumer());
			return true;
		}
		
		return false;
	}
	
	public ArrayList<Worker> getUserOfService() {
		return usersOfService;
	}

}
