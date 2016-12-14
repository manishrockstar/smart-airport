package com.techm.bluemix.smarterairport.Wrapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class DepartureWrapper {
	
	private String dateLocal, dateUTC;

	public String getDateLocal() {
		return dateLocal;
	}

	public void setDateLocal(String dateLocal) {
		this.dateLocal = dateLocal;
	}

	public String getDateUTC() {
		return dateUTC;
	}

	public void setDateUTC(String dateUTC) {
		this.dateUTC = dateUTC;
	}

	@Override
	public String toString() {
		return "DepartureWrapper [dateLocal=" + dateLocal + ", dateUTC=" + dateUTC + "]";
	}
	
}
