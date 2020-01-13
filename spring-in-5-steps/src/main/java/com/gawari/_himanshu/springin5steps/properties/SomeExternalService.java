package com.gawari._himanshu.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

	// Value set from Property File -> external.service.url
	@Value("${external.service.url}")
	private String url;

	public String getUrl() {
		return url;
	}

}
