package com.techm.bluemix.smarterairport.Wrapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.text.*;

@JsonIgnoreProperties(ignoreUnknown=true)
public class DepartureWrapper {
	
	private String dateLocal, dateUTC;


	public String getDateLocal() throws ParseException{
	DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	DateFormat outputFormat = new SimpleDateFormat("'Date : 'dd-MM-yyyy\n'Time : 'KK:mm a");
	return outputFormat.format(inputFormat.parse(dateLocal));
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
