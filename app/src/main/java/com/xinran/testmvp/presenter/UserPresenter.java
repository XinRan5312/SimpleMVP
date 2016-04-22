package com.xinran.testmvp.presenter;


import com.xinran.testmvp.bean.UserBean;
import com.xinran.testmvp.model.IUserModel;
import com.xinran.testmvp.model.impl.UserModel;
import com.xinran.testmvp.view.IUserView;
/**
 * Created by qixinh on 16/4/18.
 */
public class UserPresenter {
	private IUserView mUserView;
	private IUserModel mUserModel;

	public UserPresenter(IUserView view) {
		mUserView = view;
		mUserModel = (IUserModel) new UserModel();
	}

	public void saveUser(int id, String firstName, String lastName) {
		mUserModel.setID(id);
		mUserModel.setFirstName(firstName);
		mUserModel.setLastName(lastName);
	}

	public void loadUser(int id) {
		UserBean user = mUserModel.load(id);
		mUserView.setFirstName(user.getFirstName());
		mUserView.setLastName(user.getLastName());
	}
}
