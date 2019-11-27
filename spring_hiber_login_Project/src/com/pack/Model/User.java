package com.pack.Model;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

	@Entity
	@Table(name="LoginTable")
	public class User {
	@Id
	@GeneratedValue
	@Column(name="id")
	int id;
	@Column(name="uname")
	@NotEmpty(message="uname cannot be empty")
	String username;
	@Column(name="pwd")
	@Size(min=5,message="Min 5 chars required")
	String password;

	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getUsername() {
	return username;
	}
	public void setUsername(String username) {
	this.username = username;
	}
	public String getPassword() {
	return password;
	}
	public void setPassword(String password) {
	this.password = password;
	}

	}
//	package com.pack.Service;
//
//	import com.pack.Model.User;
//
//	public interface IUserService {
//	 public void addUser(User user);
//	 public void deleteUser(int id);
//	}
//	package com.pack.Service;
//
//	import org.springframework.beans.factory.annotation.Autowired;
//
//	import com.pack.Dao.UsrDao;
//	import com.pack.Model.User;
//	public class UsrService implements IUserService{
//		@Autowired
//		private UsrDao userDao;
//
//		public void addUser(User user) {
//			
//			userDao.addUser(user);
//		}
//
//		public void deleteUser(int id) {
//			userDao.deleteUser(id);
//			
//		}
//
//	}

