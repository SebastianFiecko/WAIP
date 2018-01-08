package com.ericsson.nrgsdk.examples.applications.whereami;

import java.util.ArrayList;

import com.ericsson.nrgsdk.examples.applications.whereami.Configuration;
import com.ericsson.nrgsdk.examples.applications.whereami.Feature;

public class Service {
	private Feature parent;
	private ArrayList<Worker> usersOfService;

	public Service(Feature parent) {
		this.parent = parent;

		usersOfService = new ArrayList<Worker>();
	}

	public boolean addWorker(Worker worker) {
		if (!usersOfService.contains(worker)) {
			usersOfService.add(worker);
			System.out.println("Dodano uzytkownika o numerze " + worker.getNumer());
			return true;
		}

		return false;
	}

	public boolean removeWorker(Worker worker)
	{
		if(!usersOfService.contains(worker)){
			System.out.println("Blad! Nie ma takiego uzytkownika! :( " + worker.getNumer());
			return false;
		}
		else
			usersOfService.remove(worker);
			return true;

	}
	
	public ArrayList<Worker> getUserOfService() {
		return usersOfService;
	}

}
