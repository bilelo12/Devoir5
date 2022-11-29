package com.bilel.users.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class User {
		
		public User() {
				super();
			}
		
		public User(Long user_id, String username, String password, Boolean enabled, List<Role> roles) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.roles = roles;
	}

		@Id
		@GeneratedValue (strategy=GenerationType.IDENTITY)
		private Long user_id;
		@Column(unique=true)
		private String username;
		private String password;
		private Boolean enabled;
		@ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
		@JoinTable(name="user_role",joinColumns = @JoinColumn (name="user_id") ,
		inverseJoinColumns = @JoinColumn (name="role_id"))

		private List<Role> roles;
		
		public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
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
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
		
		
		
		
		
		
}
