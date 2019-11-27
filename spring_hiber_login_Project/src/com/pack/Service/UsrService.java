package com.pack.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.pack.Dao.UsrDao;
import com.pack.Model.User;

public class UsrService implements IUsrService {
	@Autowired
	private UsrDao userDao;
	
	public void addUser(User user) {
		
		userDao.addUser(user);
	}


	public void deleteUser(int id) {
		
		userDao.deleteUser(id);
	}
	
	
}
