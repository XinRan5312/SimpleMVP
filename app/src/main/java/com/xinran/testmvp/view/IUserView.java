package com.xinran.testmvp.view;

/**
 * Created by qixinh on 16/4/18.
 */
public interface IUserView {
	int getID();

	String getFristName();

	String getLastName();

	void setFirstName(String firstName);

	void setLastName(String lastName);
}
