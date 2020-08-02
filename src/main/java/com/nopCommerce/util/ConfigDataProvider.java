package com.nopCommerce.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties properties;

	public ConfigDataProvider() {

		try {
			File src = new File("./Config/config.properties");
			FileInputStream fis = new FileInputStream(src);
			properties = new Properties();
			properties.load(fis);
		} catch (Exception e) {
			System.out.println("Cannor read config file");
			e.getMessage();
		}

	}

	public String getBrowser() {
		System.out.println(properties.getProperty("browser"));

		return properties.getProperty("browser");

	}

	public String getUrl() {

		return properties.getProperty("url");

	}

	public String getConfigData(String key) {

		return properties.getProperty(key);

	}

	public String getreportConfigPath() {
		
		String reportConfigPath = properties.getProperty("reportConfigPath");
		
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");

	}

}
