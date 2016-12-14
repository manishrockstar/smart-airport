package com.techm.bluemix.smarterairport.Wrapper;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CodesharesWrapper {
	
	private String fsCode,flightNumber,relationship;

	@Override
	public String toString() {
		return "CodesharesWrapper [fsCode=" + fsCode + ", flightNumber=" + flightNumber + ", relationship="
				+ relationship + "]";
	}

	public String getFsCode() {
		return fsCode;
	}

	public void setFsCode(String fsCode) {
		this.fsCode = fsCode;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

}
