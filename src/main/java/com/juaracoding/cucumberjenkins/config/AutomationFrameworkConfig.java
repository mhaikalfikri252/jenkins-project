package com.juaracoding.cucumberjenkins.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan("com.juaracoding.cucumber4")
public class AutomationFrameworkConfig {

	public AutomationFrameworkConfig() {

	}
}
