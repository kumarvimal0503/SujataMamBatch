package com.core.demo.innerclass;

public class EnumClassDemo {

	public static void main(String[]args) {
		
		UserStatus userStatus = UserStatus.ACTIVE;
		
		String userStatusStr = UserStatus.ACTIVE.toString();
		
		UserStatus status = UserStatus.valueOf("ACTIVE");

		
		UserStatus[] userStatuses = UserStatus.values();
		
		String userStatusDispVal = UserStatus.ACTIVE.getUserStatus();
		
		
	}
	
}


enum UserStatus {
	ACTIVE ("Active",000), ON_HOLD ("On Hold",400), BLOCKED ("Blocked",403);
	
	String userStatus;
	int statusCode;
	
	UserStatus(String userStatus, int statusCode) {
		this.userStatus = userStatus;
		this.statusCode = statusCode;
	}
	
	public String getUserStatus() {
		return userStatus;
	}
	
	public int getStatusCode() {
		return statusCode;
	}
}
