package com.hello.profile.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROFILE_TABLE")
public class ProfileModel {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		
		@Column(name="USERNAME")
		private String username;
		
		@Column(name="PASSWORD")
		private String pwd;

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

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		
		
		
		
		
		
	

	
	
	
	
	
	
	
	
}
