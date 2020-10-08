package gov.dhs.gsa.app;

import gov.dhs.gsa.app.models.Subscriber;
import gov.dhs.gsa.events.EventManager;
import gov.dhs.gsa.services.EventGenerator;
import gov.dhs.gsa.subscribers.UserInfoSubscriber;

public class Simulation {
	
	public static void main(String args[]) {
		EventManager.getInstance().subscribe((Subscriber) new UserInfoSubscriber());
		EventGenerator.getInstance().run();
		System.out.println("GSA Coding Challenge Executing...");
	}
}
