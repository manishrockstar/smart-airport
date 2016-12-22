package com.techm.bluemix.smarterairport.Wrapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class ForecastDayNightWrapper {
	
	private String fcst_valid,
	fcst_valid_local, day_ind;
	private String thunder_enum,
	daypart_name,
	long_daypart_name,
	alt_daypart_name,
	thunder_enum_phrase,
	num,
	temp,
	hi,
	wc,
	pop,
	icon_extd,
	icon_code,
	wxman,
	phrase_12char,
	phrase_22char,
	phrase_32char,
	subphrase_pt1,
	subphrase_pt2,
	subphrase_pt3,
	precip_type,
	rh,
	wspd,
	wdir,
	wdir_cardinal,
	clds,
	pop_phrase,
	temp_phrase,
	accumulation_phrase,
	wind_phrase,
	shortcast,
	narrative,
	qpf,
	snow_qpf,
	snow_range,
	snow_phrase,
	snow_code,
	vocal_key,
	qualifier_code,
	qualifier,
	uv_index_raw,
	uv_index,
	uv_warning,
	uv_desc,
	golf_index,
	golf_category;
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
	public String getDay_ind() {
		return day_ind;
	}
	public void setDay_ind(String day_ind) {
		this.day_ind = day_ind;
	}
	public String getThunder_enum() {
		return thunder_enum;
	}
	public void setThunder_enum(String thunder_enum) {
		this.thunder_enum = thunder_enum;
	}
	public String getDaypart_name() {
		return daypart_name;
	}
	public void setDaypart_name(String daypart_name) {
		this.daypart_name = daypart_name;
	}
	public String getLong_daypart_name() {
		return long_daypart_name;
	}
	public void setLong_daypart_name(String long_daypart_name) {
		this.long_daypart_name = long_daypart_name;
	}
	public String getAlt_daypart_name() {
		return alt_daypart_name;
	}
	public void setAlt_daypart_name(String alt_daypart_name) {
		this.alt_daypart_name = alt_daypart_name;
	}
	public String getThunder_enum_phrase() {
		return thunder_enum_phrase;
	}
	public void setThunder_enum_phrase(String thunder_enum_phrase) {
		this.thunder_enum_phrase = thunder_enum_phrase;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getHi() {
		return hi;
	}
	public void setHi(String hi) {
		this.hi = hi;
	}
	public String getWc() {
		return wc;
	}
	public void setWc(String wc) {
		this.wc = wc;
	}
	public String getPop() {
		return pop;
	}
	public void setPop(String pop) {
		this.pop = pop;
	}
	public String getIcon_extd() {
		return icon_extd;
	}
	public void setIcon_extd(String icon_extd) {
		this.icon_extd = icon_extd;
	}
	public String getIcon_code() {
		return icon_code;
	}
	public void setIcon_code(String icon_code) {
		this.icon_code = icon_code;
	}
	public String getWxman() {
		return wxman;
	}
	public void setWxman(String wxman) {
		this.wxman = wxman;
	}
	public String getPhrase_12char() {
		return phrase_12char;
	}
	public void setPhrase_12char(String phrase_12char) {
		this.phrase_12char = phrase_12char;
	}
	public String getPhrase_22char() {
		return phrase_22char;
	}
	public void setPhrase_22char(String phrase_22char) {
		this.phrase_22char = phrase_22char;
	}
	public String getPhrase_32char() {
		return phrase_32char;
	}
	public void setPhrase_32char(String phrase_32char) {
		this.phrase_32char = phrase_32char;
	}
	public String getSubphrase_pt1() {
		return subphrase_pt1;
	}
	public void setSubphrase_pt1(String subphrase_pt1) {
		this.subphrase_pt1 = subphrase_pt1;
	}
	public String getSubphrase_pt2() {
		return subphrase_pt2;
	}
	public void setSubphrase_pt2(String subphrase_pt2) {
		this.subphrase_pt2 = subphrase_pt2;
	}
	public String getSubphrase_pt3() {
		return subphrase_pt3;
	}
	public void setSubphrase_pt3(String subphrase_pt3) {
		this.subphrase_pt3 = subphrase_pt3;
	}
	public String getPrecip_type() {
		return precip_type;
	}
	public void setPrecip_type(String precip_type) {
		this.precip_type = precip_type;
	}
	public String getRh() {
		return rh;
	}
	public void setRh(String rh) {
		this.rh = rh;
	}
	public String getWspd() {
		return wspd;
	}
	public void setWspd(String wspd) {
		this.wspd = wspd;
	}
	public String getWdir() {
		return wdir;
	}
	public void setWdir(String wdir) {
		this.wdir = wdir;
	}
	public String getWdir_cardinal() {
		return wdir_cardinal;
	}
	public void setWdir_cardinal(String wdir_cardinal) {
		this.wdir_cardinal = wdir_cardinal;
	}
	public String getClds() {
		return clds;
	}
	public void setClds(String clds) {
		this.clds = clds;
	}
	public String getPop_phrase() {
		return pop_phrase;
	}
	public void setPop_phrase(String pop_phrase) {
		this.pop_phrase = pop_phrase;
	}
	public String getTemp_phrase() {
		return temp_phrase;
	}
	public void setTemp_phrase(String temp_phrase) {
		this.temp_phrase = temp_phrase;
	}
	public String getAccumulation_phrase() {
		return accumulation_phrase;
	}
	public void setAccumulation_phrase(String accumulation_phrase) {
		this.accumulation_phrase = accumulation_phrase;
	}
	public String getWind_phrase() {
		return wind_phrase;
	}
	public void setWind_phrase(String wind_phrase) {
		this.wind_phrase = wind_phrase;
	}
	public String getShortcast() {
		return shortcast;
	}
	public void setShortcast(String shortcast) {
		this.shortcast = shortcast;
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
	public String getVocal_key() {
		return vocal_key;
	}
	public void setVocal_key(String vocal_key) {
		this.vocal_key = vocal_key;
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
	public String getUv_index_raw() {
		return uv_index_raw;
	}
	public void setUv_index_raw(String uv_index_raw) {
		this.uv_index_raw = uv_index_raw;
	}
	public String getUv_index() {
		return uv_index;
	}
	public void setUv_index(String uv_index) {
		this.uv_index = uv_index;
	}
	public String getUv_warning() {
		return uv_warning;
	}
	public void setUv_warning(String uv_warning) {
		this.uv_warning = uv_warning;
	}
	public String getUv_desc() {
		return uv_desc;
	}
	public void setUv_desc(String uv_desc) {
		this.uv_desc = uv_desc;
	}
	public String getGolf_index() {
		return golf_index;
	}
	public void setGolf_index(String golf_index) {
		this.golf_index = golf_index;
	}
	public String getGolf_category() {
		return golf_category;
	}
	public void setGolf_category(String golf_category) {
		this.golf_category = golf_category;
	}
	@Override
	public String toString() {
		return "ForecastDayNightWrapper [fcst_valid=" + fcst_valid + ", fcst_valid_local=" + fcst_valid_local
				+ ", day_ind=" + day_ind + ", thunder_enum=" + thunder_enum + ", daypart_name=" + daypart_name
				+ ", long_daypart_name=" + long_daypart_name + ", alt_daypart_name=" + alt_daypart_name
				+ ", thunder_enum_phrase=" + thunder_enum_phrase + ", num=" + num + ", temp=" + temp + ", hi=" + hi
				+ ", wc=" + wc + ", pop=" + pop + ", icon_extd=" + icon_extd + ", icon_code=" + icon_code + ", wxman="
				+ wxman + ", phrase_12char=" + phrase_12char + ", phrase_22char=" + phrase_22char + ", phrase_32char="
				+ phrase_32char + ", subphrase_pt1=" + subphrase_pt1 + ", subphrase_pt2=" + subphrase_pt2
				+ ", subphrase_pt3=" + subphrase_pt3 + ", precip_type=" + precip_type + ", rh=" + rh + ", wspd=" + wspd
				+ ", wdir=" + wdir + ", wdir_cardinal=" + wdir_cardinal + ", clds=" + clds + ", pop_phrase="
				+ pop_phrase + ", temp_phrase=" + temp_phrase + ", accumulation_phrase=" + accumulation_phrase
				+ ", wind_phrase=" + wind_phrase + ", shortcast=" + shortcast + ", narrative=" + narrative + ", qpf="
				+ qpf + ", snow_qpf=" + snow_qpf + ", snow_range=" + snow_range + ", snow_phrase=" + snow_phrase
				+ ", snow_code=" + snow_code + ", vocal_key=" + vocal_key + ", qualifier_code=" + qualifier_code
				+ ", qualifier=" + qualifier + ", uv_index_raw=" + uv_index_raw + ", uv_index=" + uv_index
				+ ", uv_warning=" + uv_warning + ", uv_desc=" + uv_desc + ", golf_index=" + golf_index
				+ ", golf_category=" + golf_category + "]";
	}
	
	
}
