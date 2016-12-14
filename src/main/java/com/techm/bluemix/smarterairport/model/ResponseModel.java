package com.techm.bluemix.smarterairport.model;

import java.util.Map;

public class ResponseModel {
	private String responseBody;
	private int responseCode;
	private Map<String, String> responseHeaders;

	/**
	 * @return the responseBody
	 */
	public String getResponseBody() {
		return responseBody;
	}

	/**
	 * @param responseBody
	 *            the responseBody to set
	 */
	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}

	/**
	 * @return the responseCode
	 */
	public int getResponseCode() {
		return responseCode;
	}

	/**
	 * @param responseCode
	 *            the responseCode to set
	 */
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	/**
	 * @return the responseHeaders
	 */
	public Map<String, String> getResponseHeaders() {
		return responseHeaders;
	}

	/**
	 * @param responseHeaders
	 *            the responseHeaders to set
	 */
	public void setResponseHeaders(Map<String, String> responseHeaders) {
		this.responseHeaders = responseHeaders;
	}

	@Override
	public String toString() {
		return "ResponseModel [responseBody=" + responseBody + ", responseCode=" + responseCode + ", responseHeaders="
				+ responseHeaders + "]";
	}
}