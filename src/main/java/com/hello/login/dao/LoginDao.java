package com.hello.login.dao;

import java.util.List;

import com.hello.profile.model.ProfileModel;

public interface LoginDao {

	List<String> compare(ProfileModel loginModel);

}
