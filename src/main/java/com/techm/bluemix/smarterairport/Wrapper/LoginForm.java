package com.techm.bluemix.smarterairport.Wrapper;

public class LoginForm {
	
	private String USERNAME, PASSWORD;

	public String getUSERNAME() {
		return USERNAME;
	}

	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	@Override
	public String toString() {
		return "LoginForm [USERNAME=" + USERNAME + ", PASSWORD=" + PASSWORD + "]";
	}
	

}
