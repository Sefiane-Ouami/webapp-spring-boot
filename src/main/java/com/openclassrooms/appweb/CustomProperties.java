package com.openclassrooms.appweb;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;


@Data
@Configuration
@ConfigurationProperties(prefix="com.openclassrooms.appweb")
public class CustomProperties {

	private String apiUrl;
	
}