package com.techm.bluemix.smarterairport.Wrapper;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="SIGNUP")
public class UserWrapper {
	@Column
	private String NAME;
	@Column
	private String USERNAME;
	@Column
	private String EMAIL;
	@Column
	private int CONTACT;
	@Column
	private String PASSWORD; 
	
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
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
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public int getCONTACT() {
		return CONTACT;
	}
	public void setCONTACT(int cONTACT) {
		CONTACT = cONTACT;
	}
	@Override
	public String toString() {
		return "UserWrapper [NAME=" + NAME + ", USERNAME=" + USERNAME + ", EMAIL=" + EMAIL
				+ ", CONTACT=" + CONTACT + ", PASSWORD=" + PASSWORD + "]";
	}
	
	
	
}
