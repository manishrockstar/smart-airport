package com.techm.bluemix.smarterairport.Wrapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ForecastWrapper {
	
	
	@JsonProperty("class")
	private String clss;
	private String expire_time_gmt,
	fcst_valid,
	fcst_valid_local,
	num,
	max_temp,
	min_temp,
	torcon,
	stormcon,
	blurb,
	blurb_author,
	lunar_phase_day,
	dow,
	lunar_phase,
	lunar_phase_code,
	sunrise,
	sunset,
	moonrise,
	moonset,
	qualifier_code,
	qualifier,
	narrative,
	qpf,
	snow_qpf,
	snow_range,
	snow_phrase,
	snow_code;
	@JsonProperty("night")
	ForecastDayNightWrapper night;
	@JsonProperty("day")
	ForecastDayNightWrapper day;
	public String getClss() {
		return clss;
	}
	public void setClss(String clss) {
		this.clss = clss;
	}
	public String getExpire_time_gmt() {
		return expire_time_gmt;
	}
	public void setExpire_time_gmt(String expire_time_gmt) {
		this.expire_time_gmt = expire_time_gmt;
	}
	public String getFcst_valid() {
		return fcst_valid;
	}
	public void setFcst_valid(String fcst_valid) {
		this.fcst_valid = fcst_valid;
	}
	public String getFcst_valid_local() {
		return fcst_valid_local;
	}
	public void setFcst_valid_local(String fcst_valid_local) {
		this.fcst_valid_local = fcst_valid_local;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getMax_temp() {
		return max_temp;
	}
	public void setMax_temp(String max_temp) {
		this.max_temp = max_temp;
	}
	public String getMin_temp() {
		return min_temp;
	}
	public void setMin_temp(String min_temp) {
		this.min_temp = min_temp;
	}
	public String getTorcon() {
		return torcon;
	}
	public void setTorcon(String torcon) {
		this.torcon = torcon;
	}
	public String getStormcon() {
		return stormcon;
	}
	public void setStormcon(String stormcon) {
		this.stormcon = stormcon;
	}
	public String getBlurb() {
		return blurb;
	}
	public void setBlurb(String blurb) {
		this.blurb = blurb;
	}
	public String getBlurb_author() {
		return blurb_author;
	}
	public void setBlurb_author(String blurb_author) {
		this.blurb_author = blurb_author;
	}
	public String getLunar_phase_day() {
		return lunar_phase_day;
	}
	public void setLunar_phase_day(String lunar_phase_day) {
		this.lunar_phase_day = lunar_phase_day;
	}
	public String getDow() {
		return dow;
	}
	public void setDow(String dow) {
		this.dow = dow;
	}
	public String getLunar_phase() {
		return lunar_phase;
	}
	public void setLunar_phase(String lunar_phase) {
		this.lunar_phase = lunar_phase;
	}
	public String getLunar_phase_code() {
		return lunar_phase_code;
	}
	public void setLunar_phase_code(String lunar_phase_code) {
		this.lunar_phase_code = lunar_phase_code;
	}
	public String getSunrise() {
		return sunrise;
	}
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	public String getSunset() {
		return sunset;
	}
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	public String getMoonrise() {
		return moonrise;
	}
	public void setMoonrise(String moonrise) {
		this.moonrise = moonrise;
	}
	public String getMoonset() {
		return moonset;
	}
	public void setMoonset(String moonset) {
		this.moonset = moonset;
	}
	public String getQualifier_code() {
		return qualifier_code;
	}
	public void setQualifier_code(String qualifier_code) {
		this.qualifier_code = qualifier_code;
	}
	public String getQualifier() {
		return qualifier;
	}
	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
	}
	public String getNarrative() {
		return narrative;
	}
	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}
	public String getQpf() {
		return qpf;
	}
	public void setQpf(String qpf) {
		this.qpf = qpf;
	}
	public String getSnow_qpf() {
		return snow_qpf;
	}
	public void setSnow_qpf(String snow_qpf) {
		this.snow_qpf = snow_qpf;
	}
	public String getSnow_range() {
		return snow_range;
	}
	public void setSnow_range(String snow_range) {
		this.snow_range = snow_range;
	}
	public String getSnow_phrase() {
		return snow_phrase;
	}
	public void setSnow_phrase(String snow_phrase) {
		this.snow_phrase = snow_phrase;
	}
	public String getSnow_code() {
		return snow_code;
	}
	public void setSnow_code(String snow_code) {
		this.snow_code = snow_code;
	}
	public ForecastDayNightWrapper getNight() {
		return night;
	}
	public void setNight(ForecastDayNightWrapper night) {
		this.night = night;
	}
	public ForecastDayNightWrapper getDay() {
		return day;
	}
	public void setDay(ForecastDayNightWrapper day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "ForecastWrapper [clss=" + clss + ", expire_time_gmt=" + expire_time_gmt + ", fcst_valid=" + fcst_valid
				+ ", fcst_valid_local=" + fcst_valid_local + ", num=" + num + ", max_temp=" + max_temp + ", min_temp="
				+ min_temp + ", torcon=" + torcon + ", stormcon=" + stormcon + ", blurb=" + blurb + ", blurb_author="
				+ blurb_author + ", lunar_phase_day=" + lunar_phase_day + ", dow=" + dow + ", lunar_phase="
				+ lunar_phase + ", lunar_phase_code=" + lunar_phase_code + ", sunrise=" + sunrise + ", sunset=" + sunset
				+ ", moonrise=" + moonrise + ", moonset=" + moonset + ", qualifier_code=" + qualifier_code
				+ ", qualifier=" + qualifier + ", narrative=" + narrative + ", qpf=" + qpf + ", snow_qpf=" + snow_qpf
				+ ", snow_range=" + snow_range + ", snow_phrase=" + snow_phrase + ", snow_code=" + snow_code
				+ ", night=" + night + ", day=" + day + "]";
	}
	
}
