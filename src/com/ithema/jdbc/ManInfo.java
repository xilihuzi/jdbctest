package com.ithema.jdbc;

public class ManInfo {
	private int id;
	private int patientId;
	private String AbInfo;
	private String time;
	private String name;
	private String username;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getAbInfo() {
		return AbInfo;
	}
	public void setAbInfo(String abInfo) {
		AbInfo = abInfo;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
