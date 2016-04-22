package com.xinran.testmvp.bean;
/**
 * Created by qixinh on 16/4/18.
 */
public class UserBean {
	private String mFirstName;
	private String mLastName;

	public UserBean(String firstName, String lastName) {
		this.mFirstName = firstName;
		this.mLastName = lastName;
	}

	public String getFirstName() {
		return mFirstName;
	}

	public String getLastName() {
		return mLastName;
	}
}
