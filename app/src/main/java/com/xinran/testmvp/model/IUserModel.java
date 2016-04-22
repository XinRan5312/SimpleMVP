package com.xinran.testmvp.model;
/**
 * Created by qixinh on 16/4/18.
 */
import com.xinran.testmvp.bean.UserBean;

public interface IUserModel {
	void setID(int id);

	void setFirstName(String firstName);

	void setLastName(String lastName);

	int getID();

	UserBean load(int id);
}
