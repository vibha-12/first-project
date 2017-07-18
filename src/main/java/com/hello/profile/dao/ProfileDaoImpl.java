package com.hello.profile.dao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.hello.profile.model.ProfileModel;
@Transactional
@Repository
public class ProfileDaoImpl implements ProfileDao {
	@PersistenceContext	
	private EntityManager entityManager;
	@Override
	public void saveProfile(ProfileModel profile) {
		// TODO Auto-generated method stub
		entityManager.persist(profile);
	}


}
