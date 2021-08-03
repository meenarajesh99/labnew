package com.labmanagement.entity;

/*class for User entity*/

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
       
        
		@Id
		private String username; 
		private String password; 
		
		
		
		public User() {
		super();
			
		}
		
		/*constructor for the class */
		public User(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}
		
		/*getter and setter methods */
		
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
