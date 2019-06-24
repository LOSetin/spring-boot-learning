package com.bootExample.demo.javabean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="student")
public class StudentProperties {
	private String name;
	private Integer age;

}
