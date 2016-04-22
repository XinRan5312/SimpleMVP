package com.xinran.testmvp.model.impl;


import com.xinran.testmvp.bean.UserBean;
import com.xinran.testmvp.model.IUserModel;

/**
 * Created by qixinh on 16/4/18.
 */
public class UserModel implements IUserModel {

	@Override
	public void setID(int id) {

	}

	@Override
	public void setFirstName(String firstName) {

	}

	@Override
	public void setLastName(String lastName) {

	}

	@Override
	public int getID() {

		return 0;
	}

	@Override
	public UserBean load(int id) {

		return new UserBean("11", "22");
	}

}
