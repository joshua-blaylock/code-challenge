package gov.dhs.gsa.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import gov.dhs.gsa.app.models.Event;
import gov.dhs.gsa.events.EventManager;

public class EventGenerator {
	
	private static final EventGenerator instance = new EventGenerator();
	
	private EventGenerator() {}
	
	private List<Event> events = loadMockEvents();
	
	private List<Event> loadMockEvents(){
		List<Event> eventList = new ArrayList<Event>();
		
		Event event1 = new Event();
		event1.setType("USER_DATA");
		event1.setDescription("The user data has been updated and users should be notified");
		eventList.add(event1);
		
		Event event2 = new Event();
		event2.setType("RANDOM");
		event2.setDescription("This is a random update that should not be sent to users");
		eventList.add(event2);
		
		return eventList;
	}
	
	private Event getRandomEvent() {
		Random random = new Random();
		int low = 0;
		int high = events.size();
		int result = random.nextInt(high-low) + low;
		return events.get(result);
	}
	
	public static EventGenerator getInstance() {
		return instance;
	}
	
	public void run() {
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Event Generator is Executing");
				
				while(true) {
					try {
						EventManager.getInstance().publish(getRandomEvent());
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		}).start();
	}
}
