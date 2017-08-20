package com.base.common.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Utils {
	private static final Map<String,User> userMap = new HashMap<String, User>();
	public static void addUser(User user){
		userMap.put(user.getUserName(), user);
		//System.out.println(user + "  " + user.getUserName().hashCode());
	}
	
	public static Collection<User> getAllUser(){
		return userMap.values();
	}
	
	public static User getByUserName(String userName){
		return userMap.get(userName);
	}
	
	public static boolean authenticate(User user){
		User u = userMap.get(user.getUserName());
		return ((u!=null) &&
				(u.getUserName().equals(user.getUserName())) && 
				(u.getPassword().equals(user.getPassword()))
		   	);
	}
}
