package com.techm.bluemix.smarterairport.ServiceImpl;

import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.URI;
import org.apache.http.client.HttpClient;
import org.apache.http.protocol.HttpContext;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

public class ContextAwareHttpComponentsClientHttpRequestFactory extends
		HttpComponentsClientHttpRequestFactory {
	private HttpContext httpContext;
	
	public ContextAwareHttpComponentsClientHttpRequestFactory(HttpClient httpClient){
		super(httpClient);
	}
	
    protected HttpContext createHttpContext(HttpMethod httpMethod, URI uri) {
    	//Ignoring the URI and method.
        return httpContext;
    }

	public void setHttpContext(HttpContext httpContext) {
		this.httpContext = httpContext;
	}
}