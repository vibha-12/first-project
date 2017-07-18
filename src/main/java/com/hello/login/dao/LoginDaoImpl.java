package com.hello.login.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.hello.profile.model.ProfileModel;
@Transactional
@Repository

public class LoginDaoImpl implements LoginDao {
	@PersistenceContext	
	private EntityManager entityManager;
	
	@Override
	public List<String> compare(ProfileModel loginModel) {
		// TODO Auto-generated method stub
		String user="'"+loginModel.getUsername()+"'";
		String pwd="'"+loginModel.getPwd()+"'";
		System.out.println("-----*****printing s ******-----"+user);
		System.out.println("-----*****printing s ******-----"+pwd);
					 Query query = entityManager.createQuery("Select username from ProfileModel where username="+user+" and pwd="+pwd);
				      List<String> list = query.getResultList();
						System.out.println("-----*****printing list ******-----"+list);

		return list;
	}

}
