package com.example.logindanregister.model.login;

import com.google.gson.annotations.SerializedName;

public class LoginData {

	@SerializedName("password")
	private String password;

	@SerializedName("user_id")
	private String userId;

	@SerializedName("username")
	private String username;

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return userId;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}


}