package com.techm.bluemix.smarterairport.Wrapper;

public class V_Validation {
	String databaseHost;
	int port;
	String databaseName;
    String user;
	String pasword;
	String url;
	public String getDatabaseHost() {
		return databaseHost;
	}
	public void setDatabaseHost(String databaseHost) {
		this.databaseHost = databaseHost;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getDatabaseName() {
		return databaseName;
	}
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Validation [databaseHost=" + databaseHost + ", port=" + port + ", databaseName=" + databaseName
				+ ", user=" + user + ", pasword=" + pasword + ", url=" + url + "]";
	}
	

}
