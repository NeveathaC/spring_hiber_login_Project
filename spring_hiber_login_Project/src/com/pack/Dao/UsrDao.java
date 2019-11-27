package com.pack.Dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;


import com.pack.Model.User;

public class UsrDao implements IUserDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
	}

	@Override
	public void deleteUser(int id) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String hql="delete from LoginTable where id=:id";
		Query query=(Query) session.createQuery(hql);
		query.setParameter("id",id);
		int r=query.executeUpdate();
		System.out.println(r);
		tx.commit();
		session.close();
	}

}
