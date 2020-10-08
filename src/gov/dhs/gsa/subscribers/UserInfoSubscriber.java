package gov.dhs.gsa.subscribers;

import gov.dhs.gsa.app.models.Event;
import gov.dhs.gsa.app.models.Subscriber;

public class UserInfoSubscriber implements Subscriber{

	@Override
	public void notify(Event event) {
		if(event.getType().contains("USER")) {
			System.out.println("UserInfoSubscriber received a user info update notification.");
		}else {
			System.out.println("UserInfoSubscriber is ignoring notification of type " + event.getType());
		}
	}
}
