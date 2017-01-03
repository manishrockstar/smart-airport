package com.techm.bluemix.smarterairport.Wrapper;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="SIGNUP")
public class User {
	@Column
	private String NAME;
	@Id
	@Column
	private String USERNAME;
	@Column
	private String EMAIL;
	@Column
	private int CONTACT;
	@Column
	private String PASSWORD; 
	private String PASSWORD1; 
	
	public String getPASSWORD1() {
		return PASSWORD1;
	}
	public void setPASSWORD1(String pASSWORD1) {
		PASSWORD1 = pASSWORD1;
	}
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
	public void setCONTACT(int contact) {
		CONTACT = contact;
	}
	@Override
	public String toString() {
		return "UserWrapper [NAME=" + NAME + ", USERNAME=" + USERNAME + ", EMAIL=" + EMAIL
				+ ", CONTACT=" + CONTACT + ", PASSWORD=" + PASSWORD + "]";
	}
	
	
	
}
