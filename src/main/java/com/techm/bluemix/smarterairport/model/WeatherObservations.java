package com.techm.bluemix.smarterairport.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherObservations {
	
	private String key,
    clss,
    expire_time_gmt,
    obs_id,
    obs_name,
    valid_time_gmt,
    wx_icon,
    icon_extd,
    temp,
    wx_phrase,
    pressure_desc,
    pressure_tend,
    wdir_cardinal,
    day_ind,
    max_temp,
    min_temp,
    dewpt,
    rh,
    feels_like,
    heat_index,
    wc,
    qualifier,
    qualifier_svrty,
    blunt_phrase,
    terse_phrase,
    pressure,
    clds,
    vis,
    wspd,
    gust,
    wdir,
    precip_total,
    precip_hrly,
    snow_hrly,
    uv_index,
    uv_desc;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

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

	public String getObs_id() {
		return obs_id;
	}

	public void setObs_id(String obs_id) {
		this.obs_id = obs_id;
	}

	public String getObs_name() {
		return obs_name;
	}

	public void setObs_name(String obs_name) {
		this.obs_name = obs_name;
	}

	public String getValid_time_gmt() {
		return valid_time_gmt;
	}

	public void setValid_time_gmt(String valid_time_gmt) {
		this.valid_time_gmt = valid_time_gmt;
	}

	public String getWx_icon() {
		return wx_icon;
	}

	public void setWx_icon(String wx_icon) {
		this.wx_icon = wx_icon;
	}

	public String getIcon_extd() {
		return icon_extd;
	}

	public void setIcon_extd(String icon_extd) {
		this.icon_extd = icon_extd;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getWx_phrase() {
		return wx_phrase;
	}

	public void setWx_phrase(String wx_phrase) {
		this.wx_phrase = wx_phrase;
	}

	public String getPressure_desc() {
		return pressure_desc;
	}

	public void setPressure_desc(String pressure_desc) {
		this.pressure_desc = pressure_desc;
	}

	public String getPressure_tend() {
		return pressure_tend;
	}

	public void setPressure_tend(String pressure_tend) {
		this.pressure_tend = pressure_tend;
	}

	public String getWdir_cardinal() {
		return wdir_cardinal;
	}

	public void setWdir_cardinal(String wdir_cardinal) {
		this.wdir_cardinal = wdir_cardinal;
	}

	public String getDay_ind() {
		return day_ind;
	}

	public void setDay_ind(String day_ind) {
		this.day_ind = day_ind;
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

	public String getDewpt() {
		return dewpt;
	}

	public void setDewpt(String dewpt) {
		this.dewpt = dewpt;
	}

	public String getRh() {
		return rh;
	}

	public void setRh(String rh) {
		this.rh = rh;
	}

	public String getFeels_like() {
		return feels_like;
	}

	public void setFeels_like(String feels_like) {
		this.feels_like = feels_like;
	}

	public String getHeat_index() {
		return heat_index;
	}

	public void setHeat_index(String heat_index) {
		this.heat_index = heat_index;
	}

	public String getWc() {
		return wc;
	}

	public void setWc(String wc) {
		this.wc = wc;
	}

	public String getQualifier() {
		return qualifier;
	}

	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
	}

	public String getQualifier_svrty() {
		return qualifier_svrty;
	}

	public void setQualifier_svrty(String qualifier_svrty) {
		this.qualifier_svrty = qualifier_svrty;
	}

	public String getBlunt_phrase() {
		return blunt_phrase;
	}

	public void setBlunt_phrase(String blunt_phrase) {
		this.blunt_phrase = blunt_phrase;
	}

	public String getTerse_phrase() {
		return terse_phrase;
	}

	public void setTerse_phrase(String terse_phrase) {
		this.terse_phrase = terse_phrase;
	}

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	public String getClds() {
		return clds;
	}

	public void setClds(String clds) {
		this.clds = clds;
	}

	public String getVis() {
		return vis;
	}

	public void setVis(String vis) {
		this.vis = vis;
	}

	public String getWspd() {
		return wspd;
	}

	public void setWspd(String wspd) {
		this.wspd = wspd;
	}

	public String getGust() {
		return gust;
	}

	public void setGust(String gust) {
		this.gust = gust;
	}

	public String getWdir() {
		return wdir;
	}

	public void setWdir(String wdir) {
		this.wdir = wdir;
	}

	public String getPrecip_total() {
		return precip_total;
	}

	public void setPrecip_total(String precip_total) {
		this.precip_total = precip_total;
	}

	public String getPrecip_hrly() {
		return precip_hrly;
	}

	public void setPrecip_hrly(String precip_hrly) {
		this.precip_hrly = precip_hrly;
	}

	public String getSnow_hrly() {
		return snow_hrly;
	}

	public void setSnow_hrly(String snow_hrly) {
		this.snow_hrly = snow_hrly;
	}

	public String getUv_index() {
		return uv_index;
	}

	public void setUv_index(String uv_index) {
		this.uv_index = uv_index;
	}

	public String getUv_desc() {
		return uv_desc;
	}

	public void setUv_desc(String uv_desc) {
		this.uv_desc = uv_desc;
	}
	

}
