package gov.dhs.gsa.app.database;

import gov.dhs.gsa.app.models.User;

public class InMemoryUserData {
	
	private InMemoryUserData instance = new InMemoryUserData();
	
	private InMemoryUserData() {}
	
	public InMemoryUserData getInstance() {
		return instance;
	}
	
	public User getUserData() {
		User user = new User();
		user.setFname("John");
		user.setLname("Smith");
		user.setAddress("123 South Street, Cumberland MD");
		user.setDepartment("Shipping");
		return user;
	}

}
