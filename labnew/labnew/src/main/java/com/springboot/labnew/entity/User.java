package com.springboot.labnew.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;



@Entity
@Table(name="user")
public class User {
       
        
		

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String email;
		private String username; 
		private String password; 
		
		
		@Transient
		private String passwordConfirm;
		
//		@Transient
//		private boolean admin = false;
//		
//		@Transient
//		private String adminPassword;
		
		@ManyToMany
		private Set<Role> roles;
		


		

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

		public String getPasswordConfirm() {
			return passwordConfirm;
		}

		public void setPasswordConfirm(String passwordConfirm) {
			this.passwordConfirm = passwordConfirm;
		}

		public Set<Role> getRoles() {
			return roles;
		}

		public void setRoles(Set<Role> roles) {
			this.roles = roles;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		 
		
		public void addRole(Role role) {
			this.roles.add(role);
			
		}
		
//		public boolean isAdmin() {
//			return admin;
//		}
//		
//		public void setAdmin(boolean isAdmin) {
//			this.admin = isAdmin;
//		}
//		
//		public String getAdminPassword() {
//			return adminPassword;
//		}
//		
//		public void setAdminPassword(String adminPassword) {
//			this.adminPassword = adminPassword;
//		}

}
