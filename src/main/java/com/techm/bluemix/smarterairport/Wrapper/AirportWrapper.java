package com.techm.bluemix.smarterairport.Wrapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AirportWrapper {
	
	private String fs,
	iata,
	icao,
	faa,
	name,
	street1,
	city,
	cityCode,
	stateCode,
	postalCode,
	countryCode,
	countryName,
	regionName,
	timeZoneRegionName,
	weatherZone,
	localTime,
	utcOffsetHours,
	latitude,
	longitude,
	elevationFeet,
	classification,
	delayIndexUrl,
	weatherUrl;
	private Boolean active;
	public String getFs() {
		return fs;
	}
	public void setFs(String fs) {
		this.fs = fs;
	}
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public String getIcao() {
		return icao;
	}
	public void setIcao(String icao) {
		this.icao = icao;
	}
	public String getFaa() {
		return faa;
	}
	public void setFaa(String faa) {
		this.faa = faa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public String getTimeZoneRegionName() {
		return timeZoneRegionName;
	}
	public void setTimeZoneRegionName(String timeZoneRegionName) {
		this.timeZoneRegionName = timeZoneRegionName;
	}
	public String getWeatherZone() {
		return weatherZone;
	}
	public void setWeatherZone(String weatherZone) {
		this.weatherZone = weatherZone;
	}
	public String getLocalTime() {
		return localTime;
	}
	public void setLocalTime(String localTime) {
		this.localTime = localTime;
	}
	public String getUtcOffsetHours() {
		return utcOffsetHours;
	}
	public void setUtcOffsetHours(String utcOffsetHours) {
		this.utcOffsetHours = utcOffsetHours;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getElevationFeet() {
		return elevationFeet;
	}
	public void setElevationFeet(String elevationFeet) {
		this.elevationFeet = elevationFeet;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getDelayIndexUrl() {
		return delayIndexUrl;
	}
	public void setDelayIndexUrl(String delayIndexUrl) {
		this.delayIndexUrl = delayIndexUrl;
	}
	public String getWeatherUrl() {
		return weatherUrl;
	}
	public void setWeatherUrl(String weatherUrl) {
		this.weatherUrl = weatherUrl;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "AirportWrapper [fs=" + fs + ", iata=" + iata + ", icao=" + icao + ", faa=" + faa + ", name=" + name
				+ ", street1=" + street1 + ", city=" + city + ", cityCode=" + cityCode + ", stateCode=" + stateCode
				+ ", postalCode=" + postalCode + ", countryCode=" + countryCode + ", countryName=" + countryName
				+ ", regionName=" + regionName + ", timeZoneRegionName=" + timeZoneRegionName + ", weatherZone="
				+ weatherZone + ", localTime=" + localTime + ", utcOffsetHours=" + utcOffsetHours + ", latitude="
				+ latitude + ", longitude=" + longitude + ", elevationFeet=" + elevationFeet + ", classification="
				+ classification + ", delayIndexUrl=" + delayIndexUrl + ", weatherUrl=" + weatherUrl + ", active="
				+ active + "]";
	} 

}
