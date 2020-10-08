package gov.dhs.gsa.events;

import java.util.ArrayList;
import java.util.List;

import gov.dhs.gsa.app.models.Event;
import gov.dhs.gsa.app.models.Subscriber;

public class EventManager {
	
	private static final EventManager instance = new EventManager();
	private List<Subscriber> subscribers = new ArrayList<Subscriber>();
	
	private EventManager() {
		
	}
	
	public static EventManager getInstance() {
		return instance;
	}
	
	public boolean subscribe(Subscriber subscriber) {
		
		if(!subscribers.contains(subscriber)) {
			subscribers.add(subscriber);
		}
		
		return true;
	};
	
	public void publish(Event event) {
		for(Subscriber subscriber:subscribers) {
			subscriber.notify(event);
		}
	};
}
